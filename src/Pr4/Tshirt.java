package Pr4;
public class Tshirt extends Clothes implements MenClothing, WomanClothing{
    public Tshirt(Sizes size, String colour, double cost){
        super(size, colour, cost);
    }
    @Override
    public void dressMan() {
        System.out.println("Men's t-shirt");
    }
    @Override
    public void dressWomen() {
        System.out.println("Women's t-shirt");
    }
}
