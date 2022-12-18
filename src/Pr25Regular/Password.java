package Pr25Regular;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        System.out.println("Введите пароль(Пароль считается надежным, если" +
                        "\nон состоит из 8 или более символов. Где символом может быть цифра, английская буква и знак подчеркивания." +
                        "\nПароль должен содержать хотя бы одну заглавную букву, одну маленькую букву, знак подчеркивания одну цифру):");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if(Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_){8,}").matcher(password).matches()){
            System.out.println("Пароль является надежным");
        }else{
            System.out.println("Пароль не является надежным");
        }
    }
}
