import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean ret= false;
        int cA= 0; int cB=0;
        int lenA= a.length();
        int lenB= b.length();
        if(lenA != lenB){
            return false;
        }else{
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
           
           for (int i = 0; i < ch1.length; i++) {
            for (int j = i + 1; j < ch1.length; j++) {
                if (Character.toLowerCase(ch1[j]) < Character.toLowerCase(ch1[i])) {
                    swapChars(i, j, ch1);
                }
            }
        }
            for (int i = 0; i < ch2.length; i++) {
            for (int j = i + 1; j < ch2.length; j++) {
                if (Character.toLowerCase(ch2[j]) < Character.toLowerCase(ch2[i])) {
                    swapChars(i, j, ch2);
                }
            }
        }
        String str1 = new String(ch1);
        String str2 = new String(ch2);
        if(str1.equalsIgnoreCase(str2)){
            return true;
        }else{
            return false;
        }
        }
    }
    private static void swapChars(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
