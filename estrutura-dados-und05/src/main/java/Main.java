import hash.Dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printHashTable(Dictionary set){
        for(int i = 0; i < set.array.length - 1; i++) {
            System.out.print("Posição " + i + ": ");
            set.array[i].list();
            System.out.println("");
        }
    }

    public static boolean isSubSet(Dictionary set1, Dictionary set2){
        for(int i = 0; i < set1.array.length; i ++) {
            if (!set2.array[i].equals(set1.array[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String dir = System.getProperty("user.dir") + "/src/main/java/";
        File fileConjS = new File(dir + "ConjuntoS.txt");
        File fileConjT = new File(dir + "ConjuntoT.txt");

        try{
            FileReader fileReader = new FileReader(fileConjS);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String arqLine ;
            List<String> fileDataConjS = new ArrayList<>();

            while ( ( arqLine = bufferedReader.readLine() ) != null) {
                fileDataConjS.add(arqLine);
            }

            fileReader.close();
            bufferedReader.close();

            String[] fileCharArray = fileDataConjS.get(0).replaceAll(" ", "").split(",");
            int[] arrayConjS = new int[fileCharArray.length];

            for(int i = 0; i < fileCharArray.length; i++){
                arrayConjS[i] = new Integer(fileCharArray[i]);
            }

            fileReader = new FileReader(fileConjT);
            bufferedReader = new BufferedReader(fileReader);
            List<String> fileDataConjT = new ArrayList<>();

            while ( ( arqLine = bufferedReader.readLine() ) != null) {
                fileDataConjT.add(arqLine);
            }

            fileReader.close();
            bufferedReader.close();

            fileCharArray = fileDataConjT.get(0).replaceAll(" ", "").split(",");
            int[] arrayConjT = new int[fileCharArray.length];

            for(int i = 0; i < fileCharArray.length; i++){
                arrayConjT[i] = new Integer(fileCharArray[i]);
            }

            Dictionary conjuntoS = new Dictionary(arrayConjS.length);
            Dictionary conjuntoT = new Dictionary(arrayConjT.length);

            for(int i = 0; i < arrayConjS.length; i++){
                conjuntoS.addHash(arrayConjS[i]);
            }

            for(int i = 0; i < arrayConjT.length; i++){
                conjuntoT.addHash(arrayConjT[i]);
            }

            System.out.println("Imprimindo tabela hash - Conjunto S");
            printHashTable(conjuntoS);
            System.out.println("");
            System.out.println("Imprimindo tabela hash - Conjunto T");
            printHashTable(conjuntoT);

            System.out.println("");
            System.out.println("Verificando Subconjunto...");

            if(isSubSet(conjuntoS, conjuntoT)){
                System.out.println("Conjunto S é sub conjunto do Conjunto T");
            } else {
                System.out.println("Conjunto S não é subconjunto do Conjunto T");
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

//
//        System.out.println("Imprimindo Conjunto 1");
//        for(int i = 0; i < conjunto1.vetor.length - 1; i++){
//        conjunto1.vetor[i].list();
//    }
//
//        System.out.println("Imprimindo Conjunto 2");
//        for(int i = 0; i < conjunto2.vetor.length - 1; i++){
//        conjunto2.vetor[i].list();
//    }
//
//        System.out.println("Subconjunto");
//        for(int i = 0; i < conjunto1.vetor.length; i ++){
//        if(! conjunto2.vetor[i].equals(conjunto1.vetor[i])){
//            System.out.println("Conjunto 2 não é subconjunto de 1");
//            break;
//        }
//
//    }
}
