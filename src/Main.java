/**
 * this is
 * Created by mo3tamed on 3/2/18.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int row, col, f , n,b,t;
        Scanner in = null;
        try {
           /* */in = new Scanner(new File("a_example.in"));
            //      in = new Scanner(new File("b_should_be_easy.in"));
            //  in = new Scanner(new File("c_no_hurry.in"));
           /* in = new Scanner(new File("d_metropolis.in"));*//**//**//**//**/
            //   in = new Scanner(new File("e_high_bonus.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        row = in.nextInt();
        col = in.nextInt();
        f = in.nextInt();
        n = in.nextInt();
        b = in.nextInt();
        t = in.nextInt();

        int a1 , b1 , x ,y ,s, ft ;

        ArrayList<Ride> rides = new ArrayList<>(n) ;

        for (int i = 0; i < n; i++) {
            a1 = in.nextInt() ;
            b1 = in.nextInt() ;
            x = in.nextInt() ;
            y = in.nextInt() ;
            s = in.nextInt() ;
            ft = in.nextInt() ;

            rides.add(new Ride(a1,b1,x,y,s,ft));
        }

        ArrayList<Car> cars = new ArrayList<>() ;
        Car temp ;
        int i ;
        for (  i = 0; i <f ; i++) {
            temp = new Car();
            temp.addRied(rides.get(i));
            cars.add(temp) ;
        }

        while(i < n - 1) {
            for (int j = 0; j < f && i< n; j++) {
                cars.get(j).addRied(rides.get(i++));
            }
        }





        try {
            PrintWriter pr = new PrintWriter(new File("ex.txt"));

            for (int j= 0;j<f ; j++)
            {
                pr.print(cars.get(j).display());

            }

            pr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}