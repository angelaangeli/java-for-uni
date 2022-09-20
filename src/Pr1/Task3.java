package Pr1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        System.out.print("Enter the number of elements in the array = ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int s = 0;
        System.out.print("Enter the array = ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
            s += array[i];
        }

        float middle = (float) s / array.length;
        System.out.println("Sum = " +s);
        System.out.println("Arithmetic mean = " + middle);
    }
}
