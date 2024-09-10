public class FactorialFinder {
    public static long findFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("Факториал числа " + num + " составляет " + findFactorial(num));
    }
}
