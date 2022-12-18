package Pr27TelBook;
import java.util.Hashtable;
public class Tester {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();
        HashTable book = new HashTable();
        Telephons cont1 = new Telephons("8916");
        Telephons cont2 = new Telephons("8977");
        Telephons cont3 = new Telephons("8985");
        Telephons cont4 = new Telephons("8926");
        Telephons cont5 = new Telephons("8975");
        book.hashTabAdd("Anna", cont1, table);
        book.hashTabAdd("Eror", cont2, table);
        book.hashTabAdd("Nikita", cont3, table);
        book.hashTabAdd("Rita", cont4, table);
        book.hashTabAdd("Polina", cont5, table);
        book.hashTabLookup(table);
        book.hashTabDelete(table, "Anna");
        book.hashTabDelete(table, "Polina");
        System.out.println();
        book.hashTabLookup(table);
    }

}