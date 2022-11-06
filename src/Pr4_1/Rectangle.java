package Pr4_1;

public class Rectangle extends Shape{
    double a, b;
    public Rectangle(String figure, double a, double b) {
        super(figure);
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return a*b;
    }
    @Override
    public double getPerimetr() {
        return (a+b)*2;
    }
    @Override
    public String toString() {
        return figure + "{" +
                "a=" + a + ", b=" + b + '}' + "\n" + "Area = " + getArea() + "\n" + "Perimetr = " + getPerimetr();
    }
}
