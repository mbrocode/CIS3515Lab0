public class Square extends Shape {

    private double len;
    private double hei;
    public Square(String name) {
        super(name);
    }

    public void setDimensions(double length,double height){
        dimensions = (length+"x"+height);
        len = length;
        hei = height;
    }

    @Override
    public void printDimensions(){
        System.out.println(dimensions);
    }

    @Override
    public double getArea() {
        return len*hei;
    }
}
