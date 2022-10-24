package Pr3;
public class Increasing {
    public static void main(String[] args){
        int[] arr =new int[4];
        int i = 0;
        for(i=0;i<4;i++){
            arr[i] = (int)(Math.random() * 90 + 10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i = 1;i < 4;i++){
            if(arr[i-1] >= arr[i]){
                System.out.println("Не строго возрастает");
                break;
                }
            }
        if(i == 3){
            System.out.println("Строго возрастает");
    }
}


        }
