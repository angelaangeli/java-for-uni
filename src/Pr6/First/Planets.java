package Pr6.First;

import Pr6.First.Nameable;

public class Planets implements Nameable {
    protected String planet;
    public Planets(String planet){
        this.planet = planet;
    }
    @Override
    public void getName() {
        System.out.println("Planet: " + planet);
    }
}
