import java.lang.Math.*;

public class Circle extends Shape {

    private double rad;
    public Circle(String name) {
        super(name);
    }

    public void setDimensions(double radius){
        dimensions = String.valueOf((radius));
        rad = radius;
    }

    @Override
    public void printDimensions(){
        System.out.println(dimensions);
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(rad,2);
    }
}
