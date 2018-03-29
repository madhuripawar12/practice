package Test;

/**
 * Created by mahadev on 17/3/18.
 */
public class CharCounter {

    public static int[] getCharCount(String string)
    {
        int[] count=new int[26];
        for(int i=0;i<string.length ();i++)
        {
            if(string.charAt ( i )=='a'||string.charAt ( i )=='A')
            {
                count[0]++;
            }
            if(string.charAt ( i )=='b'||string.charAt ( i )=='B')
            {
                count[1]++;
            }
            if(string.charAt ( i )=='c'||string.charAt ( i )=='C')
            {
                count[2]++;
            }
            if(string.charAt ( i )=='d'||string.charAt ( i )=='D')
            {
                count[3]++;
            }
            if(string.charAt ( i )=='e'||string.charAt ( i )=='E')
            {
                count[4]++;
            }
            if(string.charAt ( i )=='f'||string.charAt ( i )=='F')
            {
                count[5]++;
            }
            if(string.charAt ( i )=='g'||string.charAt ( i )=='G')
            {
                count[6]++;
            }
            if(string.charAt ( i )=='h'||string.charAt ( i )=='H')
            {
                count[7]++;
            }
            if(string.charAt ( i )=='i'||string.charAt ( i )=='I')
            {
                count[8]++;
            }
            if(string.charAt ( i )=='j'||string.charAt ( i )=='J')
            {
                count[9]++;
            }
            if(string.charAt ( i )=='k'||string.charAt ( i )=='K')
            {
                count[10]++;
            }
            if(string.charAt ( i )=='l'||string.charAt ( i )=='L')
            {
                count[11]++;
            }
            if(string.charAt ( i )=='m'||string.charAt ( i )=='M')
            {
                count[12]++;
            }
            if(string.charAt ( i )=='n'||string.charAt ( i )=='N')
            {
                count[13]++;
            }
            if(string.charAt ( i )=='o'||string.charAt ( i )=='O')
            {
                count[14]++;
            }
            if(string.charAt ( i )=='p'||string.charAt ( i )=='P')
            {
                count[15]++;
            }
            if(string.charAt ( i )=='q'||string.charAt ( i )=='Q')
            {
                count[16]++;
            }
            if(string.charAt ( i )=='r'||string.charAt ( i )=='R')
            {
                count[17]++;
            }
            if(string.charAt ( i )=='s'||string.charAt ( i )=='S')
            {
                count[18]++;
            }
            if(string.charAt ( i )=='t'||string.charAt ( i )=='T')
            {
                count[19]++;
            }
            if(string.charAt ( i )=='u'||string.charAt ( i )=='U')
            {
                count[20]++;
            }
            if(string.charAt ( i )=='v'||string.charAt ( i )=='V')
            {
                count[21]++;
            }
            if(string.charAt ( i )=='W'||string.charAt ( i )=='w')
            {
                count[22]++;
            }
            if(string.charAt ( i )=='x'||string.charAt ( i )=='X')
            {
                count[23]++;
            }
            if(string.charAt ( i )=='y'||string.charAt ( i )=='Y')
            {
                count[24]++;
            }
            if(string.charAt ( i )=='z'||string.charAt ( i )=='Z')
            {
                count[25]++;
            }
        }
        return count;
    }
}
