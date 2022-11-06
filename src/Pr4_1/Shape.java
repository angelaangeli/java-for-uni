package Pr4_1;

public class Shape {
    public String figure;
    public Shape(String figure){
        this.figure = figure;
    }
    public String getType(){
        return figure;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimetr(){
        return 0;
    }
    @Override
    public String toString() {
        return "Shape{" + "figure='" + figure + '\'' + '}';
    }
}