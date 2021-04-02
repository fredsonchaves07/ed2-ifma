package questao01.grafos;

public class Main {
    public static void main(String[] args){
        Grafo<String> grafo = new Grafo<>();

        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Fredson");
        grafo.adicionarVertice("Ana");
        grafo.adicionarVertice("Darlynne");

        grafo.adicionarAresta(2.0, "João", "Fredson");
        grafo.adicionarAresta(3.0, "Fredson", "Ana");
        grafo.adicionarAresta(3.0, "Fredson", "Darlynne");
        grafo.adicionarAresta(3.0, "Ana", "Darlynne");
    }
}
