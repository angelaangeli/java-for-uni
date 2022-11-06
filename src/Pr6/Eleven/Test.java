package Pr6.Eleven;

public class Test implements ConvertTemp {
    public double temp;
    public Test(double temp){
        this.temp = temp;
    }
    @Override
    public void Faringate() {
        double t = (9/5)*temp + 32;
        System.out.println("Faringate: " + t);
    }
    @Override
    public void Kelvin() {
        double t = temp + 273;
        System.out.println("Kelvin: " + t);
    }
    public static void main(String[] args) {
        Test test = new Test(10);
        test.Faringate();
        test.Kelvin();
    }
}
