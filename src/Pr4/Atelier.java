package Pr4;
public class Atelier implements MenClothing, WomanClothing {
    Clothes[] arr = {
            new Tshirt(Sizes.S, "Blue", 1000),
            new Pants(Sizes.M, "White", 2000),
            new Skirt(Sizes.L, "Black", 2500),
            new Tie(Sizes.XS, "Red", 1500)
    };

    @Override
    public void dressMan() {
        System.out.println("Men clothes:");
        for (Clothes cloth : arr) {
            if (cloth instanceof MenClothing) {
                System.out.println("Size: " + cloth.size.getDescription() + "\n" + "colour: " + cloth.color + "\n" + "cost: " + cloth.cost);
            }
            System.out.println();
        }
    }

    @Override
    public void dressWomen() {
        System.out.println("Women clothes:");
        for (Clothes cloth : arr) {
            if (cloth instanceof WomanClothing) {
                System.out.println("Size: " + cloth.size.getDescription() + "\n" + "colour: " + cloth.color + "\n" + "cost: " + cloth.cost);
            }
            System.out.println();
        }
    }
}
