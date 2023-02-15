public class Perimeter {
    public double length, width, radius;
    public double a, b, c;
    double result;

    public double Triangle(){
        result = a+b+c;
        return result;
    }
    public double Rectangle(){
        result = width+width+length+length;
        return result;
    }
    public double Circle(){
        result = 2 * 3.142 * radius;
        return result;
    }

    public double Square() {
        return length * 4;
    }
}
