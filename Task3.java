import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


public class Task3 {
    public static boolean isStrangePair(String str1, String str2) {
        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }
        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        return str1.charAt(0) == str2.charAt(str2.length() - 1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator")); 
        System.out.println(isStrangePair("sparkling", "groups")); 
        System.out.println(isStrangePair("bush", "hubris")); 
        System.out.println(isStrangePair("", "")); 
    }

    public static List<Object[]> sale(List<Object[]> products, int discount) {
        List<Object[]> result = new ArrayList<>();
        for (Object[] product : products) {
            String name = (String) product[0];
            int price = (int) product[1];
            int newPrice = (int) Math.round(price * (1 - discount / 100.0));
            newPrice = Math.max(newPrice, 1);
            result.add(new Object[]{name, newPrice});
        }
        return result;
    }

    public static void main2(String[] args) {
        List<Object[]> products = new ArrayList<>();
        products.add(new Object[]{"Laptop", 124200});
        products.add(new Object[]{"Phone", 51450});
        products.add(new Object[]{"Headphones", 13800});

        List<Object[]> result = sale(products, 25);
        for (Object[] item : result) {
            System.out.println(item[0] + ": " + item[1]);
        }
    }

    public static boolean Shoot(int x, int y, int z, int m, int n){
        int dx = x - m;
        int dy = y - n;
        return dx * dy + dy * dy <= z * z;
    }
    public static void main3(String[] args) {
        System.out.println(Shoot(0, 0, 5, 2,2));
        System.out.println(Shoot(-2, -3, 4, 5,-6));
    }

    public static boolean parAnalysis(int num){
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return (num % 2 == sum % 2);
    }
    public static void main4(String[] args) {
        System.out.println(parAnalysis(243));
    }

    public static String rps(String player1, String player2){
        if (player1.equals(player2)) {
            return "Tie";
        }
        if ((player1.equals("rock") && player2.equals("scissors")) || 
            (player1.equals("scissors") && player2.equals("paper")) ||
            (player1.equals("paper") && player2.equals("rock"))) {
            return "Player1 wins";
        }
        else {
            return "Player2 wins";
        }
    }
    public static void main5(String[] args) {
        System.out.println(rps("rock", "paper"));
    }

    public static int bugger (int num1){
        int count = 0;
        while (num1 >= 10) {
            int product1 = 1;
            while (num1 > 0) {
                product1 *= num1 % 10;
                num1 /= 10;
            }
            num1 = product1;
            count++;
            
        }
        return count;
    }
    public static void main6(String[] args) {
        System.out.println(bugger(39));
    }

    public static String mostExpns(List<Object[]> inventory) {
        String itemName = "";
        int maxCont = 0;
        for (Object[] item: inventory){
            String name1 = (String) item[0];
            int price1 = (int) item[1];
            int quantity1 = (int) item[2];
            int totalCont = price1 * quantity1;
            if (totalCont > maxCont) {
                maxCont = totalCont;
                itemName = name1;
            }
        }
        return "Наибольшая общая стоимость" + itemName + "-" + maxCont;
    }
    public static void main7(String[] args) {
        List<Object[]> inventory = List.of(new Object[] {"Скакалка", 550, 8}, new Object[] {"Шлем", 3750, 4}, new Object[] {"Мяч", 2900, 10});
        System.out.println(mostExpns(inventory)); 
    }

    public static String longUni(String str){
        int h = str.length();
        int maxLenght = 0;
        String longestSub = "";
        for (int i = 0; i < h; i++){
            Set<Character> set = new HashSet<>();
            for (int j = i; j < h; j++){
                if (set.contains(str.charAt(j))){
                    break;
                }
                set.add(str.charAt(j));
                if (set.size() > maxLenght){
                    maxLenght = set.size();
                    longestSub = str.substring(i, j +1);
                }
            }
        }
        return longestSub;
    }
    public static void main8(String[] args) {
       System.out.println(longUni("bbb")); 
    }

    public static boolean isPrefix(String word, String prefix){
        return word.startsWith(prefix.substring(0, prefix.length() - 1));
    }
     public static boolean isSuffix(String word, String suffix){
        return word.endsWith(suffix.substring(1));
    }
    public static void main9(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }

    public static boolean doesBF(int a, int b, int c, int w, int r){
        return  (a <= w && b <= r) || (a <= r && b <= w ) || 
                (a <= w && c <= r) || (a <= r && c <= w) || 
                (b <= w && c <= r) || (b <= r && c <= w);
    }
    public static void main10(String[] args) {
       System.out.println(doesBF(1, 1, 1, 1, 1)); 
    }

}

