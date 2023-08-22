package sem1;

public class sem1_zadacha_4 {
    public static void main(String[] args) {
        Integer[] ints = {9, 8, 7, 6, null, 4, 3, null, 1, 0};

        checkArray(ints);
        System.out.println("Work!!!");
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] == null) {
                    throw new RuntimeException("Значение null по индексу: "+ i);
                }
            }catch (RuntimeException e){
                e.printStackTrace();
            }
        }
    }
}
