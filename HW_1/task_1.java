/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {

        Scanner userInput  = new Scanner(System.in); 

        System.out.print("Введите первое число: ");
        int number1;
        number1 = userInput.nextInt();

        System.out.print("Введите второе число: ");
        int number2;
        number2 = userInput.nextInt();

        int summ = number1 + number2;
        System.out.println(summ);

        System.out.println(isSumBetween10And20(number1, number2));
    }

    private static boolean isSumBetween10And20(int a, int b) {
        int summ = a + b;
        if (summ >= 10 && summ <= 20){
            return true;
        }  
        else {
            return false;   
        }
    }
    
}

        

  
