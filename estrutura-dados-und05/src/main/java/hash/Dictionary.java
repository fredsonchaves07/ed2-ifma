package hash;

import lista.ListaDuplamenteEncadeada;

public class Dictionary <Generic>{
    public ListaDuplamenteEncadeada array[];
    private int lengthArray;

    public Dictionary(int lengthArray){
        this.lengthArray = lengthArray;
        this.array = new ListaDuplamenteEncadeada[lengthArray];
        this.startList();
    }

    private void startList(){
        for(int i = 0; i < this.lengthArray; i++){
            this.array[i] = new ListaDuplamenteEncadeada();
        }
    }

    private int hashFunction(Generic data){
        return new Integer(data.toString()) % lengthArray;
    }

    public void addHash(Generic data){
        this.array[this.hashFunction(data)].add(data);
    }
}
