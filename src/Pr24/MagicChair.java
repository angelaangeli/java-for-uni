package Pr24;

public class MagicChair implements Chair{

    void doMagic(){
        System.out.println("Magic chair");
    }
    @Override
    public void sit() {
        System.out.println("magic chair sit");
    }
}
