import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        amoeba();
        System.out.println("Результат вычисления умножения = " + sum(-5, 4));
        numbers();
        workWithArray();
        creatArray();
    }

    // 1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    // сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    private static void amoeba() {
        int countAmoeba = 1;
        for (int i = 3; i < 25; i += 3) {
            countAmoeba *= 2;
            System.out.println("Через " + i + "ч. " + "амеб будет " + countAmoeba);
        }
    }

    //2) Напишите реализацию метода summ(int a, int b), вычисляющий a * b, не пользуясь операцией
    //умножения, где a и b целые числа, вызовите метод sum в методе main и распечатайте на консоль.

    public static int sum(int a, int b) {
        int result = 0;
        // я понял в чём проблема была
        // тут мы возвращаем модуль отрицательного числа чтобы выполнилось условие
        for (int i = 0; i < Math.abs(a); i++) {
            result += b;
        }
        if (a < 0 ^ b < 0) {
            result = -(Math.abs(result));
        } else {
            result = Math.abs(result);
        }
        return result;
    }

    private static void numbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int num = scanner.nextInt();
        int lengthNumber = String.valueOf(Math.abs(num)).length();

        if (num > 0) {
            System.out.println("\" " + num + " - это положительное число, " + "количество цифр = " + lengthNumber + " \"");
        } else if (num < 0) {
            System.out.println("\" " + num + " - это отрицательное число, " + "количество цифр = " + lengthNumber + " \"");
        } else {
            System.out.println("Вы ввели ноль, попробуйте заново");
        }
    }

    //  6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
    //  Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
    //  Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    private static void workWithArray() {

        Random random = new Random();
        int[] mass = new int[12];
        int maxElement = 0;
        int maxIndex = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
            System.out.print(mass[i] + " ");
            if (maxElement <= mass[i]) {
                maxElement = mass[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент " + maxElement + ", " + "индекс его последнего вхождения в массив " + maxIndex);
    }

    // 7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
    // Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
    // Снова выведете массив на экран на отдельной строке.

    private static void creatArray() {
        int[] mass = new int[20];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20);
            System.out.print(mass[i] + "\t");
        }
        System.out.println();

        int temp = 0;
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {
                mass[i] = temp;
            }
            System.out.print(mass[i] + "\t");
        }
        System.out.println();
    }
}
