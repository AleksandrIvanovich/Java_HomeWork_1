/**
 * 3. Написать метод, принимающий на вход строку и выводящий её повторяя n раз (abcd -> abcdabcdabcdabcdabcd...)
*/

import java.util.Scanner;

public class task_3 {
    
    public static void main(String[] args) {
       
        Scanner getString = new Scanner(System.in, "cp866");
        System.out.print("Ведите строку (несколько символов): ");
        String str;
        str = getString.nextLine();
    
        System.out.print("Введите число (количество повторений): ");
        int repeat;
        repeat = getString.nextInt();

        System.out.println(str);
        System.out.println(repeat);

        System.out.println(numberRepetitionLine(str,repeat));
    }
    private static String numberRepetitionLine(String source, int num) {
        String newStr;
        newStr = "";
        int count = 0; 
        while (count < num){
        newStr = newStr + source;
        count ++;
       }
       return newStr;
    }
    
}
