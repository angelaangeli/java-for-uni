package Pr7;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }
    @Override
    public double module(double c, double d) {
        return Math.sqrt(c*c + d*d);
    }
    public double Circle(double r){
        return 2*pi*r;
    }
}

