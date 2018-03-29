package RoverProblem;

import javafx.geometry.Pos;

/**
 * Created by mahadev on 2/3/18.
 */
public class Position {
    public int x,y;
    public String direction;



    @Override
    public String toString() {
        System.out.println ("X Co-ordinate: "+x);
        System.out.println ("Y Co-ordinate: "+y);
        System.out.println ("Direction: "+direction);
        return super.toString ();
    }

    public  void setPosition(int x, int y, String direction) {
        this.x=x;
        this.y=y;
        this.direction=direction;



    }
}
