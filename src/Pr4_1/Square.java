package Pr4_1;

public class Square extends Shape{
    double a;
    public Square(String figure, double a) {
        super(figure);
        this.a = a;
    }
    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }
    @Override
    public double getPerimetr() {
        return a*4;
    }
    @Override
    public String toString() {
        return figure + "{" + "a=" + a + '}'+ "\n" + "Area = " + getArea() + "\n" + "Perimetr = " + getPerimetr();
    }
}
