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

    public static void main(String[] args){

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers));
        System.out.println(calculateAverage(numbers));
        System.out.println(countEvens(numbers));
        System.out.println(Arrays.toString(reverseArray(numbers)));

    }
}
