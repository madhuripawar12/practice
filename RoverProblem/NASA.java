package RoverProblem;

import javafx.geometry.Pos;

import java.util.Scanner;

/**
 * Created by mahadev on 2/3/18.
 */
public class NASA {

    static Scanner scanner=new Scanner ( System.in);

    public static void main(String[] args) {

        RoverManager roverManager=new RoverManager ();

        Rover rover=new Rover ();

        Plateau plateau=getplateau();

        rover.setPosition(scanner);
        roverManager.setRover(rover);
        executeInstructions(roverManager);


    }

    public static void executeInstructions(RoverManager roverManager) {

        String instructions;

        System.out.println ("Enter The Instructions You Want To Perform");
        instructions=scanner.next (  );

        roverManager.execute(instructions);
    }

     public static Plateau getplateau() {

        System.out.println ("Enter Max-X & Max-Y Of Plateau:");

        int maxX=scanner.nextInt ();
        int maxY=scanner.nextInt ();

        Plateau plateau=new Plateau (maxX,maxY);

        return plateau;
     }

}
