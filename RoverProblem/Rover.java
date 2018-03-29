package RoverProblem;

import javafx.geometry.Pos;

import java.util.Scanner;

/**
 * Created by mahadev on 2/3/18.
 */
public class Rover {
    Position position=new Position (  );

    public void setPosition(Scanner scanner)
    {
        System.out.println ("Enter landing position of rover:");
        int x=scanner.nextInt ();
        int y=scanner.nextInt ();
        String d=scanner.next ();

        position.setPosition (x,y,d);

    }



    public void move(Position position){

        switch (position.direction)
        {
            case "E":
                position.x++;
                break;
            case "S":
                position.y--;
                break;
            case "W":
                position.x--;
                break;
            case "N":
                position.y++;
                break;
        }

    }

    public void left(Position position){

        switch (position.direction)
        {
            case "E":
                position.direction= "N";
                break;
            case "S":
                position.direction= "E";
                break;
            case "W":
                position.direction= "S";
                break;
            case "N":
                position.direction= "W";
                break;
        }
    }

    public void right(Position position){

        switch (position.direction)
        {
            case "E":
                position.direction= "S";
                break;
            case "S":
                position.direction= "W";
                break;
            case "W":
                position.direction= "N";
                break;
            case "N":
                position.direction= "E";
                break;
        }
    }
}
