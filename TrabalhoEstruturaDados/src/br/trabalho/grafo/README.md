Grafo Genérico em Java — Estrutura de Dados

Aluno: Guilherme Frazão
Disciplina: Estrutura de Dados
Professor: Anderson Soares

📌 Descrição do Projeto

Este projeto implementa um Grafo Genérico utilizando Lista de Adjacência, permitindo trabalhar com vértices de qualquer tipo (String, Integer, etc.).
Inclui operações básicas de grafos e um conjunto de testes demonstrando seu funcionamento.

✔️ Funcionalidades Implementadas
1. Estrutura do Grafo
* Representação com Map<T, List<Aresta<T>>>
* Suporte para qualquer tipo genérico

2. Operações implementadas
* Adicionar vértice
* Adicionar aresta (direcionada)
* Remover vértice
* Remover aresta
* Exibir o grafo (formato textual)

3. Testes
Arquivo TestGrafoOperations.java mostra:
* Construção de grafo simples
* Adição e remoção de arestas
* Remoção de vértice
* Impressão da estrutura final

Saída esperada:

Estado após adicionar arestas:
=== Estrutura do Grafo ===
X -> [(Y, peso=1.0)]
Y -> [(Z, peso=2.0)]
Z -> []
OK: remoção de aresta
OK: remoção de vértice
Testes do grafo concluídos.

📁 Estrutura do Projeto
src/
 └── br/trabalho/grafo/
       ├── Grafo.java
       ├── Aresta.java
       ├── Vertice.java
       └── TestGrafoOperations.java

▶️ Como Executar

No Eclipse ou VSCode:
1. Abra o projeto
2. Execute o arquivo:
br.trabalho.grafo.TestGrafoOperations

3. O console mostrará os testes do grafo.

📝 Requisitos Atendidos
✔ Estrutura e operações básicas (7 pontos)
✔ Código modular e organizado
✔ Testes demonstrativos


📄 Licença
Projeto acadêmico — uso educacional.