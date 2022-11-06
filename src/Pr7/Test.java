package Pr7;

public class Test {
    public static void main(String[] args) {
        MathCalculable mathcalc = new MathFunc();
        MathFunc mathfunc = new MathFunc();
        System.out.println("Возведение в степень:");
        System.out.println(mathcalc.pow(3, 8));
        System.out.println("Модуль:");
        System.out.println(mathcalc.module(5, -1));
        System.out.println("Длина окружности:");
        System.out.println(mathfunc.Circle(9));
    }
}
