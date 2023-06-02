public class HomeWork {
    public static void main(String[] args) {
//        System.out.println(summ(0, 5));
        System.out.println(summRec(6, -5));
    }

    private static int summRec(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        }
        if (b < 0 && a < 0) {
            a = -a;
            b = -b;
        } else if (b < 0) {
            return b + summRec(b, --a);
        }
        return a + summRec(a, b < 0 ? ++b : --b);
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
