public class CalorieCounter {
    public static int getBurnedCalories(int duration, int intensityLevel) {
        int caloriesBurnedPerMinute = 0;
        if (intensityLevel == 1) {
            caloriesBurnedPerMinute = 5;
        } else if (intensityLevel == 2) {
            caloriesBurnedPerMinute = 9;
        } else if (intensityLevel == 3) {
            caloriesBurnedPerMinute = 14;
        }
        return duration * caloriesBurnedPerMinute;
    }

    public static void main(String[] args) {
        int duration = 45;
        int intensityLevel = 3;
        int totalCalories = getBurnedCalories(duration, intensityLevel);
        System.out.println("вы сожгли " + totalCalories + " каллорий за " + duration + " минут(у).");
    }
}
