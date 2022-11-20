package Pr20;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
public class Tester {
    public static void printMinMax(MinMax<?> arr){
        System.out.println(arr);
        System.out.println("Мин-\'"+arr.getMin()+'\'');
        System.out.println("Макс-\'"+arr.getMax()+'\'');
    }
    public static double[] getArray() {
        return new double[]{Calculiator.divide(20, 10), Calculiator.sum((short) 3, 600), Calculiator.multiply((byte) 22, 2.5), Calculiator.subtraction((long) 3846795, (short) 3)};
    }
    public static void printRes(double[] results) {
        NumberFormat num = getNumber();
        for (double result : results) {
            System.out.println("Ответ = " + num.format(result) + " ");
        }
    }
    public static NumberFormat getNumber() {
        NumberFormat num = NumberFormat.getInstance(Locale.ROOT);
        num.setMinimumFractionDigits(2);
        num.setMaximumFractionDigits(2);
        return num;
    }
    public static void main(String[] args){
        MinMax<Character> arrch=new MinMax<>(new Character[]{(char)((new Random()).nextInt(10)+'a'),(char)((new Random()).nextInt(10)+'a'),(char)((new Random()).nextInt(10)+'a'),(char)((new Random()).nextInt(10)+'a')});
        printMinMax(arrch);
        System.out.println();
        MinMax<Integer> arrint=new MinMax<>(new Integer[]{new Random().nextInt(100),new Random().nextInt(100),new Random().nextInt(100),new Random().nextInt(100)});
        printMinMax(arrint);
        System.out.println();
        MinMax<Double> arrdouble=new MinMax<>(new Double[]{new Random().nextDouble(100),new Random().nextDouble(100),new Random().nextDouble(100),new Random().nextDouble(100)});
        printMinMax(arrdouble);
        System.out.println();
        printRes(getArray());
    }

}
