package Pr24;
public class FunctionalChair implements Chair{
    public int sum(int a, int b){
        return a+b;
    }
    @Override
    public void sit() {
        System.out.println("Functional chair");
    }
}

