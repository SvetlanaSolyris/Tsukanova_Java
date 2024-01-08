import java.util.Arrays;

public class MultiplesNumber {
    static void myException(int[] mas) {
        if (mas.length == 0) {
            throw new IllegalArgumentException ("Использован массив нулевой длины, будет использован тестовый массив");
        }
    }

    static void testMassiv() {
        int[] testMassive = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Тестовый массив: " + Arrays.toString(testMassive));
        System.out.print("Числа массива кратные трем: ");

        for (int i = 0; i < testMassive.length; i++) {
            if (testMassive[i] % 3 == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    public static void kratnoeThree(int[] mas) {
        try {
            myException(mas);
            System.out.println("Исходный массив: " + Arrays.toString(mas));
            System.out.print("Числа массива кратные трем: ");
            for (int el : mas) {
                if (el % 3 == 0) {
                    System.out.print(el + " ");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            testMassiv();
        }
    }
}
