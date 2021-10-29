package lab1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        args = s.split(" ");
        for (int i = 0; i < args.length; i++) {
            s = args[i];
            System.out.println(s + " - " + isPalindrome(s));
        }

    }
    //строка задом на перед
    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
    //проверка на палиндром
    public static boolean isPalindrome (String s){
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }
        if (s.equals(res)){
            return true;
        }
        return false;
    }
}
