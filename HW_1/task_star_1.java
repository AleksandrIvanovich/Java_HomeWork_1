/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

import java.util.Random;
import java.util.Arrays;
public class task_star_1 {

    public static void main(String[] args) {

        Random ranArray = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
        array[i] = ranArray.nextInt(2);
        } 

        System.out.println(Arrays.toString(array));
        replacingNumber(array);
        System.out.println(Arrays.toString(array));
    }

    private static void replacingNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                array[i] = 0;
            }
            else array[i] = 1;
        }
    }
}
