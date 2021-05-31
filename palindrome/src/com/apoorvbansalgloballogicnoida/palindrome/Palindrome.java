package com.apoorvbansalgloballogicnoida.palindrome;

public class Palindrome {

    public boolean checkPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        String reverseStr=sb.reverse().toString();
        return str.equals(reverseStr);
    }
    public boolean checkPalindrome(Integer n){
        return checkPalindrome(n.toString());
    }
    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome();
        boolean result=palindrome.checkPalindrome("malayalam");
        System.out.println(result);
    }
}
