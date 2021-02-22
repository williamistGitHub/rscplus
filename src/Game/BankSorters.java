package Game;

// ordered lists used for filtering
public class BankSorters {
  // item metadata
  static final int[] itemValues = {
    63, 91, 238, 168, 20, 84, 154, 210, 560, 280, 1, 2, 56, 6, 4, 21, 6, 6, 1, 4, 1, 2, 6, 2, 35, 1,
    1, 1, 35, 2, 1, 4, 4, 4, 4, 3, 3, 1, 20, 1, 7, 10, 12, 1, 200, 200, 15, 1, 1, 5, 6, 1, 50, 1, 1,
    1, 1, 1, 1, 4, 70, 1, 10, 125, 325, 800, 26, 325, 845, 2080, 40, 140, 500, 1300, 3200, 32000,
    80, 280, 1000, 2600, 6400, 64000, 32, 112, 400, 1040, 2560, 16, 200, 182, 650, 1690, 4160,
    41600, 18, 225, 585, 1440, 14400, 1, 15, 1500, 1500, 1500, 24, 300, 780, 1920, 44, 550, 1430,
    3520, 35200, 60, 750, 1950, 4800, 160, 2000, 5200, 12800, 1000, 2600, 6400, 48, 600, 1560, 3840,
    68, 850, 2210, 5440, 4, 1, 1, 1, 10, 1, 12, 1, 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 3, 17, 150, 162,
    400, 45, 1, 200, 100, 50, 25, 2000, 1000, 500, 250, 1, 1, 1, 1, 8, 28, 100, 300, 300, 640, 1, 1,
    1, 1, 1, 1, 2, 2, 2, 15, 2, 30, 2, 80, 50, 3, 2, 2, 2, 2, 2, 3840, 1500, 200, 2, 30, 1, 3, 520,
    1280, 52, 80, 2, 3, 7, 3, 3, 1, 3, 80, 280, 13, 8, 3, 7, 7, 14, 13, 13, 11, 1000, 2600, 6400, 1,
    32, 1056, 4, 4, 4, 4, 100, 3, 18, 5, 5, 5, 3, 1, 2, 2, 2, 1, 2, 1920, 2, 1, 3, 1, 1, 1, 1, 1,
    30, 12, 15, 1, 10, 4, 5, 3, 200, 3, 2, 2, 2, 3, 3, 5, 40, 40, 40, 60, 23, 3, 1, 1, 1, 5, 350,
    900, 1275, 2025, 3525, 450, 1050, 1425, 2175, 3675, 5, 5, 5, 350, 900, 1275, 2025, 3525, 350,
    900, 1275, 2025, 3525, 3525, 4500, 160, 2000, 5200, 12800, 560, 3840, 900, 1275, 2025, 3525, 30,
    4, 4, 4, 1, 10, 25, 40, 50, 60, 25, 30, 50, 1, 70, 30, 50, 10, 30, 10, 10, 20, 2, 4, 3, 4, 4,
    10, 20, 1, 1, 5, 5, 15, 15, 1, 10, 10, 50, 50, 20, 20, 1, 15, 15, 25, 25, 1, 100, 100, 1, 200,
    200, 1, 150, 150, 1, 20, 5, 5, 5, 5, 3, 2, 1, 75, 150, 300, 5, 12, 40, 30, 1, 1, 1, 1, 1, 1,
    8000, 20800, 25600, 19200, 50000, 65000, 64000, 38400, 54400, 12800, 64000, 65000, 5000, 3200,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 20, 1, 30, 240, 624, 960, 1920, 768, 384, 1248, 432, 1440, 1152,
    1632, 1920, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 5, 11, 20, 25, 40, 48, 54, 65, 70, 3, 5, 11, 20, 25,
    40, 48, 54, 65, 70, 2, 2, 20, 50, 4, 10, 576, 10, 40, 20, 12, 9, 6, 88, 66, 44, 120, 90, 60,
    152, 114, 76, 180, 135, 90, 200, 150, 100, 220, 165, 110, 264, 198, 132, 288, 216, 144, 1, 1, 1,
    1, 1, 1, 1, 1, 15, 15, 32, 32, 32, 32, 5, 5, 10, 20, 30, 15, 25, 17625, 10000, 17625, 1, 1, 1,
    10, 20, 30, 15, 25, 10, 10, 10, 10, 1, 1, 1, 3, 50, 1000, 17625, 18375, 300, 300, 1, 20, 50, 25,
    25, 17, 17, 120, 120, 6, 2, 2, 35, 10, 125, 325, 8000, 800, 240, 288, 216, 144, 288, 216, 144,
    144, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 5, 5, 2, 5, 10, 15, 150, 150, 3, 100000, 200000, 2, 1,
    17625, 3, 3, 3, 3, 3, 3, 1, 2, 200, 40, 30, 2, 17625, 100, 300, 300, 7000, 15500, 15500, 15500,
    15500, 25, 2, 2, 2, 2, 2, 2, 300, 300, 10, 10, 10, 10, 20, 40, 80, 160, 320, 1, 6, 6, 24, 24,
    64, 64, 160, 160, 800, 800, 160, 100, 320, 200, 640, 400, 1280, 800, 2560, 1600, 80, 50, 160,
    100, 320, 200, 640, 400, 1280, 800, 10, 1, 3, 12, 32, 80, 400, 5, 10, 10, 10, 10, 10, 10, 42500,
    42500, 42500, 42500, 10, 10, 10, 10, 150, 300, 2025, 2175, 10, 10, 10, 10, 6, 6, 6, 6, 40, 30,
    10, 10, 1, 230, 10, 20, 1, 10, 20, 30, 20, 3, 5, 50, 50, 10, 20, 12, 6, 2, 20, 15, 12, 10, 10,
    10, 10, 1, 1, 10, 10, 5, 1, 20, 10, 10, 1, 1, 10, 1, 0, 2, 1, 1, 1, 1, 100, 50, 1, 0, 5000, 65,
    1, 15, 0, 0, 50, 50, 0, 0, 0, 4, 2, 2, 1, 4, 2, 2, 2, 4, 4, 5, 0, 0, 0, 1400, 1, 2, 1, 1, 1, 30,
    110, 1, 2, 1, 56, 5, 112, 200, 2, 100000, 200, 1, 1, 1, 1, 1, 40, 1, 1, 1, 1, 5, 5, 0, 10, 1, 1,
    1, 1, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 2500, 10, 4, 15, 2, 2, 15, 15, 0, 2, 1, 180, 180, 180, 180,
    180, 160, 160, 160, 160, 160, 180, 180, 180, 180, 180, 2, 35, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2,
    1, 2, 2, 2, 5, 5, 5, 2, 2, 2, 2, 2, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 40, 30, 20, 200, 150,
    100, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 20,
    1, 2, 2, 2, 2, 2, 40, 1, 1, 25, 25, 1, 30, 30, 30, 30, 30, 30, 30, 120, 120, 120, 120, 120, 120,
    160, 150, 150, 160, 85, 85, 85, 85, 5, 5, 5, 5, 1, 25, 25, 25, 200, 200, 200, 200, 200, 160,
    100, 100, 1, 200, 1, 1, 100, 20, 160, 10, 9, 45, 10, 10, 10, 5, 5, 10, 20, 10, 10, 10, 10, 10,
    1, 20, 10, 10, 15, 2, 2, 2, 2, 1, 6, 2, 2, 0, 0, 0, 1, 2, 70, 5, 30, 10, 10, 40, 40, 1, 40, 40,
    20, 2, 200, 200, 200, 200, 5, 15, 200000, 200000, 200000, 200000, 0, 0, 100, 100, 300, 10, 10,
    0, 0, 0, 1, 1, 0, 0, 0, 20, 3, 120, 120, 120, 1, 5, 1, 20, 500, 0, 1, 3, 9, 25, 65, 350, 50,
    130, 700, 1, 2, 1, 3, 6, 2, 21, 54, 133, 333, 37, 27, 24, 18, 15, 30, 40, 13, 46, 119, 293,
    1000, 2, 10, 2, 2, 1, 1, 1, 2, 2, 20, 5, 4, 10, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10,
    63, 2, 5, 20, 50, 130, 700, 2, 6, 21, 54, 37, 133, 333, 4, 13, 46, 119, 293, 1000, 1, 1, 1, 1,
    1, 1, 5, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 20, 2, 0, 5, 1, 1, 1, 1, 1, 1, 0, 20, 40, 5, 1, 1,
    2, 1, 2, 20, 2, 5, 200, 500, 200000, 200000, 200000, 150000, 1000, 1000, 500, 500, 500, 500, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100, 100, 100, 80000, 80000, 80000, 2000,
    2000, 2000, 2000, 1, 1, 1, 1, 1, 1, 1, 1, 2000, 2, 5, 15, 40, 35, 2, 1, 3, 200, 20, 20, 20, 1,
    2, 5, 500, 500, 2, 1, 1, 1, 1, 200, 91, 91, 1, 140, 500, 1300, 3200, 32000, 30, 2, 20, 1000,
    1000, 10, 35, 10, 10, 10, 10, 10, 10, 500000, 110000, 500000, 5, 16, 1, 10, 1, 7, 10, 1000,
    1000, 450, 15
  };

  static final int[] runesWeaponsArmourSorted = {
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15, 16, 17, 24, 28, 31, 32, 33, 34, 35, 36, 37, 38, 40, 41,
    42, 45, 46, 52, 59, 60, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
    80, 81, 82, 83, 84, 85, 86, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 100, 101, 102, 103, 104,
    105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123,
    124, 125, 126, 127, 128, 129, 130, 131, 183, 184, 185, 186, 188, 189, 190, 196, 197, 198, 199,
    205, 206, 209, 214, 215, 216, 217, 225, 226, 227, 229, 230, 235, 248, 265, 288, 289, 290, 291,
    292, 301, 302, 303, 304, 305, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 385, 388,
    389, 396, 397, 398, 399, 400, 401, 402, 403, 404, 406, 407, 420, 423, 424, 425, 426, 427, 429,
    430, 431, 432, 433, 434, 470, 509, 511, 512, 513, 514, 522, 544, 556, 559, 560, 561, 562, 563,
    564, 565, 574, 576, 577, 578, 579, 580, 581, 593, 594, 597, 606, 607, 608, 609, 610, 614, 615,
    616, 617, 618, 619, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652,
    653, 654, 655, 656, 657, 682, 683, 684, 685, 693, 698, 699, 700, 701, 702, 703, 721, 722, 723,
    725, 726, 733, 734, 744, 754, 760, 761, 766, 782, 786, 795, 807, 808, 825, 826, 827, 828, 831,
    832, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 852, 966, 967,
    968, 969, 970, 971, 985, 990, 1000, 1006, 1013, 1014, 1015, 1019, 1020, 1024, 1028, 1029, 1031,
    1032, 1033, 1034, 1035, 1041, 1068, 1069, 1070, 1075, 1076, 1077, 1078, 1079, 1080, 1081, 1088,
    1089, 1090, 1091, 1092, 1122, 1123, 1124, 1125, 1126, 1127, 1128, 1129, 1130, 1131, 1132, 1133,
    1134, 1135, 1136, 1137, 1138, 1139, 1140, 1156, 1172, 1205, 1213, 1214, 1215, 1216, 1217, 1218,
    1230, 1236, 1237, 1239, 1240, 1255, 1256, 1276, 1277, 1278, 1288, 1289
  };
  static final int[] foodPotionsSorted = {
    18, 19, 21, 22, 23, 29, 50, 55, 57, 58, 132, 133, 134, 136, 137, 138, 139, 140, 141, 142, 143,
    165, 179, 180, 192, 193, 210, 219, 220, 221, 222, 223, 224, 228, 236, 241, 246, 249, 250, 251,
    252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 267, 268, 269, 270, 319, 320, 321,
    322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 342,
    343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361,
    362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 422, 435, 436, 437, 438, 439,
    440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458,
    459, 460, 461, 462, 463, 464, 465, 466, 467, 469, 471, 472, 473, 474, 475, 476, 477, 478, 479,
    480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498,
    499, 500, 501, 502, 503, 504, 533, 534, 535, 536, 545, 546, 547, 550, 551, 552, 553, 554, 555,
    566, 567, 568, 569, 570, 571, 572, 584, 590, 591, 598, 628, 629, 630, 631, 677, 707, 708, 709,
    710, 717, 718, 735, 737, 739, 748, 749, 750, 751, 765, 770, 771, 772, 801, 829, 830, 833, 834,
    853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871,
    872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 895, 896,
    897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 923,
    924, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950,
    951, 952, 953, 954, 955, 956, 957, 963, 964, 965, 1016, 1051, 1052, 1053, 1054, 1058, 1061,
    1074, 1082, 1083, 1084, 1085, 1086, 1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109,
    1110, 1190, 1191, 1192, 1193, 1245, 1247, 1248, 1268, 1269, 1271, 1272, 1273, 1274, 1275, 1279,
    1280, 1281
  };
  static final int[] toolsResourcesSorted = {
    12, 13, 25, 26, 39, 43, 47, 48, 51, 87, 88, 99, 135, 140, 145, 146, 147, 148, 149, 150, 151,
    152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 166, 167, 168, 169, 170, 171,
    172, 173, 174, 202, 203, 204, 207, 211, 212, 237, 242, 243, 251, 278, 279, 280, 375, 376, 377,
    378, 379, 380, 381, 382, 383, 384, 386, 390, 391, 392, 393, 394, 395, 405, 408, 409, 414, 421,
    428, 468, 517, 518, 519, 520, 521, 523, 525, 526, 527, 528, 529, 530, 531, 532, 538, 541, 542,
    548, 582, 583, 589, 595, 596, 611, 612, 613, 614, 621, 622, 623, 624, 625, 626, 627, 632, 633,
    634, 635, 636, 637, 669, 670, 671, 672, 673, 674, 675, 676, 690, 691, 711, 712, 713, 714, 732,
    736, 756, 773, 774, 780, 789, 790, 792, 793, 796, 797, 803, 835, 889, 890, 891, 892, 893, 894,
    925, 932, 1012, 1021, 1047, 1059, 1062, 1063, 1064, 1065, 1066, 1067, 1071, 1097, 1098, 1164,
    1176, 1249, 1258, 1259, 1260, 1261, 1262, 1263
  };
  static final int[] itemsAlphabetical = {
    1264, 1219, 1004, 1099, 1231, 1221, 983, 1220, 1222, 1205, 1230, 80, 673, 644, 204, 174, 92,
    116, 65, 1066, 131, 74, 97, 154, 1261, 120, 123, 311, 227, 86, 69, 1091, 127, 1069, 1079, 704,
    626, 33, 1160, 294, 235, 1010, 24, 1011, 1009, 797, 1039, 327, 352, 1207, 1194, 1224, 420, 257,
    182, 191, 1284, 818, 1252, 1235, 984, 280, 267, 181, 1025, 474, 475, 476, 450, 180, 1282, 539,
    207, 249, 668, 919, 555, 628, 604, 614, 617, 618, 615, 616, 852, 1059, 193, 620, 743, 1151, 961,
    413, 548, 800, 426, 428, 429, 233, 600, 602, 431, 423, 395, 433, 425, 430, 196, 248, 313, 434,
    216, 427, 424, 432, 1081, 588, 587, 716, 1266, 1286, 1267, 619, 754, 467, 393, 272, 916, 877,
    938, 266, 1208, 1195, 1225, 36, 976, 835, 974, 20, 30, 768, 1141, 788, 1238, 17, 966, 967, 968,
    969, 970, 722, 676, 341, 342, 876, 99, 186, 138, 137, 1165, 778, 1170, 53, 54, 1167, 76, 669,
    11, 87, 169, 205, 113, 62, 1062, 242, 803, 128, 70, 94, 156, 117, 206, 308, 214, 82, 66, 827,
    124, 1013, 1076, 979, 21, 1177, 583, 1156, 331, 710, 353, 360, 365, 368, 374, 1247, 1281, 1110,
    322, 1248, 547, 347, 371, 139, 134, 260, 1166, 18, 228, 452, 57, 55, 330, 338, 599, 601, 585,
    1057, 183, 209, 229, 511, 512, 513, 514, 1288, 755, 756, 1209, 1196, 1226, 549, 1003, 1093,
    1119, 757, 1098, 1169, 61, 41, 597, 319, 901, 944, 192, 382, 1164, 167, 911, 954, 337, 907, 950,
    332, 772, 875, 942, 336, 770, 575, 149, 212, 155, 518, 998, 999, 833, 853, 854, 834, 551, 10,
    1269, 1103, 132, 252, 150, 46, 147, 1150, 871, 695, 696, 697, 60, 190, 960, 915, 525, 739, 566,
    567, 568, 709, 1249, 931, 1236, 1157, 1158, 989, 776, 1255, 1210, 1197, 1227, 38, 480, 481, 482,
    990, 1019, 1020, 161, 300, 305, 317, 292, 287, 537, 860, 859, 1121, 387, 1285, 804, 802, 1100,
    594, 829, 1270, 814, 795, 1278, 593, 523, 522, 524, 544, 543, 510, 509, 607, 608, 872, 943, 777,
    596, 1001, 1034, 1186, 1032, 1184, 1035, 1187, 1033, 1185, 1046, 453, 269, 765, 627, 34, 677,
    1245, 19, 1211, 1198, 1228, 163, 298, 303, 315, 290, 285, 1085, 684, 685, 682, 683, 505, 507,
    508, 506, 1240, 873, 810, 606, 1176, 270, 609, 1237, 265, 694, 381, 1036, 612, 31, 557, 558,
    176, 380, 719, 489, 490, 491, 377, 675, 201, 23, 136, 378, 1203, 1212, 1199, 1229, 861, 538,
    905, 948, 866, 937, 1016, 146, 218, 766, 701, 700, 699, 1254, 917, 899, 881, 718, 1265, 870,
    782, 805, 806, 787, 621, 925, 926, 921, 1256, 981, 903, 946, 851, 744, 836, 837, 838, 839, 840,
    898, 846, 847, 848, 849, 850, 884, 886, 880, 885, 888, 882, 887, 900, 883, 841, 842, 843, 844,
    845, 273, 274, 275, 152, 690, 296, 301, 172, 691, 532, 521, 288, 1118, 283, 1188, 1287, 1189,
    29, 143, 515, 830, 541, 598, 1051, 472, 1179, 473, 444, 1253, 1215, 261, 262, 263, 329, 1276,
    1277, 246, 328, 526, 527, 751, 828, 831, 832, 168, 771, 379, 447, 637, 720, 165, 435, 436, 437,
    438, 439, 440, 441, 442, 443, 815, 817, 819, 821, 823, 933, 362, 1257, 746, 386, 44, 385, 742,
    1239, 1008, 1007, 1002, 723, 556, 573, 323, 343, 344, 1072, 603, 1073, 922, 449, 77, 670, 638,
    12, 170, 528, 89, 7, 28, 1063, 2, 71, 0, 151, 517, 1258, 8, 9, 312, 215, 83, 1, 1088, 3, 1015,
    1075, 893, 595, 936, 140, 318, 210, 1012, 47, 48, 1047, 247, 735, 736, 734, 733, 826, 897, 1096,
    1095, 1006, 13, 451, 111, 230, 108, 727, 728, 729, 730, 6, 789, 110, 112, 109, 590, 42, 148, 15,
    16, 855, 856, 1018, 1017, 1142, 1143, 1144, 724, 37, 863, 864, 865, 220, 1271, 809, 985, 780,
    373, 533, 375, 972, 714, 14, 188, 307, 1172, 553, 394, 745, 636, 656, 1054, 752, 657, 198, 738,
    1250, 540, 1191, 415, 416, 417, 418, 634, 712, 652, 653, 753, 445, 586, 421, 259, 326, 107, 470,
    104, 5, 106, 399, 105, 56, 799, 1021, 22, 35, 1038, 582, 79, 672, 642, 203, 173, 530, 91, 115,
    64, 1065, 130, 73, 96, 153, 519, 1260, 119, 122, 310, 226, 85, 796, 68, 1090, 126, 1068, 1078,
    1178, 1180, 623, 388, 389, 414, 1041, 1204, 1206, 419, 40, 295, 39, 376, 1086, 1161, 1056, 632,
    648, 649, 867, 1053, 1044, 1048, 1049, 1050, 1043, 208, 589, 1155, 1005, 1162, 241, 1109, 1108,
    1107, 894, 857, 391, 858, 282, 991, 992, 993, 994, 740, 741, 791, 793, 790, 786, 779, 792, 1279,
    1111, 1112, 1113, 982, 987, 333, 334, 576, 577, 578, 579, 580, 581, 240, 250, 927, 928, 929,
    930, 726, 721, 468, 59, 767, 251, 253, 798, 364, 748, 862, 750, 879, 940, 749, 1105, 321, 812,
    758, 762, 763, 764, 325, 410, 1283, 177, 645, 569, 570, 571, 574, 737, 592, 639, 643, 647, 641,
    564, 1139, 1126, 1133, 759, 565, 1132, 560, 1135, 1122, 1128, 178, 559, 1136, 1123, 1129, 562,
    1138, 1125, 1131, 563, 1140, 1127, 1134, 561, 1137, 1124, 1130, 264, 135, 348, 58, 963, 964,
    965, 1037, 1152, 1153, 1154, 1272, 980, 175, 808, 807, 760, 761, 1071, 1014, 422, 516, 1163,
    1233, 995, 1042, 448, 996, 498, 499, 500, 977, 731, 271, 351, 554, 629, 502, 504, 133, 550, 717,
    361, 591, 372, 534, 552, 1190, 1268, 1280, 363, 503, 356, 354, 1192, 545, 631, 349, 369, 536,
    358, 366, 1101, 231, 390, 219, 892, 715, 236, 258, 238, 978, 483, 484, 485, 293, 1234, 702, 703,
    1061, 1114, 1117, 1148, 1149, 986, 824, 237, 801, 1246, 213, 162, 299, 304, 316, 291, 693, 286,
    692, 81, 674, 646, 405, 93, 400, 396, 1067, 404, 75, 98, 1262, 401, 402, 407, 398, 397, 406,
    1092, 403, 1070, 1080, 408, 409, 1159, 357, 625, 971, 164, 297, 302, 314, 289, 284, 1214, 355,
    1243, 678, 679, 680, 681, 686, 687, 688, 689, 1242, 1241, 747, 49, 1173, 781, 1120, 1289, 1193,
    769, 1094, 622, 874, 941, 1087, 1244, 1030, 546, 630, 144, 732, 988, 189, 350, 200, 383, 384,
    531, 520, 52, 25, 26, 51, 932, 820, 1045, 187, 194, 195, 27, 412, 1022, 1023, 1263, 335, 816,
    1251, 469, 624, 243, 794, 825, 211, 924, 1115, 1116, 1181, 707, 914, 957, 179, 100, 101, 725,
    103, 197, 1217, 1000, 1031, 1218, 102, 1216, 217, 1146, 477, 478, 479, 78, 671, 640, 88, 171,
    529, 90, 114, 63, 1064, 698, 129, 72, 95, 1259, 118, 121, 309, 225, 84, 67, 1089, 125, 1024,
    1077, 975, 346, 1040, 1174, 958, 221, 222, 223, 224, 811, 486, 487, 488, 1273, 495, 496, 497,
    1274, 492, 493, 494, 1275, 306, 785, 783, 895, 973, 370, 535, 1175, 910, 953, 446, 1102, 959,
    1060, 1058, 43, 1200, 1201, 1202, 411, 202, 166, 902, 945, 913, 956, 896, 320, 1106, 1055, 773,
    774, 934, 1183, 813, 706, 918, 705, 359, 1145, 367, 923, 45, 1028, 254, 339, 708, 255, 1104,
    324, 256, 345, 784, 157, 542, 159, 890, 891, 889, 158, 160, 610, 454, 455, 456, 457, 458, 459,
    460, 461, 462, 463, 935, 1052, 1074, 340, 278, 279, 1026, 1027, 1029, 466, 997, 1223, 1232,
    1171, 611, 1147, 276, 666, 667, 662, 663, 658, 659, 277, 660, 661, 664, 665, 1168, 906, 949,
    908, 951, 464, 465, 869, 822, 920, 775, 50, 141, 613, 1083, 1082, 1084, 32, 605, 572, 584, 868,
    234, 471, 244, 245, 633, 713, 650, 651, 142, 501, 878, 939, 268, 184, 185, 199, 281, 4, 145,
    904, 947, 912, 955, 909, 952, 1097, 232, 392, 239, 635, 711, 654, 655, 1182, 962, 1213
  };
  static final int[] mostValuableItems = {
    1276, 1278, 594, 1032, 1033, 1034, 1035, 1184, 1185, 1186, 1187, 1277, 593, 795, 1216, 1217,
    1218, 401, 407, 81, 402, 406, 404, 400, 682, 683, 684, 685, 93, 403, 112, 75, 1262, 398, 397,
    399, 544, 522, 524, 543, 597, 610, 615, 616, 617, 618, 98, 120, 311, 405, 523, 396, 563, 614,
    80, 123, 227, 131, 119, 310, 408, 754, 116, 307, 92, 127, 196, 313, 292, 287, 300, 305, 306,
    317, 111, 74, 409, 1261, 79, 122, 226, 86, 656, 825, 130, 291, 693, 69, 286, 299, 304, 316, 692,
    118, 161, 309, 1219, 1220, 1221, 1222, 1231, 115, 107, 248, 426, 434, 91, 433, 657, 126, 101,
    102, 103, 197, 97, 431, 110, 290, 779, 73, 1260, 204, 654, 666, 285, 298, 303, 315, 429, 432,
    230, 289, 85, 78, 121, 162, 225, 542, 1092, 1140, 1188, 1189, 1266, 1267, 1286, 1287, 425, 284,
    297, 302, 314, 129, 68, 65, 564, 646, 647, 655, 667, 106, 427, 114, 1070, 1127, 90, 174, 652,
    664, 424, 125, 96, 470, 8, 312, 109, 203, 72, 163, 1060, 1183, 1190, 1191, 1192, 1193, 1247,
    1248, 1259, 288, 1288, 430, 84, 154, 653, 665, 674, 428, 283, 296, 301, 1067, 1080, 1134, 64,
    67, 562, 636, 650, 662, 105, 172, 173, 385, 545, 546, 612, 613, 626, 627, 691, 1040, 1091, 1139,
    498, 566, 569, 9, 77, 215, 495, 164, 423, 565, 2, 707, 95, 492, 499, 567, 570, 7, 44, 45, 88,
    157, 198, 265, 369, 370, 489, 606, 651, 663, 793, 796, 892, 966, 967, 968, 969, 970, 975, 1026,
    1027, 1028, 1029, 1182, 1240, 1254, 496, 89, 486, 836, 837, 838, 839, 840, 846, 847, 848, 849,
    850, 3, 493, 153, 117, 308, 635, 644, 645, 648, 660, 841, 842, 843, 844, 845, 950, 953, 971,
    980, 6, 483, 152, 372, 373, 384, 490, 590, 591, 690, 893, 951, 952, 500, 568, 571, 572, 71,
    1258, 487, 1079, 1133, 497, 1069, 1126, 63, 561, 480, 554, 555, 944, 945, 946, 947, 948, 949,
    1053, 1054, 1055, 1090, 1138, 484, 83, 792, 494, 786, 158, 171, 235, 366, 367, 491, 611, 649,
    661, 750, 894, 972, 973, 978, 1038, 1039, 1213, 1214, 1215, 1, 1255, 1256, 481, 488, 477, 954,
    955, 956, 957, 5, 76, 188, 206, 214, 634, 658, 673, 485, 383, 60, 332, 453, 463, 1014, 128, 478,
    452, 462, 755, 1066, 642, 643, 0, 1121, 113, 276, 327, 482, 12, 790, 451, 461, 1078, 1131, 205,
    52, 159, 189, 326, 330, 334, 356, 357, 467, 541, 549, 659, 717, 718, 751, 760, 761, 1068, 1125,
    124, 450, 460, 1089, 1137, 155, 983, 108, 479, 70, 273, 274, 275, 325, 388, 449, 459, 472, 607,
    633, 702, 802, 889, 931, 1019, 1020, 1022, 1023, 1087, 1172, 1235, 1081, 1132, 24, 28, 559, 852,
    1236, 1269, 82, 229, 511, 512, 513, 514, 672, 186, 200, 257, 318, 329, 333, 336, 389, 422, 519,
    530, 608, 703, 713, 785, 890, 937, 938, 939, 940, 941, 942, 943, 1016, 1086, 1263, 170, 1082,
    66, 160, 324, 328, 363, 364, 448, 458, 521, 532, 550, 551, 619, 934, 935, 963, 964, 965, 1065,
    104, 640, 641, 1083, 277, 15, 1077, 1130, 4, 38, 339, 346, 358, 359, 375, 420, 447, 457, 466,
    473, 518, 529, 548, 632, 709, 712, 714, 720, 724, 737, 891, 923, 924, 979, 990, 997, 1024, 1051,
    1059, 1102, 1124, 1160, 1171, 1179, 1241, 1242, 1243, 1265, 94, 237, 1084, 151, 552, 553, 87,
    1280, 46, 100, 184, 259, 351, 352, 361, 362, 509, 510, 520, 531, 589, 725, 757, 828, 831, 832,
    1000, 1031, 1085, 1234, 1289, 221, 216, 222, 223, 1088, 1136, 42, 138, 258, 387, 474, 671, 721,
    726, 224, 446, 456, 41, 62, 136, 146, 261, 323, 335, 337, 338, 345, 354, 355, 469, 471, 517,
    528, 533, 534, 535, 536, 560, 588, 628, 629, 630, 631, 668, 676, 677, 678, 679, 680, 681, 686,
    687, 688, 689, 694, 695, 696, 697, 704, 705, 708, 711, 719, 727, 728, 729, 730, 733, 734, 738,
    739, 742, 810, 826, 981, 984, 985, 986, 989, 991, 992, 993, 994, 995, 998, 999, 1017, 1018,
    1041, 1042, 1094, 1105, 1120, 1268, 1270, 1271, 1272, 1273, 1274, 1275, 1282, 1285, 475, 982,
    1064, 169, 217, 40, 209, 219, 220, 1284, 13, 16, 17, 22, 50, 476, 556, 638, 639, 698, 699, 700,
    701, 722, 1006, 1075, 1129, 49, 238, 239, 240, 263, 272, 282, 293, 294, 295, 349, 350, 376, 377,
    378, 379, 386, 445, 455, 515, 516, 584, 585, 587, 675, 716, 735, 775, 791, 807, 808, 816, 818,
    820, 822, 824, 868, 869, 870, 876, 958, 959, 960, 961, 987, 988, 1015, 1030, 1057, 1103, 1123,
    1147, 1163, 1173, 1181, 1233, 1246, 1279, 14, 19, 31, 32, 33, 34, 59, 132, 231, 232, 233, 234,
    262, 319, 320, 321, 341, 343, 344, 468, 765, 769, 773, 774, 827, 1104, 1135, 35, 36, 150, 190,
    202, 208, 210, 211, 213, 218, 236, 241, 251, 264, 266, 270, 271, 278, 342, 380, 419, 444, 454,
    540, 592, 598, 599, 600, 601, 602, 603, 670, 715, 1052, 1063, 1074, 1106, 1107, 1108, 1109,
    1239, 11, 21, 23, 29, 181, 182, 183, 185, 187, 191, 192, 193, 194, 195, 199, 207, 243, 244, 245,
    247, 249, 267, 268, 269, 340, 381, 464, 465, 557, 558, 574, 576, 577, 578, 579, 580, 581, 583,
    586, 595, 605, 609, 620, 621, 622, 623, 624, 625, 723, 745, 766, 767, 770, 771, 772, 781, 788,
    794, 829, 830, 834, 851, 853, 854, 855, 856, 857, 858, 859, 860, 863, 865, 866, 867, 871, 872,
    873, 874, 875, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 895, 896, 897, 898,
    899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917,
    918, 919, 920, 921, 922, 926, 927, 928, 929, 930, 1001, 1002, 1003, 1004, 1007, 1008, 1013,
    1025, 1072, 1076, 1093, 1095, 1096, 1100, 1101, 1122, 1128, 1161, 1176, 1178, 1180, 1232, 1237,
    1245, 1249, 1264, 10, 18, 20, 25, 26, 27, 30, 37, 39, 43, 47, 48, 51, 53, 54, 55, 56, 57, 58,
    61, 99, 133, 134, 135, 137, 139, 140, 141, 142, 143, 144, 145, 147, 148, 149, 156, 165, 166,
    167, 168, 175, 176, 177, 178, 179, 180, 201, 212, 228, 242, 246, 250, 252, 253, 254, 255, 256,
    260, 279, 280, 281, 322, 331, 347, 348, 353, 360, 365, 368, 371, 374, 382, 390, 391, 392, 393,
    394, 395, 410, 411, 412, 413, 414, 415, 416, 417, 418, 421, 435, 436, 437, 438, 439, 440, 441,
    442, 443, 501, 502, 503, 504, 505, 506, 507, 508, 525, 526, 527, 537, 538, 539, 547, 573, 575,
    582, 596, 604, 637, 669, 706, 710, 731, 732, 736, 740, 741, 743, 746, 747, 748, 749, 752, 756,
    768, 780, 782, 783, 784, 787, 789, 797, 798, 799, 800, 801, 803, 804, 805, 806, 811, 812, 813,
    814, 815, 817, 819, 821, 823, 835, 861, 862, 864, 925, 932, 933, 936, 962, 974, 976, 977, 996,
    1005, 1012, 1021, 1046, 1047, 1056, 1058, 1062, 1071, 1073, 1097, 1098, 1099, 1110, 1111, 1112,
    1113, 1114, 1115, 1116, 1117, 1118, 1119, 1141, 1142, 1143, 1144, 1145, 1146, 1148, 1149, 1150,
    1151, 1155, 1156, 1157, 1158, 1159, 1164, 1165, 1166, 1167, 1168, 1169, 1174, 1175, 1177, 1194,
    1195, 1196, 1197, 1198, 1199, 1200, 1201, 1202, 1203, 1204, 1205, 1206, 1207, 1208, 1209, 1210,
    1211, 1212, 1223, 1224, 1225, 1226, 1227, 1228, 1229, 1230, 1238, 1244, 1250, 1251, 1252, 1253,
    1257, 1281, 1283, 744, 753, 758, 759, 762, 763, 764, 776, 777, 778, 809, 833, 1009, 1010, 1011,
    1036, 1037, 1043, 1044, 1045, 1048, 1049, 1050, 1061, 1152, 1153, 1154, 1162, 1170
  };
  // TODO: Replace this array with a similar one with all items
  static final int[] typeSortNice = {
    31, 32, 33, 34, 35, 36, 37, 38, 40, 41, 42, 46, 619, 100, 101, 102, 103, 197, 198, 614, 615,
    616, 617, 618, 682, 683, 684, 685, 509, 725, 825, 1000, 1031, 1216, 1217, 1218, 94, 0, 95, 430,
    96, 97, 98, 307, 66, 1, 67, 424, 68, 69, 397, 62, 28, 63, 423, 64, 65, 396, 70, 71, 72, 425, 73,
    74, 75, 593, 76, 77, 78, 426, 79, 80, 81, 82, 83, 84, 427, 85, 86, 398, 205, 89, 90, 429, 91,
    92, 93, 594, 560, 559, 561, 565, 562, 564, 563, 52, 1255, 1256, 1205, 217, 1230, 1236, 265, 606,
    1172, 754, 104, 5, 105, 470, 106, 107, 399, 795, 113, 7, 114, 431, 115, 116, 400, 108, 6, 109,
    230, 110, 111, 112, 117, 8, 118, 196, 119, 120, 401, 308, 312, 309, 313, 310, 311, 407, 206, 9,
    121, 248, 122, 123, 402, 214, 215, 225, 434, 226, 227, 406, 4, 420, 124, 128, 3, 2, 125, 129,
    432, 433, 126, 130, 127, 131, 403, 404, 1276, 1277, 1278, 733, 734, 698, 699, 700, 701, 1006,
    24, 186, 556, 235, 288, 289, 290, 693, 291, 292, 544, 301, 302, 303, 304, 305, 597, 610, 522,
    314, 315, 316, 317, 45, 385, 1028, 1029, 721, 726, 744, 782, 826, 852, 183, 209, 229, 511, 512,
    513, 514, 1213, 1214, 1215, 1288, 1237, 609, 388, 389, 807, 808, 607, 608, 1020, 1019, 185, 184,
    199, 216, 702, 703, 990, 841, 846, 836, 966, 842, 847, 837, 967, 843, 848, 838, 968, 844, 849,
    839, 969, 845, 850, 840, 970, 15, 16, 17, 766, 760, 761, 722, 1032, 1033, 1034, 1035, 1239,
    1240, 1041, 190, 786, 11, 638, 640, 642, 644, 646, 574, 639, 641, 643, 645, 647, 723, 985, 827,
    1088, 1089, 1090, 1091, 1092, 1135, 1136, 1137, 1138, 1139, 1140, 1014, 1013, 1015, 1024, 1068,
    1069, 1070, 1122, 1123, 1124, 1125, 1126, 1127, 1128, 1129, 1130, 1132, 1131, 1133, 1134, 1076,
    1075, 1077, 1081, 1078, 1079, 1080, 59, 60, 188, 189, 649, 648, 651, 650, 653, 652, 655, 654,
    657, 656, 576, 577, 578, 579, 580, 581, 828, 831, 832, 971, 1156, 1289, 18, 19, 21, 22, 23, 29,
    50, 57, 58, 55, 132, 133, 134, 136, 137, 138, 139, 140, 141, 142, 143, 165, 179, 180, 192, 193,
    210, 219, 220, 224, 223, 222, 221, 228, 236, 241, 246, 249, 250, 251, 252, 253, 254, 255, 256,
    257, 258, 259, 260, 261, 262, 263, 267, 268, 269, 270, 319, 320, 321, 322, 323, 324, 325, 326,
    327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 342, 343, 344, 345, 346, 347,
    348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366,
    367, 368, 369, 370, 371, 372, 373, 374, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445,
    446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464,
    465, 466, 467, 469, 471, 472, 473, 476, 475, 474, 479, 478, 477, 482, 481, 480, 485, 484, 483,
    488, 487, 486, 491, 490, 489, 494, 493, 492, 497, 496, 495, 500, 499, 498, 501, 502, 503, 504,
    628, 629, 630, 631, 533, 534, 535, 536, 545, 546, 547, 550, 551, 552, 553, 554, 555, 568, 567,
    566, 571, 570, 569, 572, 584, 590, 591, 598, 422, 677, 707, 708, 709, 710, 717, 718, 735, 737,
    739, 748, 749, 750, 751, 765, 770, 771, 772, 801, 829, 830, 833, 834, 853, 854, 855, 856, 857,
    858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876,
    877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 895, 896, 897, 898, 899, 900, 901,
    902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 923, 924, 933, 934, 935, 936,
    937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955,
    956, 957, 965, 964, 963, 1051, 1052, 1053, 1054, 1058, 1061, 1074, 1016, 1082, 1083, 1084, 1085,
    1086, 1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110, 1190, 1191, 1192, 1193,
    1245, 1247, 1248, 1268, 1269, 1271, 1272, 1273, 1274, 1275, 1279, 1280, 1281, 1263, 87, 12, 88,
    428, 203, 204, 405, 156, 1258, 1259, 1260, 1261, 1262, 13, 39, 43, 135, 140, 166, 167, 168, 211,
    237, 251, 375, 376, 377, 378, 379, 380, 381, 386, 468, 548, 589, 621, 714, 773, 774, 1176, 1249,
    145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 409, 155, 160, 159, 158, 157, 164, 163, 162,
    161, 169, 170, 171, 172, 173, 174, 408, 207, 202, 243, 278, 279, 280, 383, 384, 517, 518, 519,
    520, 521, 523, 528, 529, 530, 531, 532, 541, 542, 611, 612, 613, 614, 622, 623, 624, 625, 626,
    627, 632, 633, 634, 635, 636, 637, 669, 670, 671, 672, 673, 674, 675, 676, 690, 691, 711, 712,
    713, 790, 792, 793, 796, 889, 890, 891, 892, 893, 894, 1071, 1062, 1063, 1064, 1065, 1066, 1067,
    25, 26, 47, 48, 51, 99, 212, 242, 382, 390, 391, 392, 393, 394, 395, 414, 421, 525, 526, 527,
    538, 582, 583, 595, 596, 732, 736, 756, 780, 789, 797, 803, 835, 925, 932, 1012, 1021, 1047,
    1059, 1097, 1098, 1164
  };
}
