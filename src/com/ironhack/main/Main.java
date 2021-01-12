package com.ironhack.main;

public class Main {
    public static void main(String[] args) {
        int[] integerList = {3, 65, 7, 7, 53, 1};
        double var1 = 3.0;
        double var2 = 2.0;
        System.out.println(difference(integerList));
        searchTwoMinimum(integerList);
        System.out.println(mathOperation(var1, var2));
    }

    // Exercise number 1: Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
    public static int difference(int[] integerList) {
        int maxValue = integerList[0];
        int minValue = integerList[0];

        for (int i = 0; i < integerList.length; i++) {
            if (integerList[i] > maxValue) {
                maxValue = integerList[i];
            }
            if (integerList[i] < minValue) {
                minValue = integerList[i];
            }
        }
        return (maxValue - minValue);
    }

    //Exercise number 2: Write a Java program to find smallest and second smallest elements of a given array and print it in the console.
    public static void searchTwoMinimum(int[] integerList) {
        int minValue1 = integerList[0];
        int minValue2 = integerList[1];
        int minValue1Index = 0;

        for (int i = 0; i < integerList.length; i++) {
            if (integerList[i] < minValue1) {
                minValue1 = integerList[i];
                minValue1Index = i;
            }
        }
        for (int i = 0; i < integerList.length; i++) {
            if (integerList[i] < minValue2 && i != minValue1Index) {
                minValue2 = integerList[i];
            }
        }
        System.out.println("Los números mas pequeños son: "+minValue1 +" y "+minValue2);
    }


    //Exercise number 3: Write a Java program who resolve this mathematical expression expression where x and y are two variables presetted in your code.
    public static double mathOperation(double var1, double var2) {
        double subResult = ((var2*4/5)-var1);
        double result = Math.pow(var1,2)+Math.pow(subResult, 2);
        return result;
    }
}
