package Pr6.Six_Nine;

public class Book implements Printable {
    String name;
    String author;
    int year;
    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    @Override
    public void print() {
        System.out.println("Book: " + name + ", " + author+ ", " + year);
    }
}
