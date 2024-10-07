package helper;

import java.util.ArrayList;

public class Util {

    public static int[][] ArrayListTo2DInt(ArrayList<Integer> list, int ySize, int xSize) {
        int[][] array = new int[ySize][xSize];
        for (int i = 0; i < ySize; i++) {
            for (int j = 0; j < xSize; j++) {
                int index = j * ySize + i;
                array[i][j] = list.get(index);
            }
        }
        return array;
    }

}
