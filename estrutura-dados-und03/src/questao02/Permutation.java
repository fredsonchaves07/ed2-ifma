package questao02;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private static int cont = 0;
    private static char[] charCorrent;
    private static List<String> newArray = new ArrayList<>();

    public static List<String> permutation(char [] data, int k){
        charCorrent = new char[k];
        merge(data, 0, k);

        return newArray;
    }

    private static void merge(char[] data, int n, int k){
        /* Best Case */
        if(n == k){
            String copyValue = "" ;
            cont ++;
            for(int i = 0; i < charCorrent.length; i++){
                copyValue += charCorrent[i];
            }

            newArray.add(copyValue);

        } else {
            for(int i = 0; i < data.length; i++){
                charCorrent[n] = data[i];
                merge(data, n + 1, k);
            }
        }
    }
}
