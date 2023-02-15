import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int action_today;


    public static void main(String[] arg) {

        Area area = new Area();
        Maths maths = new Maths();
        Perimeter perimeter = new Perimeter();

        boolean calculate = true;
        Scanner scan = new Scanner(System.in);


        while (calculate){
            Options options = new Options();
            ArrayList<String> option = options.FirstOption();

            for (String s : option) {
                System.out.println(s);
            }

            action_today = scan.nextInt();

            if(action_today == 0) {
                System.out.println("Thank for your time!!!!");
                calculate = false;
            }
            else if (action_today == 1) { // Triangles
                System.out.print("Enter Base: ");
                area.base = scan.nextDouble();
                System.out.print("Enter Height: ");
                area.height = scan.nextDouble();
                System.out.println("The Area of your Triangle is: " + area.Triangle());
                System.out.println();
            }
            else if (action_today == 2) {    // Rectangles
                System.out.print("Enter Length: ");
                double length = scan.nextDouble(); // accept the input

                System.out.print("Enter Breadth: ");    // request for input
                double breadth = scan.nextDouble();      // accept the input

                // print result to command line
                System.out.println("The Area of your rectangle is: " + area.Rectangle(length, breadth));
            }
            else if (action_today == 3) {    // Circles
                System.out.print("What is the Radius of Your Circle? ");
                area.radius = scan.nextDouble();
                area.Circle();
                // area.result() below is calling a method in the area class that returns the value of the variable result
                System.out.println("The Area of your Circle is: " + area.result());
            }
            else if (action_today == 4) {    // Square
                System.out.print("What is the length of Your square? ");
                area.length = scan.nextDouble();
                System.out.println("The Area of your square is: " + area.Rectangle(area.length, area.length));
            }
            else if (action_today == 6){// Triangle
                System.out.print("Enter 1st side");
                perimeter.a = scan.nextDouble();
                System.out.print("Enter 2nd side");
                perimeter.b = scan.nextDouble();
                System.out.print("Enter 3rd side");
                perimeter.c = scan.nextDouble();
                System.out.println("The perimeter of your triangle is " + perimeter.Triangle());
                System.out.println();
            }
            else if (action_today == 7){// Rectangle
                System.out.print("Enter length: ");
                perimeter.length = scan.nextDouble();
                System.out.print("Enter width: ");
                perimeter.width = scan.nextDouble();
                System.out.println("The perimeter of your Rectangle is " + perimeter.Rectangle());
                System.out.println();
            }
            else if (action_today == 8){// Circle
                System.out.print("Enter radius: ");
                perimeter.radius = scan.nextDouble();
                System.out.println("The perimeter of your Circle is " + perimeter.Circle());
                System.out.println();
            }
            else if (action_today == 5){// Square
                System.out.print("Enter Length: ");
                perimeter.length = scan.nextDouble();
                System.out.println("The perimeter of your Square is " + perimeter.Square());
                System.out.println();
            }
            else if(action_today == 9) {// general Arithmetic
                boolean arithmetric = true;

                {
                    System.out.println("What type of operation ");
                    while(arithmetric){
                        ArrayList<String> option2 = new ArrayList<>();
                        option2.add("Enter 1- for addition ");
                        option2.add("Enter 2- for subtraction");
                        option2.add("Enter 3- for multiplication");
                        option2.add("Enter 4- for division");
                        option2.add("Enter 0 - to go back");
                        option2.add("Your Choice: ");
                        for(int a =0; a < option2.size(); a++){
                            System.out.println(option2.get(a));
                        }
                        action_today = scan.nextInt();

                        switch (action_today) {
                            case 0:
                                arithmetric = false;
                                break;
                            case 1:
                                System.out.print("Enter 1st Number: ");
                                maths.a = scan.nextDouble();
                                System.out.print("Enter 2nd Number: ");
                                maths.b = scan.nextDouble();
                                System.out.println(maths.Add());
                                break;
                            case 2:
                                System.out.print("Enter 1st Number: ");
                                maths.a = scan.nextDouble();
                                System.out.print("Enter 2nd Number: ");
                                maths.b = scan.nextDouble();
                                maths.subtract();
                                System.out.println(maths.getResult());
                                break;
                            case 3:
                                System.out.print("Enter 1st Number: ");
                                maths.a = scan.nextDouble();
                                System.out.print("Enter 2nd Number: ");
                                maths.b = scan.nextDouble();
                                maths.multiply();
                                System.out.println(maths.getResult());
                                break;
                            case 4:
                                System.out.print("Enter 1st Number: ");
                                maths.a = scan.nextDouble();
                                System.out.print("Enter 2nd Number: ");
                                maths.b = scan.nextDouble();
                                maths.divide();
                                System.out.println(maths.getResult());
                                break;
                            default:
                                System.out.println("Sorry, Enter a number between 1 - 4");
                        }


                    }



                }


            }

        }
    }}
