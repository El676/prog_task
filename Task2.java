import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String word1 = "madamj";
        String word2 = "dama";
        for ( int i = 0; i < word2.length(); i++ ){
            word1 = word1.replaceAll(word2.charAt(i) + "", "");
        }
        System.out.println(word1);
        
        

    }
    public static int main2(int[] b) {
        int h = 0;
        for (int num : b) {
            if (num % 2 != 0 && num % 3 == 0) {
                h++;
            }
        }
        return h;
    }
    public static void main1(String[] args) {
        System.out.println(main2(new int[]{3, 12, 7, 81, 52})); 
    }


    public static String main3 (String w) {
        String[] parts = w.split(" ");
        String initials = parts[1].substring(0, 1).toUpperCase() + "." + parts[2].substring(0, 1).toUpperCase() + ".";
        return initials + parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1);
    }

    public static void main4 (String[] args) {
        System.out.println(main3("simonov sergei evgenievich")); 
        System.out.println(main3("kozhevnikova tatiana vitalevna")); 
    }

    public static  double[] Nums(double[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n != 0)
                .sorted()
                .toArray();
    }

    public static void main5(String[] args) {
        System.out.println(Nums(new double[]{1.6, 0, 212.3, 34.8, 0, 27.5})); 
    }
    public static String hain(String Case) {
        return Case.replaceAll("([A-Z])", "_$1").toLowerCase();
    }

    public static void main6(String[] args) {
        System.out.println(hain("helloWorld")); 
    }

    public static int secondBiggest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main7(String[] args) {
        System.out.println(secondBiggest(new int[]{3, 5, 8, 1, 2, 4})); 
    }

    public static String localReverse(String str, char marker) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        while (start < str.length()) {
            int end = str.indexOf(marker, start + 1);
            if (end == -1) {
                result.append(str.substring(start));
                break;
            }
            result.append(str, start, str.indexOf(marker, start + 1))
                    .append(new StringBuilder(str.substring(str.indexOf(marker, start + 1), end + 1)).reverse());
            start = end + 1;
        }
        return result.toString();
    }

    public static void main8(String[] args) {
        System.out.println(localReverse("baobab", 'b')); 
        System.out.println(localReverse("Hello, I’m under the water, please help me", 'e')); 
    }

    public static int equal(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || b == c || a == c) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main9(String[] args) {
        System.out.println(equal(8, 1, 8)); 
        System.out.println(equal(5, 5, 5)); 
        System.out.println(equal(4, 9, 6)); 
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] chars2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static void main10(String[] args) {
        System.out.println(isAnagram("LISTEN", "silent")); 
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!")); 
        System.out.println(isAnagram("hello", "world")); 
    }
}  