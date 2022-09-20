package Pr1;
import java.util.Scanner;
public class Task7 {
    public static int factorial(int a)
    {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(factorial(input.nextInt()));
    }
}