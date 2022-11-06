package Pr4;

public class Skirt extends Clothes implements WomanClothing {
    public Skirt(Sizes size, String colour, double cost) {
        super(size, colour, cost);
    }
    @Override
    public void dressWomen() {
        System.out.println("Woman's skirt");
    }
}
