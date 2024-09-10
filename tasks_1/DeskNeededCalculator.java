public class DeskNeededCalculator {
    public static int getMissingDesks(int studentsCount, int desksAvailable) {
        int totalDesksNeeded = (studentsCount + 1) / 2;
        return Math.max(0, totalDesksNeeded - desksAvailable);
    }

    public static void main(String[] args) {
        int studentsCount = 30;
        int desksAvailable = 12;
        int missingDesks = getMissingDesks(studentsCount, desksAvailable);
        System.out.println("Недостаток столов: " + missingDesks);
    }
}
