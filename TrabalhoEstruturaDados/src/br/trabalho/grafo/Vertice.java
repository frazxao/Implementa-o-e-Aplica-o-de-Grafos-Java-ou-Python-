package br.trabalho.grafo;

import java.util.ArrayList;
import java.util.List;

public class Vertice<T> {
    private T valor;
    private List<Aresta<T>> arestas;

    public Vertice(T valor) {
        this.valor = valor;
        this.arestas = new ArrayList<>();
    }

    public T getValor() {
        return valor;
    }

    public List<Aresta<T>> getArestas() {
        return arestas;
    }

    public void adicionarAresta(Vertice<T> destino, double peso) {
        this.arestas.add(new Aresta<>(destino, peso));
    }

    public void removerArestaPara(Vertice<T> destino) {
        arestas.removeIf(a -> a.getDestino().equals(destino));
    }

    @Override
    public String toString() {
        return valor.toString();
    }
}
