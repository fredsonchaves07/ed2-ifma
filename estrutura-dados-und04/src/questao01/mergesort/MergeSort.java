package questao01.mergesort;

public class MergeSort {
    private int element = 1;
    private Integer[] newArray;

    public MergeSort(Integer[] array, int length){
        this.newArray = array;
        int start, midle, end;

        while(this.element < length){
            start = 0;
            while(start + element < length){
                midle = start + element;
                end = start + 2 * element;

                if(end > element){
                    end = length;
                }

                intercalate(newArray, start, midle, end);
                start = end;
            }
            element = element * 2;
        }
    }

    public Integer[] getArraySort(){
        return this.newArray;
    }

    public void intercalate(Integer[] array, int start, int midle, int end){
        Integer arrayAux[] = new Integer[end - start];
        int i = start;
        int m = midle;
        int pos = 0;

        while(i < midle && m < end){
            if(array[i] <= array[m]){
                arrayAux[pos] = array[i];
                pos ++;
                i++;
            } else {
                arrayAux[pos] = array[m];
                pos++;
                m++;
            }
        }

        while(i < midle){
            arrayAux[pos] = array[i];
            pos++;
            i++;
        }

        while(m < end){
            arrayAux[pos] = array[m];
            pos++;
            m++;
        }

        for(pos = 0, i = start; i < end; i++, pos++) {
            array[i] = arrayAux[pos];
        }
    }
}
