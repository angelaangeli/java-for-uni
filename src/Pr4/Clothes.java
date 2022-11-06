package Pr4;
public abstract class Clothes {
    public Sizes size;
    public String color;
    public double cost;
    public Clothes(Sizes size, String color, double cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public void setSize(Sizes size){
        this.size=size;
    }

    public void setColour(String colour){
        this.color = colour;
    }

    public void setCost(double cost){
        this.cost=cost;
    }
    public void getSize(Sizes size){
        this.size=size;
    }

    public void getColour(String colour){
        this.color = colour;
    }

    public void getCost(double cost){
        this.cost=cost;
    }

}