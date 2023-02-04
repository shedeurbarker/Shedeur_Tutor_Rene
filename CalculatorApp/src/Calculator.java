import java.util.Scanner;

public class Calculator {
    static int action_today;
    public static void main (String[] arg) {

        Area area = new Area();

        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want to do today:");
        System.out.println("Enter 1 - Areas of Triangles");
        System.out.println("Enter 2 - Areas of Rectangle");
        System.out.println("Enter 3 - Areas of Circles");
        System.out.println("Enter 4 - For General Arithmetic");
        System.out.print("Your Choice: ");
        action_today = scan.nextInt();

        if(action_today == 1) { // Triangles
            System.out.print("Enter Base: ");
            area.base = scan.nextDouble();
            System.out.print("Enter Height: ");
            area.height = scan.nextDouble();
            System.out.println("The Area of your rectangle is: " + area.Triangle());
        }
        else if(action_today == 2) {    // Rectangles
            System.out.print("Enter Length: ");
            double length = scan.nextDouble(); // accept the input

            System.out.print("Enter Breadth: ");    // request for input
            double breadth = scan.nextDouble();      // accept the input

            // print result to command line
            System.out.println("The Area of your rectangle is: " + area.Rectangle(length, breadth));
        }
        else if(action_today == 3) {    // Circles
            System.out.print("What is the Radius of Your Circle? ");
            area.radius = scan.nextDouble();
            area.Circle();
            // area.result() below is calling a method in the area class that returns the value of the variable result
            System.out.println("The Area of your Circle is: " + area.result());
        }
        else {  // general Arithmetic - we will work on this next section

        }




    }
}
