package br.trabalho.grafo;

public class TestGrafoOperations {

    public static void main(String[] args) {

        Grafo<String> grafo = new Grafo<>();

        grafo.adicionarAresta("X", "Y", 1.0);
        grafo.adicionarAresta("Y", "Z", 2.0);

        System.out.println("Estado após adicionar arestas:");
        grafo.imprimirGrafo();

        grafo.removerAresta("X", "Y");
        System.out.println("OK: remoção de aresta");

        grafo.removerVertice("Z");
        System.out.println("OK: remoção de vértice");

        System.out.println("Testes do grafo concluídos.");
    }
}
