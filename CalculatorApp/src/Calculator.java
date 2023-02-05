import java.util.Scanner;

public class Calculator {
    static int action_today;
    public static void main (String[] arg) {

        Area area = new Area();
        Maths maths = new Maths();
        Scanner scan = new Scanner(System.in);

        boolean calculate = true;

        System.out.println("What do you want to do today:");
        while(calculate){

            System.out.println("Enter 1 - Areas of Triangles");
            System.out.println("Enter 2 - Areas of Rectangle");
            System.out.println("Enter 3 - Areas of Circles");
            System.out.println("Enter 4 - For General Arithmetic");
            System.out.println("Enter 0 - To end Program");
            System.out.print("Your Choice: ");
            action_today = scan.nextInt();

            if (action_today == 1) { // Triangles
                System.out.print("Enter Base: ");
                area.base = scan.nextDouble();
                System.out.print("Enter Height: ");
                area.height = scan.nextDouble();
                System.out.println(area.Triangle());
            } else if (action_today == 2) {// Rectangle
                System.out.print("Enter Length ");
                double length = scan.nextDouble();
                System.out.print("Enter breadth ");
                System.out.println(area.Rectangle(length, scan.nextDouble()));
            } else if (action_today == 3) {// Circle
                System.out.print("Enter radius ");
                area.radius = scan.nextDouble();
                area.Circle();
                System.out.println(area.result());
            }
            else if (action_today == 4) {// General Mathematics
                System.out.println("What type Operation:");

                System.out.println("Enter 1 - Addition");
                System.out.println("Enter 2 - Subtraction");
                System.out.println("Enter 3 - Multiplication");
                System.out.println("Enter 4 - Division");
                System.out.println("Enter 0 - To End Program");
                System.out.print("Your Choice: ");
                action_today = scan.nextInt();

                System.out.print("Enter 1st Number: ");
                maths.a = scan.nextDouble();
                System.out.print("Enter 2nd Number: ");
                maths.b = scan.nextDouble();

                switch (action_today) {
                    case 1:
                        System.out.println(maths.Add());
                        break;
                    case 2:
                        maths.subtract();
                        System.out.println(maths.getResult());
                        break;
                    case 3:
                        maths.multiply();
                        System.out.println(maths.getResult());
                        break;
                    case 4:
                        maths.divide();
                        System.out.println(maths.getResult());
                        break;
                    default:
                        System.out.println("Sorry, Enter a number between 1 - 4");
                }


            }
            else if(action_today == 0) {
                calculate = false;
            }
            else {
                System.out.println("Sorry, Enter a number between 1 - 4");
            }

        } // end of while
        System.out.println("Thank you for passing by");


















//        else if(action_today == 2) {    // Rectangles
//            System.out.print("Enter Length: ");
//            double length = scan.nextDouble(); // accept the input
//
//            System.out.print("Enter Breadth: ");    // request for input
//            double breadth = scan.nextDouble();      // accept the input
//
//            // print result to command line
//            System.out.println("The Area of your rectangle is: " + area.Rectangle(length, breadth));
//        }
//        else if(action_today == 3) {    // Circles
//            System.out.print("What is the Radius of Your Circle? ");
//            area.radius = scan.nextDouble();
//            area.Circle();
//            // area.result() below is calling a method in the area class that returns the value of the variable result
//            System.out.println("The Area of your Circle is: " + area.result());
//        }
//        else {  // general Arithmetic - we will work on this next section
//
//        }




    }
}
