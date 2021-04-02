package questao01.grafos;

import java.util.ArrayList;

public class Vertice<Generic> {
    private Generic dado;
    private ArrayList<Aresta<Generic>> arestasEntrada;
    private ArrayList<Aresta<Generic>> arestasSaida;

    public Vertice(Generic dado){
        this.dado = dado;
        this.arestasEntrada = new ArrayList<>();
        this.arestasSaida = new ArrayList<>();
    }

    public Generic getDado() {
        return dado;
    }

    public void setDado(Generic dado) {
        this.dado = dado;
    }

    public void adicionarArestaEntrada(Aresta<Generic> aresta){
         this.arestasEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta<Generic> aresta){
        this.arestasSaida.add(aresta);
    }
}
