package br.trabalho.dijkstra;

import java.util.*;

import br.trabalho.grafo.Grafo;
import br.trabalho.grafo.Vertice;
import br.trabalho.grafo.Aresta;

public class Dijkstra<T> {

    public Map<T, Double> menorCaminho(Grafo<T> grafo, T origem) {

        Map<T, Double> distancia = new HashMap<>();
        PriorityQueue<T> fila = new PriorityQueue<>(Comparator.comparingDouble(distancia::get));

        for (T v : grafo.getVertices().keySet()) {
            distancia.put(v, Double.MAX_VALUE);
        }

        distancia.put(origem, 0.0);
        fila.add(origem);

        while (!fila.isEmpty()) {
            T atual = fila.poll();
            Vertice<T> vAtual = grafo.getVertices().get(atual);

            for (Aresta<T> a : vAtual.getArestas()) {
                T vizinho = a.getDestino().getValor();
                double novaDist = distancia.get(atual) + a.getPeso();

                if (novaDist < distancia.get(vizinho)) {
                    distancia.put(vizinho, novaDist);
                    fila.add(vizinho);
                }
            }
        }

        return distancia;
    }
}
