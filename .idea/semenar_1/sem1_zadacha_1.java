package sem1;

import static javax.swing.TransferHandler.NONE;

public class sem1_zadacha_1 {
    public static void main(String[] args) {
        int[] ints = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int result = find_value(ints, 82);
        System.out.println(result);
    }

    public static int find_value(int[] arr, int value) {
        if (arr == null) {
            return -1;
        }
        if (arr.length < 1) {
            return -2;
        }
        if (value == NONE) {
            return -3;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                int index = i;
                return index;
            }
        }
        return -4;
    }
}


