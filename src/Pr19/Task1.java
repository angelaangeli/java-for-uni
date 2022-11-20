package Pr19;
import java.util.Random;
import java.util.Scanner;
class INNException extends Exception {
    INNException(String error) {
        super(error);
    }
}
public class Task1 {
    public static boolean isINNtrue(String INN) {
        Random rand = new Random();
        return rand.nextBoolean();
    }
    public static void input() throws INNException {
        Scanner sc = new Scanner(System.in);

        String name, surname, patronymic;
        String innNumber;

        System.out.println("Введите имя и фамилию: ");
        name = sc.nextLine();
        surname = sc.nextLine();
        System.out.print("Введите свой ИНН: ");
        innNumber = sc.nextLine();
        if (isINNtrue(innNumber)) {
            throw new INNException("ИНН неверный");
        }
        System.out.println("Вы можете совершить покупки");
    }

    public static void main(String[] args) {
        try {
            input();
        } catch (INNException exception) {
            exception.printStackTrace();
        }
    }
}


