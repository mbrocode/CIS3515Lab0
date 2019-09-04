public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double sum;
    private double per;

    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(double aS,double bS,double cS){
        if(((aS+bS)>cS)||((aS+cS)>bS)||((cS+bS)>aS)) {
            a=aS;
            b=bS;
            c=cS;
            sum = a+b+c;
            per = sum/2;
            dimensions = (a + "x" + b + "x" + c);
        }else{
            System.out.println("This triangle is impossible.");
        }
    }

    @Override
    public void printDimensions(){
        System.out.println(dimensions);
    }

    @Override
    public double getArea() {
        return Math.sqrt(per*(per-a)*(per-b)*(per-c));
    }
}
