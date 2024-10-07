package helper;

import java.util.ArrayList;

public class Util {

    public static int[][] ArrayListTo2DInt(ArrayList<Integer> list, int ySize, int xSize) {
        int[][] array = new int[ySize][xSize];
        for (int j = 0; j < ySize; j++) {
            for (int i = 0; i < xSize; i++) {
                int index = j * ySize + i;
                array[j][i] = list.get(index);
            }
        }
        return array;
    }
    public static int[] TwoDto1DintArr(int[][] twoArr){
        int[] arr = new int[twoArr.length * twoArr[0].length];
        for (int j = 0; j < twoArr.length; j++) {
            for (int i = 0; i < twoArr[j].length; i++) {
                int index = j * twoArr.length + i;
                arr[index] = twoArr[j][i];
            }
        }
        return arr;
    }

}
