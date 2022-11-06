package Pr6.First;

public class Cars implements Nameable {
    protected String modelCar;

    public Cars(String modelCar){
        this.modelCar = modelCar;
    }
    @Override
    public void getName() {
        System.out.println("Car: " + modelCar);
    }
}


