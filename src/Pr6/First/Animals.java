package Pr6.First;

public class Animals implements Nameable {
    protected String typeofAnimal;
    public Animals(String typeofAnimal){
        this.typeofAnimal = typeofAnimal;
    }
    @Override
    public void getName() {
        System.out.println("Animal: " + typeofAnimal);
    }
}


