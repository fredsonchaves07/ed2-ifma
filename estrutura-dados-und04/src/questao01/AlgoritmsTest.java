package questao01;

import questao01.coutingsort.CoutingSort;
import questao01.mergesort.MergeSort;
import questao01.timsort.TimSort;

import java.util.Random;

public class AlgoritmsTest{
    public static void main(String[] args) {
        int range = 9;
        Random random = new Random();
        Integer[] array = new Integer[10];

        /*Inserção de valores inteiros randomicos no array*/
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(range);
        }

        System.out.println("Números não ordenados:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        /*Declaração de Algoritmos*/
        CoutingSort coutingSort = new CoutingSort(array, range);
        TimSort timSort = new TimSort(array, array.length);
        MergeSort mergeSort = new MergeSort(array, array.length);

        /*Recebe array ordenado*/
        array = coutingSort.getArraySort();

        System.out.println("");
        System.out.println("Ordenação Couting Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        array = timSort.getArraySort();
        System.out.println("");
        System.out.println("Ordenação Tim Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        array = mergeSort.getArraySort();
        System.out.println("");
        System.out.println("Ordenação Merge Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
