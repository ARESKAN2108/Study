import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        System.out.println("Введите числа через пробел");

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] numbersArray = numbers.split(" ");

        for(String s : numbersArray){
            int parseNumber = Integer.parseInt(s);
            if (parseNumber > 0) {
                count++;
            }
        }

        System.out.println("Количество положительных чисел " + count);
    }
}
