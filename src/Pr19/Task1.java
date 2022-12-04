package Pr19;
import java.util.Random;
import java.util.Scanner;
class INNException extends Exception {
    INNException(String message) {
        super(message);
    }
}
public class Task1 {
    public static int isINNtrue(Integer INN) {
        if( INN < 1000 || INN < 0){
            return 0;
        }
        else return 1;

    }
    public static void input() throws INNException {
        Scanner sc = new Scanner(System.in);
        String name, surname;
        Integer innNumber;
        System.out.println("Введите имя и фамилию: ");
        name = sc.nextLine();
        surname = sc.nextLine();
        System.out.print("Введите свой ИНН: ");
        innNumber = sc.nextInt();
        if (isINNtrue(innNumber) == 0) {
            throw new INNException("ИНН неверный");
        }
        else System.out.println("Данные верны");
    }
    public static void main(String[] args) {
        try {
            input();
        } catch (INNException e) {
            e.printStackTrace();
        }
    }
}


