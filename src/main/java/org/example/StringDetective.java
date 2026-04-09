package org.example;

import java.util.Arrays;

public class StringDetective {

    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        char[] reversed = new char[s.length()];
        int count = 0;

        for ( int i= s.length()-1; i!= -1; i--){
            reversed[count] = s.charAt(i);
            count ++;
        }
//        System.out.println(reversed);

        String newReversed = new String(reversed);
        return s.equals(newReversed);
    }

    static  int countVowels(String s){
        int count = 0;
        s = s.toLowerCase();
        String vowels = "aeiou";
        for (int i =0; i<s.length(); i++){
            if (vowels.contains(""+s.charAt(i))){
                count ++;
            }
        }
        return count;
    }


    static String reverseWords(String s){
        String[] myArray= s.split(" ");
        int start = 0;
        String[] reverse = new String[myArray.length];

        for (int i = myArray.length-1; i != -1; i--){
            reverse[start] = myArray[i];
            start++;
        }
        return String.join(" ", reverse);
    }

    static String capitaliseEachWord(String s){
        String[] myArray = s.split(" ");
        for (int i=0; i<myArray.length; i++){
            String n = myArray[i];
            String ch = ("" +n.charAt(0)).toUpperCase() + n.substring(1);
            myArray[i] = ch;
        }

        return String.join(" ", myArray);
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("RaceCAR"));
        System.out.println(countVowels("aeiou"));
        System.out.println(reverseWords("hello world java"));
        System.out.println(capitaliseEachWord("we think code"));
    }
}
