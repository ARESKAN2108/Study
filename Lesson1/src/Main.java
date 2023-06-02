import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        int[] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = n;
            n--;
        }
        return mass;
    }
}