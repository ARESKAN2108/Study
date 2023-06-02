public class HomeWork {
    public static void main(String[] args) {
        System.out.println(summ(0, 5));
    }

    private static int summ(int a, int b) {
        int result = 0;
        if (a != 0 || b != 0) {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            for (int i = 0; i < absB; i++) {
                result += absA;
            }
        }
        if (a > 0 ^ b > 0) {
            result = -result;
        }
        return result;
    }
}
