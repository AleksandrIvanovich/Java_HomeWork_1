/**
 * 2. Написать метод, принимающий на вход число и проверяющий,
 * положительное число, если да – вернуть true, в противном случае – false.
 */

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.print("Введите число (положительное или отрицательное): ");
    int number;
    number = userInput.nextInt(); 
    System.out.println(number);
    System.out.println(isPositive(number));
    }

    private static boolean isPositive(int args) {
        if (args >=0){
            return true;
        }
        else{
            return false;
        }
    }
}
