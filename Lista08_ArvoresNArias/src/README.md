Tree Structure Project

📌 Project Description
- Implementation of a Tree data structure in Java.
- The project focuses on a dynamic structure where each node contains a value and references to its first child and its next sibling. Developed with support for Generics (T), it allows for flexible data storage while implementing fundamental tree traversal and manipulation algorithms.

⚙️ Main Functionalities
- Dynamic Insertion: Allows building the tree manually by setting nodes and subtrees through the setRaiz and inserirFilho methods.
- Search (pertence): Recursively verifies if a specific piece of information exists anywhere within the tree.
- Node Counting (contarNos): A recursive function that calculates the total number of nodes currently present in the structure.
- Status Check: Includes logic to verify if the tree has a root node (null check in toString and other methods).
- Textual Representation: Features a toString method that produces a linearized string of the tree hierarchy, formatted with brackets (e.g., <1<2<5><6><7>><3<8>><4<9><10>>>).

🧪 Test Plan (JUnit 5)
- Textual Representation Test: Confirms that the toString method correctly reflects the tree's hierarchical structure.
- Search Test (pertence): Ensures that the search algorithm correctly finds elements at different levels, as well as identifying absent values.
- Node Count Test: Verifies if the contarNos method accurately returns the total number of elements in a complex tree structure.

------------
Projeto Árvore

📌 Descrição do Projeto
- Implementação de uma estrutura de dados do tipo Árvore em Java.
- O projeto foca em uma estrutura dinâmica onde cada nó contém um valor e referências para o seu primeiro filho e para o seu próximo irmão. Desenvolvida com suporte a Generics (T), a implementação permite flexibilidade no armazenamento de dados enquanto executa algoritmos fundamentais de percurso e manipulação de árvores.

⚙️ Funcionalidades Principais
- Inserção Dinâmica: Permite a construção manual da árvore definindo nós e subárvores através dos métodos setRaiz e inserirFilho.
- Busca (pertence): Verifica de forma recursiva se uma informação específica existe em qualquer nó da árvore.
- Contagem de Nós (contarNos): Função recursiva que calcula a quantidade total de nós presentes na estrutura.
- Verificação de Estado: Inclui lógica para verificar se a árvore possui ou não um nó raiz (verificação de nulo em toString e outros métodos).
- Representação Textual: Possui o método toString que produz uma representação linearizada da hierarquia da árvore, formatada com parênteses angulares (ex: <1<2<5><6><7>><3<8>><4<9><10>>>).

🧪 Plano de Testes (JUnit 5)
- Teste de Representação Textual: Confirma se o método toString reflete fielmente a estrutura hierárquica esperada.
- Teste de Busca (pertence): Garante que o algoritmo de busca encontra corretamente elementos em diferentes níveis, além de identificar valores ausentes.
- Teste de Contagem de Nós: Verifica se o método contarNos retorna com precisão o total de elementos em uma estrutura complexa.
