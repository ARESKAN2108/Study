import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(12);
//        foobar(6);
//        foobar(10);
//        foobar(15);
//        printMatrix();
//        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */

    private static void printArray() {
        System.out.println("Введите число и нажмите Enter для подтверждения");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int[] array = new int[scanner.nextInt()];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("It isn`t the number");
        }
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0, то замените значение number на 10
     * вернуть number после выполнения операций
     */

    public static int operation(int number) {

        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int anInt : ints) {
            if (anInt % 2 != 0) {
                count++;
            }
        }
        System.out.print("Количество нечетных чисел в массиве: ");
        return count;
    }

    /**
     * Заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */

    public static void calculateSumOfDiagonalElements() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма главной диагонали: " + sum);
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */

    public static void countDevs(int count) {
        int devsCount = count % 100;
        if (devsCount < 11 || devsCount > 14) {
            devsCount = count % 10;
            if (devsCount == 1) {
                System.out.println(count + " программист");
            } else if (devsCount >= 2 && devsCount <= 4) {
                System.out.println(count + " программиста");
            } else {
                System.out.println(count + " программистов");
            }
        } else {
            System.out.println(count + " программистов");
        }
    }
}

