import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите второе число: ");

        double b = scanner1.nextDouble();
        double sum = a + b;
        double multiple = a * b;
        double deduction = a - b;
        double division = a / b;
        double remainder = a % b;

        System.out.println("Сумма двух чисел равна: " + sum);
        System.out.println("Умножение двух чисел равна: " + multiple);
        System.out.println("Вычитание двух чисел равна: " + deduction);
        System.out.println("Деление двух чисел равна: " + division);
        System.out.println("Остаток двух чисел равна: " + remainder);

        // 2.

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Нечетные цифры: " + i);
            }
        }

        // 3.
        int x = 1;
        int y = 2;
        System.out.println("До замены: ");
        System.out.println(x + " и " + y);

        int z = x;
        System.out.println("После замены: ");
        System.out.println(z + " и " + y);

        // 4.
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        double num2 = scanner3.nextDouble();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите третье число: ");
        double num3 = scanner4.nextDouble();

        double maxNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        } else {
            maxNum = num1;
        }
        System.out.println("Максимальное значение: " + maxNum);

         */

//        // 5.
//        Scanner scanner5 = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int num = scanner5.nextInt();
//
//        if (num > 0) {
//            System.out.println("Число положительное");
//        } else if (num < 0) {
//            System.out.println("Число отрицательное");
//        } else {
//            System.out.println("Число ноль является ни отрицательным, ни положительными");
//        }
//
//        // 6.
//        String input = "AAA";
//        String output = getA(input);
//        System.out.println(output);
//
//
//        // 7.
//
//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println(sum);

        // 8.

        int[] arr = {20, -12, 40, 50, 1};
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
    public static String getA(String input) {
        String aLetter = "AAA";
        input = input.replace(aLetter, "BBB");
        return input;
    }


}