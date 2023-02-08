import java.util.ArrayList;

public class Options {


    public ArrayList<String> FirstOption(){
        ArrayList<String> option = new ArrayList<>(8);
        option.add("Enter 1 - Areas of Triangles");
        option.add("Enter 2 - Areas of Rectangle");
        option.add("Enter 3 - Areas of Circles");
        option.add("Enter 4 - For General Arithmetic");
        option.add("Enter 5 - Perimeter of Triangles");
        option.add("Enter 6 - Perimeter of Rectangle");
        option.add("Enter 7 - Perimeter of Circle");
        option.add("Enter 0 - to end program");
        option.add("Your Choice: ");
        return option;
    }
}
