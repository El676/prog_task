public class Palindrome {
    public static void main(String[] b) {
        for (int i = 0; i < b.length; i++){
            String s = b[i];
            
        if (isPalindrome(s)){
            System.out.println("палиндром");
        }
        else {
            System.out.println("не полиндром");
        }
        }
    } 
   public static String reverseString(String str) {
    String s = "";
    for (int i = str.length(); i > 0; i--) {
        s += str.charAt(i - 1);
    }
    return s;
   }
   public static boolean isPalindrome(String str) {
    String s2 = reverseString(str);
    return s2.equals(str);
   }
}
