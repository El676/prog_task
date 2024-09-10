public class MaximumFinder {
    public static int getLarger(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 5;
        System.out.println("Большее значение: " + getLarger(number1, number2));
    }
}
