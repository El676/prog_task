public class TriangleClassifier {
    public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "Не является треугольником";
        } else if (side1 == side2 && side2 == side3) {
            return "Равносторонний";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Равнобедренный";
        } else {
            return "Разносторонний";
        }
    }

    public static void main(String[] args) {
        int side1 = 7;
        int side2 = 7;
        int side3 = 7;
        System.out.println("Тип треугольника: " + classifyTriangle(side1, side2, side3));
    }
}
