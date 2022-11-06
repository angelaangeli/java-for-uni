package Pr6.Six_Nine;

public class Test {

    public static void main(String[] args) {
        Printable[] arr = {
                new Book("Harry Potter", "Joan Rowling", 1997),
                new Shop("Skovorodka", "Hoziastvenniy")
        };
        for (Printable print: arr){
            print.print();
        }
    }
}
