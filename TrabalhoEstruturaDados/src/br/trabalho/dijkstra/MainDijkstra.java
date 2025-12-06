package br.trabalho.dijkstra;

import java.util.Map;

import br.trabalho.grafo.Grafo;

/**
 * Classe Main para demonstrar o Dijkstra.
 * Coloque este arquivo em src/br/trabalho/dijkstra/MainDijkstra.java
 */
public class MainDijkstra {
    public static void main(String[] args) {
        Grafo<String> g = new Grafo<>();

        // exemplo de grafo (rotas / distâncias)
        g.adicionarAresta("A", "B", 2);
        g.adicionarAresta("A", "C", 5);
        g.adicionarAresta("B", "D", 1);
        g.adicionarAresta("C", "D", 2);
        g.adicionarAresta("D", "E", 3);

        // executa Dijkstra
        Dijkstra<String> dijkstra = new Dijkstra<>();
        Map<String, Double> dist = dijkstra.menorCaminho(g, "A");

        System.out.println("Menores distâncias a partir de A:");
        dist.forEach((k, v) -> System.out.println(k + " = " + v));

        // se quiser exibir um caminho (ex.: A -> E), precisamos reconstruir pred.
        // (Se você implementou versão com predecessors, use-a; aqui só mostramos distâncias.)
    }
}
