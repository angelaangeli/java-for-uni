package Pr4;

public class Pants extends Clothes implements MenClothing, WomanClothing {
    public Pants(Sizes size, String colour, double cost ) {
        super(size,colour, cost);
    }
    @Override
    public void dressMan() {
        System.out.println("Men's pans");
    }
    @Override
    public void dressWomen() {
        System.out.println("Women's pans");
    }
}