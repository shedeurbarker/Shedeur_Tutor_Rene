public class Area {

    protected double base;
    double height;
    protected double radius, length, breadth;
    double result;

    public double Triangle(){
        result = 0.5 * base * height;
        return result;
    }

    public double Rectangle(double length, double breadth){
        return breadth * length;
    }

    public void Circle(){
        result = 3.142 * radius * radius;
    }

    public double result() {
        return result;
    }

}
