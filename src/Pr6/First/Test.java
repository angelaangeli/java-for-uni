package Pr6.First;

import Pr6.First.Animals;
import Pr6.First.Cars;
import Pr6.First.Planets;

public class Test {
    public static void main(String[] args) {
        Cars Mersedes = new Cars("Mersedes");
        Cars bmw = new Cars("BMW");
        Animals cat = new Animals("Cat");
        Animals dog = new Animals("Dog");
        Planets Mars = new Planets("Mars");
        Planets Jupyter = new Planets("Jupyter");
        Mersedes.getName();
        bmw.getName();
        cat.getName();
        dog.getName();
        Mars.getName();
        Jupyter.getName();
    }
}


