package questao01.coutingsort;

public class CoutingSort {
    private Integer[] values;
    private Integer[] arrayAux;

    public CoutingSort(Integer[] array, int range){
        this.values = new Integer[range + 1];

        for(int i = 0; i < range + 1; i++){
            this.values[i] = 0;
        }

        for(int i = 0; i < array.length; i++){
            this.values[array[i]] ++;
        }

        this.arrayAux = new Integer[array.length];
        int k = 0;

        for(int i = 0; i <= range; i++){
            for(int j = 0; j < this.values[i]; j ++){
                this.arrayAux[k++] = i;
            }
        }
    }

    public Integer[] getArraySort(){
        return this.arrayAux;
    }
}
