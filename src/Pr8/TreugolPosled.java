package Pr8;
import java.util.Scanner;
public class TreugolPosled {
        static void TreugolPosled(int ch) {
            int k = 0;
            int j = 1;
            int res = 0;
            for (int i = 1; i <= ch; i++) {
                res += i;
            }
            for (int i = 0; i < res; i++) {
                System.out.print(j + " ");
                k++;
                if (j == k) {
                    k = 0;
                    j++;
                }
            }
        }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        TreugolPosled(ch);
    }
}
