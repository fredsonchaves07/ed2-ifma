package questao01.timsort;

public class TimSort {

    private static int MIN_MERGE = 32;
    private Integer[] arrayAux;

    public TimSort(Integer[] array, int n){
        this.arrayAux = array;
        for(int i = 0; i < n; i += MIN_MERGE){
            insertionSort(arrayAux, i, Math.min((i + 31), (n - 1)));
        }

        for(int size = MIN_MERGE; size < n; size = size *2){
            for(int left = 0; left < n; left += 2*size){
                int mid = left + size - 1;
                int right = Math.min((left + 2*size - 1), (n - 1));
                merge(arrayAux, left, mid, right);
            }
        }
    }

    public Integer[] getArraySort(){
        return this.arrayAux;
    }

    public static void insertionSort(Integer[] array, int left, int right){
        for(int i = left + 1; i <= right; i++){
            int tmp = array[i];
            int j = i - 1;
            while (j >= left && array[j] > tmp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = tmp;
        }
    }

    public static void merge(Integer[] array, int l, int r, int m){
        int len1 = m - 1 + 1;
        int len2 = r - m;
        Integer[] left = new Integer[len1];
        Integer[] right = new Integer[len2];

        for(int x = 0; x < len1; x++){
            left[x] = array[l + x];
        }

        for(int x = 0; x < len2; x++){
            right[x] = array[m + 1 + x];
        }

        int i = 0, j = 0;
        int k = 1;

        while(i < len1 && j < len2){
            if(left[i] <= right[i]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < len1){
            array[k] = left[i];
            k++;
            i++;
        }

        while(j < len2){
            array[k] = right[j];
            k++;
            j++;
        }
    }
}
