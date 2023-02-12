import java.util.Scanner;
import java.util.Arrays;

public class task_star_3 {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.print("Введите число (длина массива): ");
        int lenArr = getNum.nextInt();  
        
        int[][] arr = new int[lenArr][lenArr];
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("");
        fillingDiagonals(arr,lenArr);
        
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static void fillingDiagonals(int[][] array, int len){
        for(int i = 0; i < len;){
            for(int j = 0; j < len;){
                if (i != len | j != len){
                    array[i][j] = 1;
                    i ++;
                    j ++;
                }
            }
        }
        for(int i = len-1; i >= 0;){
            for(int j = 0; j < len;){
                if (i >= 0 | j != 0){
                    array[i][j] = 1;
                    i --;
                    j ++;
                }
            }
        }
    }
}