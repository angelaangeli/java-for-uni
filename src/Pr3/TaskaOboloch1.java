package Pr3;
import java.util.Scanner;
public class TaskaOboloch1 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Double d = Double.valueOf(1);
    System.out.println();
    String zn = scan.nextLine();
    Double Parse = Double.parseDouble(zn);
    System.out.println(Parse);
    int b = d.intValue();
    System.out.println(b);
    double c = d.doubleValue();
    System.out.println(c);
    byte a = d.byteValue();
    System.out.println(d);
    short f = d.shortValue();
    System.out.println(f);
    float g = d.floatValue();
    System.out.println(g);
    long h = d.longValue();
    System.out.println(h);
    String s = Double.toString(3.14);
    System.out.println(s);

    }
}

