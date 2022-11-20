package Pr20;
import java.util.Arrays;
public class MinMax<T extends Comparable<T>>{
    private T[] arr;
    public MinMax(T[] arr){
        this.arr=arr;
    }
    public T getMin(){
        if(arr.length>0){
            T min=arr[0];
            for(T t:arr){
                if(t.compareTo(min)<0){
                    min=t;
                }
            }
            return min;
        }
        return null;
    }
    public T getMax(){
        if(arr.length>0){
            T max=arr[0];
            for(T t:arr){
                if(t.compareTo(max)>0){
                    max=t;
                }
            }
            return max;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MinMax{"+Arrays.toString(arr)+"}";
    }
}