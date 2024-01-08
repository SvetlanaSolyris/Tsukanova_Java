import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        System.out.print("Введите число и нажмите ввод: ");
        int x = str.nextInt();
        if (x > 7) {
            System.out.println("Привет");
        }

        System.out.println("Введите имя и нажмите ввод: ");
        String user_name = str.next();
        HelloUser.helloUser(user_name);

        try {
            System.out.print("Введите количество элементов массива и нажмите ввод: ");
            int len = str.nextInt();
            int[] mas = new int[len];

            System.out.println("Введите элементы массива и нажмите ввод:");
            for (int i = 0; i < len; i++) {
                mas[i] = str.nextInt();
            }

            MultiplesNumber.kratnoeThree(mas);

            } catch (InputMismatchException e) {
                System.out.println("Использован неподходящий массив, будет использован тестовый массив: ");
                MultiplesNumber.testMassiv();
            }
        str.close();
    }
}