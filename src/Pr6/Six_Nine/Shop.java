package Pr6.Six_Nine;

public class Shop implements Printable{
    String name;
    String type;
    public Shop(String name, String type){
        this.name = name;
        this.type = type;
    }
    @Override
    public void print() {
        System.out.println("Shop: " + name + ", " + type);

    }

}