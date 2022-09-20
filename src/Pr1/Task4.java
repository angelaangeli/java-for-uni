package Pr1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array = ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int s = 0;
        System.out.print("Enter the array = ");
        int i = 0;
        for (i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        int min = array[0], max = array[0];
        i = 0;
        while (i < array.length)
        {
            s += array[i];
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
            i += 1;
        }
        System.out.println("Using the while loop");
        System.out.println("Sum = " + s);
        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);
        i = 0;
        do {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
            i += 1;
        } while (i <= array.length - 1) ;
        System.out.println("Using the do while loop");
        System.out.println("Sum = " + s);
        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);
    }
}
