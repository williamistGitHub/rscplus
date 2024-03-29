package Game;

public class Renderer3D {

    public static void addModelToScene(Object scene, Model model) {
        try {
            Reflection.addModel.setAccessible(true);
            Reflection.addModel.invoke(scene, model.instance, (byte) 118);
            Reflection.addModel.setAccessible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int rgbToFaceFill(int r, int g, int b) {
        return (int) -Math.floor(((r / 8) << 10) | ((g / 8) << 5) | (b / 8)) - 1;
    }

    private static final Model trueTileModel = Model.newTileSquare(rgbToFaceFill(255, 0, 0));

    public static void onSceneClear(Object scene) {
        // when the scene is cleared, re-add our model to it
        // to make sure it's always there
        addModelToScene(scene, trueTileModel);
    }

    public static void preRender3d(Object scene) {
        int px = Client.localRegionX * 128;
        int py = Client.localRegionY * 128;

        // put on the ground
        int[] vertexY = trueTileModel.getVertexY();
        vertexY[0] = -Client.getElevation(px, py) - 16;
        vertexY[1] = -Client.getElevation(px, py + 128) - 16;
        vertexY[2] = -Client.getElevation(px + 128, py + 128) - 16;
        vertexY[3] = -Client.getElevation(px + 128, py) - 16;

        // move to player position
        trueTileModel.setPosition(px, 0, py);
    }

    public static void postRender3d() {
        // so uhh this is called after the game renders 3d stuff, but before the game renders 2d stuff
        // very epic methinks

    }

}
