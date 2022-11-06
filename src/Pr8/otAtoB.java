package Pr8;

public class otAtoB {
    public static String raspoloz(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + raspoloz(a - 1, b);
        }
        else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + raspoloz(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(raspoloz(10, 20)); // вызов рекурсивной функции
        System.out.println(raspoloz(20, 10)); // вызов рекурсивной функции
    }
}
