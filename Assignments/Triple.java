package Assignments;

/**
 * Created by mahadev on 15/2/18.
 */
public class Triple  {
    public static int countTriple(String string) {
        int triples=0;
        for(int i=0;i<string.length ();i++){

            if(string.charAt ( i )==string.charAt ( i++ ))
            {

                if(string.charAt ( i )==string.charAt ( i++ ))
                {
                    triples++;
                    if(string.charAt ( i )==string.charAt ( i++ ))
                    {
                        triples++;
                    }
                }
            }
        }

        return triples;
    }
}
