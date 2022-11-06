package Pr4;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, String colour, double cost) {
        super(size, colour, cost);
    }
    @Override
    public void dressMan() {
        System.out.println("Man's tie");
    }
}

