import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main (String[] arg){

        //a loop to iterate 50 times
       for (int i = 1; i<51; i++){
 //        System.out.println (i);
       }

       boolean x = false;
       int y = 0;
/*
       while (x) {
           System.out.println (y);
           if (y==15){
               x=false;
           }
        y++;
       }

      do {

          System.out.println(y);
          if (y==15){
              x=false;
          }
          y++;
      }while (x);
*/

          String[] friends = {"mimie", "ninie", "ama", "kofi"};
          int[] ages = {12,41, 85, 2};
//
//          for (String friend : friends){
//              System.out.print(friend);
//
//        }

          for(int i = 0; i < 4; i++) {
              System.out.print(friends[i] + " - ");
              System.out.println(ages[i]);
          }


    }






}
