/**
 * 4. Проверить, является ли год високосным. Если да - return true, 
 * иначе - return false.
*/

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        Scanner getYear = new Scanner(System.in);
        System.out.print("Задайте год: ");
        int year = getYear.nextInt();   
        System.out.println(defineLeapYear(year));
    }    

    private static boolean defineLeapYear(int a) {
        if ((a % 4 == 0) & (a % 100 != 0) | (a % 400 == 0)){
           return true;
        }  
        else {
            return false;   
        }
    }
}