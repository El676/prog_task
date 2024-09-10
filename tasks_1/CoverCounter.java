public class CoverCounter {
    public static int getMaxDuvetCovers(double fabricMeters, double coverWidth, double coverHeight) {
        double totalFabricArea = fabricMeters * 2;
        double coverArea = coverWidth * coverHeight;
        return (int) (totalFabricArea / coverArea);
    }

    public static void main(String[] args) {
        double fabricMeters = 15; // длина ткани в метрах
        double coverWidth = 1.8;  // ширина пододеяльника в метрах
        double coverHeight = 2.2; // длина пододеяльника в метрах
        int maxCovers = getMaxDuvetCovers(fabricMeters, coverWidth, coverHeight);
        System.out.println("Можно сшить пододеяльников: " + maxCovers);
    }
}
