package questao02;

import java.util.List;

public class Main {
    public static void main(String[] args){

        char v[] = {'A', 'B'};
        List<String> newArrayCharacter;
        newArrayCharacter = Permutation.permutation(v, 3);

        for(String array : newArrayCharacter){
            System.out.println(array);
        }

    }
}
