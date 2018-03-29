package ComparatorDemo;

/**
 * Created by mahadev on 23/3/18.
 */
public class StringSort {

    public static int DictSort(String str1,String str2){
        int i = 0;

        while(i<str1.length()||i<str2.length ()) {

            if (str1.charAt ( i ) < str2.charAt ( i ))
                return -1;
            if (str1.charAt ( i ) > str2.charAt ( i ))
                return 1;
            else
                i++;
        }
        if(i==str1.length ())
            return -1;
        else
            return 1;


    }
}
