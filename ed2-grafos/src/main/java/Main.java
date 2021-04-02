import questao01.grafos.Grafo;

public class Main {
    public static void main(String[] args){
        Grafo<String> grafo = new Grafo<>();

        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Fredson");
        grafo.adicionarVertice("Ana");
        grafo.adicionarVertice("Darlynne");
        grafo.adicionarVertice("Rita");

        grafo.adicionarAresta(2.0, "João", "Fredson");
        grafo.adicionarAresta(2.0, "João", "Darlynne");
        grafo.adicionarAresta(3.0, "Fredson", "Ana");
        grafo.adicionarAresta(3.0, "Ana", "Darlynne");
        grafo.adicionarAresta(1.0, "Rita", "João");
        grafo.adicionarAresta(1.0, "Rita", "Fredson");

        grafo.buscaLargura();
    }
}
