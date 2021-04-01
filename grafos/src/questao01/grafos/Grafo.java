package questao01.grafos;

import java.util.ArrayList;

public class Grafo <Generic>{
    private ArrayList<Vertice<Generic>> vertices;
    private ArrayList<Aresta<Generic>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<>();
        this.vertices = new ArrayList<>();
    }

    public void adicionarVertice(Generic dado){
        Vertice<Generic> novoVertice = new Vertice<>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, Generic dadoInicio, Generic dadoFim){
        Vertice<Generic> inicio = this.getVertice(dadoInicio);
        Vertice<Generic> fim = this.getVertice(dadoFim);
        Aresta<Generic> aresta = new Aresta<>(peso, inicio, fim);

        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);

        this.arestas.add(aresta);
    }

    public Vertice<Generic> getVertice(Generic dado){
        Vertice<Generic> vertice = null;
        for(int i = 0; i < this.vertices.size(); i ++){
            if(this.vertices.get(i).getDado().equals(dado)){
                return this.vertices.get(i);
            }
        }

        return vertice;
    }
}
