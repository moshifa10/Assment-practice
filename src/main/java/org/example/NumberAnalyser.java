package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberAnalyser {
    static int findMax(int[] arr){

        int max = arr[0];
        for(int num: arr){
            if (num > max){
                max = num;
            }
        }
        return max;
    }


    static int findMin(int[] arr){
        int min = arr[0];
        for(int num: arr){
            if (num<min){
                min = num;
            }
        }
        return min;
    }

    static double calculateAverage(int[] arr){
        int sum = 0;
        for (int num: arr){
            sum += num;
        }

        return (double) sum/arr.length;
    }

    static int countEvens(int[] arr){
        int count = 0;
        for (int num: arr){
            if (num%2==0){
                count++;
            }
        }
        return count;
    }

    static int[] reverseArray(int[] arr){
//        ArrayList<Integer> reverse= new ArrayList<Integer>();
        int[] reverse = new int[arr.length];
        int start = 0;
        for (int i = arr.length -1; i!=-1; i--){
            reverse[start] = arr[i];
            start++;
        }
//        System.out.println(Arrays.toString(reverse));
        return reverse;
    }
    public static  int highest(int[] arr){

        int largest = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int secondLargest(int[] arr) {
//        int largest =  highest(arr);
//        int index = -1;
//        for (int i=0; i<arr.length; i++){
//            if(largest == arr[i]){
//                index = arr[i];
//            }
//        }

        Arrays.sort(arr);
        return arr[arr.length -2];
    }

    public static int sumDigits(int number){

        String idx = Integer.toString(number);
        String a = idx.replace("-", "");
        int sum = 0;
        for (int i = 0; i<a.length(); i++){
            sum += Character.getNumericValue(a.charAt(i));
        }

        return sum;

    }

    public static String expandedForm(int num) {
        return "";
    }

    public static void main(String[] args){

        int[] numbers = {1,43,67,87,3,46,87,9,1,345,1,45676,34,654,12,4,0};

//        System.out.println(findMax(numbers));
//        System.out.println(findMin(numbers));
//        System.out.println(calculateAverage(numbers));
//        System.out.println(countEvens(numbers));
//        System.out.println(Arrays.toString(reverseArray(numbers)));
        System.out.println(secondLargest(numbers));
        System.out.println(sumDigits(-32));
    }
}
