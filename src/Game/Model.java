package Game;

import java.lang.reflect.InvocationTargetException;

/*

 Wrapper for the model class in the jar.

 */
public class Model {

    public final Object instance;

    private Model(Object instance) {
        this.instance = instance;
    }

    private static Object constructorHelper(int vertices, int faces) {
        try {
            return Reflection.gameModelConstructor.newInstance(vertices, faces);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Model(int vertices, int faces) {
        this(constructorHelper(vertices, faces));
    }

    public int[] getVertexY() {
        try {
            return (int[]) Reflection.gameModelVertexY.get(instance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getOrAddVertex(int x, int y, int z) {
        try {
            Reflection.gameModelGetOrAddVertex.setAccessible(true);
            int i = (Integer) Reflection.gameModelGetOrAddVertex.invoke(instance, x, z, y, -126);
            Reflection.gameModelGetOrAddVertex.setAccessible(false);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int createFace(int[] vertices, int frontFill, int backFill) {
        try {
            Reflection.gameModelCreateFace.setAccessible(true);
            int i = (Integer) Reflection.gameModelCreateFace.invoke(instance, vertices.length, vertices, frontFill, backFill, false);
            Reflection.gameModelCreateFace.setAccessible(false);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void setLight(boolean gouraud, int ambient, int diffuse, int x, int y, int z) {
        try {
            Reflection.gameModelSetLight.setAccessible(true);
            Reflection.gameModelSetLight.invoke(instance, y, ambient, z, x, gouraud, diffuse, -95);
            Reflection.gameModelSetLight.setAccessible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPosition(int x, int y, int z) {
        try {
            Reflection.gameModelSetPosition.setAccessible(true);
            Reflection.gameModelSetPosition.invoke(instance, y, -120, z, x);
            Reflection.gameModelSetPosition.setAccessible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Model newTileSquare(int color) {
        Model model = new Model(4, 1);
        int v1 = model.getOrAddVertex(0, 0, 0);
        int v2 = model.getOrAddVertex(0, 0, 128);
        int v3 = model.getOrAddVertex(128, 0, 128);
        int v4 = model.getOrAddVertex(128, 0, 0);
        model.createFace(new int[]{v1, v2, v3, v4}, -1, color);
        model.setLight(false, 60, 24, -50, -10, -50);
        return model;
    }

}
