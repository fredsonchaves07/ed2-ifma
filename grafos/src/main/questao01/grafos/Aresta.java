package questao01.grafos;

public class Aresta<Generic> {
    private Double peso;
    private Vertice<Generic> inicio;
    private Vertice<Generic> fim;

    public Aresta(Double peso, Vertice<Generic> inicio, Vertice<Generic> fim) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Double getPeso() {
        return peso;
    }

    public Vertice<Generic> getInicio() {
        return inicio;
    }

    public Vertice<Generic> getFim() {
        return fim;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setInicio(Vertice<Generic> inicio) {
        this.inicio = inicio;
    }

    public void setFim(Vertice<Generic> fim) {
        this.fim = fim;
    }
}
