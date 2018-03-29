package Assignments;

/**
 * Created by mahadev on 14/2/18.
 */
public class CharCounter{

        public static int[] count=new int[26];

        public static int[] charCount(String string1)
        {
            for(int i=0;i<string1.length ();i++) {
                if (string1.charAt ( i ) == 'a' || string1.charAt ( i ) == 'A') {
                    count[0]++;
                }
                if (string1.charAt ( i ) == 'b' || string1.charAt ( i ) == 'B') {
                    count[1]++;
                }
                if (string1.charAt ( i ) == 'c' || string1.charAt ( i ) == 'C') {
                    count[2]++;
                }
                if (string1.charAt ( i ) == 'd' || string1.charAt ( i ) == 'D') {
                    count[3]++;
                }
                if (string1.charAt ( i ) == 'e' || string1.charAt ( i ) == 'E') {
                    count[4]++;
                }
                if (string1.charAt ( i ) == 'f' || string1.charAt ( i ) == 'F') {
                    count[5]++;
                }
                if (string1.charAt ( i ) == 'g' || string1.charAt ( i ) == 'G') {
                    count[6]++;
                }
                if (string1.charAt ( i ) == 'h' || string1.charAt ( i ) == 'H') {
                    count[7]++;
                }
                if (string1.charAt ( i ) == 'i' || string1.charAt ( i ) == 'I') {
                    count[8]++;
                }
                if (string1.charAt ( i ) == 'j' || string1.charAt ( i ) == 'J') {
                    count[9]++;
                }
                if (string1.charAt ( i ) == 'k' || string1.charAt ( i ) == 'K') {
                    count[10]++;
                }
                if (string1.charAt ( i ) == 'l' || string1.charAt ( i ) == 'L') {
                    count[11]++;
                }
                if (string1.charAt ( i ) == 'm' || string1.charAt ( i ) == 'M') {
                    count[12]++;
                }
                if (string1.charAt ( i ) == 'n' || string1.charAt ( i ) == 'n') {
                    count[13]++;
                }
                if (string1.charAt ( i ) == 'o' || string1.charAt ( i ) == 'O') {
                    count[14]++;
                }
                if (string1.charAt ( i ) == 'p' || string1.charAt ( i ) == 'P') {
                    count[15]++;
                }
                if (string1.charAt ( i ) == 'q' || string1.charAt ( i ) == 'Q') {
                    count[16]++;
                }
                if (string1.charAt ( i ) == 'r' || string1.charAt ( i ) == 'R') {
                    count[17]++;
                }
                if (string1.charAt ( i ) == 's' || string1.charAt ( i ) == 'S') {
                    count[18]++;
                }
                if (string1.charAt ( i ) == 't' || string1.charAt ( i ) == 'T') {
                    count[19]++;
                }
                if (string1.charAt ( i ) == 'u' || string1.charAt ( i ) == 'U') {
                    count[20]++;
                }
                if (string1.charAt ( i ) == 'v' || string1.charAt ( i ) == 'V') {
                    count[21]++;
                }
                if (string1.charAt ( i ) == 'w' || string1.charAt ( i ) == 'W') {
                    count[22]++;
                }
                if (string1.charAt ( i ) == 'x' || string1.charAt ( i ) == 'X') {
                    count[23]++;
                }
                if (string1.charAt ( i ) == 'y' || string1.charAt ( i ) == 'Y') {
                    count[24]++;
                }
                if (string1.charAt ( i ) == 'z' || string1.charAt ( i ) == 'Z') {
                    count[25]++;
                }
            }
            return count;

        }
}

