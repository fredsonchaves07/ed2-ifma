package implement.Hash;

import implement.Lista.ListaDuplamenteEncadeada;


public class Dicionario <Generic>{
    ListaDuplamenteEncadeada vetor[];

    public Dicionario(){
        vetor = new ListaDuplamenteEncadeada[3];
        this.inicializaListas();
    }

    final void inicializaListas(){
        for(int i = 0; i < 3; i ++){
            vetor[i] = new ListaDuplamenteEncadeada();
        }
    }

    final int funcaoHash(Generic dados){
        return new Integer(dados.toString()) % 3;
    }

    final void addTabela(Generic dados){
        vetor[funcaoHash(dados)].add(dados);
    }

    public static void main(String[] args){
        Dicionario conjunto1 = new Dicionario();
        Dicionario conjunto2 = new Dicionario();

        conjunto1.addTabela(1);
        conjunto1.addTabela(10);
        conjunto1.addTabela(3);

        conjunto2.addTabela(1);
        conjunto2.addTabela(10);
        conjunto2.addTabela(1);

        System.out.println("Imprimindo Conjunto 1");
        for(int i = 0; i < conjunto1.vetor.length - 1; i++){
            conjunto1.vetor[i].list();
        }

        System.out.println("Imprimindo Conjunto 2");
        for(int i = 0; i < conjunto2.vetor.length - 1; i++){
            conjunto2.vetor[i].list();
        }

        System.out.println("Subconjunto");
        for(int i = 0; i < conjunto1.vetor.length; i ++){
            if(! conjunto2.vetor[i].equals(conjunto1.vetor[i])){
                System.out.println("Conjunto 2 não é subconjunto de 1");
                break;
            }

        }
    }
}
