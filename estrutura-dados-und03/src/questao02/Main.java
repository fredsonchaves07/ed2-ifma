package questao02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        File arq = new File("entrada.txt");

        try{
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                System.out.println(linha);
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        char v[] = {'A', 'B'};
        List<String> newArrayCharacter;
        newArrayCharacter = Permutation.permutation(v, 3);

        for(String array : newArrayCharacter){
            System.out.println(array);
        }

    }
}
