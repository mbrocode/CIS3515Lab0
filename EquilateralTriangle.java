public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(double a){
        dimensions = String.valueOf((a+"x"+a+"x"+a));
    }

    @Override
    public void printDimensions(){
        System.out.println(dimensions);
    }
}
