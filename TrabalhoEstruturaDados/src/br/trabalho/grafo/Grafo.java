package br.trabalho.grafo;

import java.util.HashMap;
import java.util.Map;

public class Grafo<T> {

    private Map<T, Vertice<T>> vertices;

    public Grafo() {
        this.vertices = new HashMap<>();
    }

    public void adicionarVertice(T valor) {
        vertices.putIfAbsent(valor, new Vertice<>(valor));
    }

    public void removerVertice(T valor) {
        Vertice<T> v = vertices.remove(valor);
        if (v != null) {
            // Remover arestas apontando para ele
            for (Vertice<T> vert : vertices.values()) {
                vert.removerArestaPara(v);
            }
        }
    }

    public void adicionarAresta(T origem, T destino, double peso) {
        adicionarVertice(origem);
        adicionarVertice(destino);

        Vertice<T> v1 = vertices.get(origem);
        Vertice<T> v2 = vertices.get(destino);

        v1.adicionarAresta(v2, peso);
    }

    public void removerAresta(T origem, T destino) {
        Vertice<T> v1 = vertices.get(origem);
        Vertice<T> v2 = vertices.get(destino);

        if (v1 != null && v2 != null) {
            v1.removerArestaPara(v2);
        }
    }

    public Map<T, Vertice<T>> getVertices() {
        return vertices;
    }

    public void imprimirGrafo() {
        System.out.println("=== Estrutura do Grafo ===");
        for (T chave : vertices.keySet()) {
            System.out.print(chave + " -> " + vertices.get(chave).getArestas());
            System.out.println();
        }
    }
}
