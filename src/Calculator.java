import java.io.InputStream;
import java.util.Scanner;

public class Calculator {
    public static void main (String[] arg) {

        Area area = new Area();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Base: ");
        area.base = scan.nextDouble();

        System.out.print("Enter Height: ");
        area.height = scan.nextDouble();

        System.out.println(area.Triangle());



    }
}
