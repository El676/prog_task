public class GallonToLiterConversion {
    public static double toLiters(int gallonAmount) {
        final double LITERS_PER_GALLON = 3.78541;
        return gallonAmount * LITERS_PER_GALLON;
    }

    public static void main(String[] args) {
        int gallonAmount = 5;
        double liters = toLiters(gallonAmount);
        System.out.println(gallonAmount + " галонов " + liters + " литров.");
    }
}
