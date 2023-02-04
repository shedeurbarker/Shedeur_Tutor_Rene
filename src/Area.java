public class Area {

    protected double base;
    double height;
    private double radius, length, breadth;
    double result;

    public double Triangle(){
        result = 0.5 * base * height;
        return result;
    }

    public void Rectangle(double length, double breadth){
        result = breadth * length;
    }

    public void Circle(){
        result = 3.142 * radius * radius;

    }

}
