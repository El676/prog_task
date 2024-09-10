public class NODFinder {
    public static int calculateNOD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void main(String[] args) {
        int number1 = 48;
        int number2 = 18;
        System.out.println("Наибольший общий делитель чисел " + number1 + " и " + number2 + " составляет " + calculateNOD(number1, number2));
    }
}
