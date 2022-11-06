package Pr8;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        CheckWord(word);
    }

    static void CheckWord(String word){
        if (word.length() == 1) {
            System.out.println("YES");
        }
        else if (word.substring(0, 1).equals(word.substring(word.length() - 1, word.length()))) {
                if (word.length() == 2) {
                    System.out.println("YES");
                }
                CheckWord(word.substring(1, word.length() - 1));
            }
        else {
                System.out.println("NO");
        }
    }
}


