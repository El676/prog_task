public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
            System.out.println(i);
        }
    }
    public static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j ==0)
            return false;
        }
        return true;
    }
}