package questao02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String dir = System.getProperty("user.dir") + "/src/questao02/";
        File arq = new File(dir + "entrada.txt");

        try{
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String arqLine ;
            List<String> fileData = new ArrayList<>();


            while ( ( arqLine = bufferedReader.readLine() ) != null) {
                fileData.add(arqLine);
            }

            fileReader.close();
            bufferedReader.close();

            String[] fileCharArray = fileData.get(0).replaceAll(" ", "").split(",");
            char[] arrayCharacter = new char[fileCharArray.length];
            int k = new Integer(fileData.get(1));
            List<String> newArrayCharacter;

            for(int i = 0; i < fileCharArray.length; i++){
                arrayCharacter[i] = fileCharArray[i].charAt(0);
            }

            newArrayCharacter = Permutation.permutation(arrayCharacter, k);
            for(String array : newArrayCharacter){
                System.out.println(array);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
