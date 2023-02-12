import java.util.Random;
import java.util.Arrays;

public class task_star_2 {

    public static void main(String[] args) {

        Random ran = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
        array[i] = ran.nextInt(11);
        }

        System.out.println(Arrays.toString(array));
        replacingNumber(array);
        System.out.println(Arrays.toString(array));
    }

    private static void replacingNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
    }
}
