package Pr24;
public class Tester {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        chairFactory.createChair(ChairType.Victorian);
        chairFactory.createChair(ChairType.Magic);
        chairFactory.createChair(ChairType.Functional);
    }
}
