package Pr3;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomArr {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double arr1[] = new double[n];
        double arr2[] = new double[n];
        //double arr1sort[] = new  double[n];
        //double arr2sort[] = new double[n];
        Random random = new Random();
        System.out.println("Первый массив:");
        for (int i = 0; i < n; i++) {
            arr1[i] = random.nextDouble();
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Второй массив:");
        for (int i = 0; i < n; i++) {
            arr2[i] = Math.random();
            System.out.print(arr2[i] + " ");
        }
        Arrays.sort(arr1);
        System.out.println();
        System.out.println("Первый отсортированный массив:");
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println("Второй отсортированный массив:");
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}