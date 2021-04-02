package questao01.grafos;

import java.util.ArrayList;

public class Grafo <Generic>{
    private ArrayList<Vertice<Generic>> vertices;
    private ArrayList<Aresta<Generic>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
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

    public void buscaLargura(){
        ArrayList<Vertice<Generic>> marcados = new ArrayList<>();
        ArrayList<Vertice<Generic>> fila = new ArrayList<>();
        Vertice<Generic> atual = this.vertices.get(0);

        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);

        while(fila.size() > 0){
            Vertice<Generic> visitado = fila.get(0);

            for(int i = 0; i < visitado.getArestasSaida().size(); i ++){
                Vertice<Generic> proximo = visitado.getArestasSaida().get(i).getFim();

                if(!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }

            fila.remove(0);
        }
    }
}
