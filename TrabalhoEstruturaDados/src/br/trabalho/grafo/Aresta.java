package br.trabalho.grafo;

public class Aresta<T> {
    private Vertice<T> destino;
    private double peso;

    public Aresta(Vertice<T> destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice<T> getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "(" + destino.getValor() + ", peso=" + peso + ")";
    }
}
