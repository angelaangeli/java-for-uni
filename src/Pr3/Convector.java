package Pr3;
import java.util.Scanner;
public class Convector {
    double dollar = 0;
    double euro = 0;
    double rub = 0;
    public Convector( double dollar, double euro){
        this.dollar = dollar;
        this.euro = euro;
    }
    public double Euro(double rub){
        return (rub/euro);
    }
    public double Dollar(double rub){
        return (rub/dollar);
    }
}
class Perevod{
    public static void main(String[] args) {
        System.out.println("Сколько рублей нужно перевести в валюту?");
        Scanner scan = new Scanner(System.in);
        Convector conv = new Convector(50, 60);
        int rub = scan.nextInt();
        System.out.println("Сумма рублей равна " + conv.Euro(rub) + " евро и " + conv.Dollar(rub) + " долларов");
        }
}

