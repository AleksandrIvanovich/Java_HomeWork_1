/**
 * * 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_star_4 {
    public static void main(String[] args) {
        
        Scanner userInput  = new Scanner(System.in); 
        System.out.print("Введите число (длина массива): ");
        int numLen;
        numLen = userInput.nextInt();
        System.out.print("Введите число (максимальное число в массиве): ");
        int numMax;
        numMax = userInput.nextInt();

        Random ran = new Random();
        int[] array = new int[numLen];
        for (int i = 0; i < array.length; i++) {
        array[i] = ran.nextInt(numMax);
        }

        System.out.println(Arrays.toString(array)); 
        findMaxNum(array, numMax);
    }

    private static void findMaxNum(int[] arr, int args){
        int max = 0;
        int min = args;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        if (arr[i] < min){
             min = arr[i];
        }    
        }
        System.out.println("Max = " + max);  
        System.out.println("Min = " + min);  
    }    
}
