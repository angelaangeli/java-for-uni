package FrameworkCollection;
import java.util.Arrays;
import java.util.Stack;
public class Task1 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Stack<Integer> myStack=new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            myStack.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=myStack.pop();
            System.out.print(arr[i] + " ");
        }
    }
}
