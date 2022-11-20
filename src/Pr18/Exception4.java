package Pr18;
import java.util.Scanner;
public class Exception4 {
    public static void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        String intString = sc.next();
        System.out.println("\n");
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Final");
        }
    }
    public static void main(String[] args) {
        exceptionDemo();
    }
}
