package sem1;

public class sem1_zadacha_2 {
    public static void main(String[] args) {
        int[][] ints = new int[3][];

        ints[0] = new int[]{0, 0, 1};
        ints[1] = new int[]{1, 1, 0};
        ints[2] = new int[]{0, 1, 1};

        System.out.println(matrixCount(ints));
    }

    public static int matrixCount(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                throw new RuntimeException("Массив не квадратный");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] != 1){
                    throw new RuntimeException("Неверные значения");
                }
                result += matrix[i][j];
            }
        }
        return result;
    }
}
