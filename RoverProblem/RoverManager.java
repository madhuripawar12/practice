package RoverProblem;

import javafx.geometry.Pos;

/**
 * Created by mahadev on 2/3/18.
 */
public class RoverManager {

    Rover rover;

    public void execute(String instructions) {

        char[] instr=instructions.toCharArray ();

        for(int i=0;i<instr.length;i++){

            switch (instr[i]){
                case 'M':
                   rover.move ( rover.position );
                    break;
                case 'L':
                    rover.left (rover.position);
                    break;
                case 'R':
                    rover.right (rover.position);
                    break;
                default:
                    System.out.println ("Invalid Instruction:");
            }
        }

        System.out.println ("Position Of rover: "+rover.position);
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }
}
