import java.util.ArrayList;

/**
 * this is
 * Created by mo3tamed on 3/1/18.
 */
class Ride {

    int id  ;
    static int  num = 0 ;

    public Ride(int startX, int startY, int endX, int endY, int es, int lf) {
        id = num ;
        num++ ;

        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.es = es;
        this.lf = lf;
        copm();
    }


    int startX;
    int startY;
    int endX;
    int endY;
    int es;
    int lf;

    int distance ;
    boolean booked;

    public void copm (){
        distance  = Math.abs(startX - endX) + Math.abs(endY - startY) ;
    }


}

public class Car{

    int current_step  ;

    ArrayList <Integer> rides = new ArrayList<>() ;

    boolean busy ;
    int posX ;
    int posY ;
    int ride ;

    public  void addRied(Ride r ){
        busy = true ;
        posX = r.endX ;
        posY = r.endY ;
        rides.add(r.id);
        ride ++ ;
        dis(r.startX , r.startY , r.distance);

    }
    public void  dis (int x , int y , int d){
        int t = 0 ;
        t =  Math.abs(posX - x) + Math.abs(posY - y) ;
        current_step = t+ d ;
     }

    public String  display (){

        StringBuilder sb = new StringBuilder() ;
        sb.append(ride +" ");
        for (int e: rides
             ) {
            sb.append(e+" ") ;
        }
        sb.append('\n') ;

        return  sb.toString() ;
    }
}
