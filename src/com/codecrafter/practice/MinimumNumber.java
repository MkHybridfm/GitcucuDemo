package com.codecrafter.practice;
public class MinimumNumber {

    public static void main(String[] args) {
        
        int[] arr = { 1, 20, 33, 60, 40, 8,1 };
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum number in the array.");
        } else {
            System.out.println("The minimum number in the given array is: " + min);
            System.out.println("The second minimum number is: " + secondMin);
        }
    }
}
