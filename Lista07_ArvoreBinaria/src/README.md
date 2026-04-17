Project: Binary Tree

📌 Project Description
- Implementation of a Binary Tree data structure in Java.
- The project focuses on a dynamic structure where each node contains a value and references to up to two children (left and right). Developed with support for Generics (T), it allows for flexible data storage while implementing fundamental tree traversal and manipulation algorithms.

⚙️ Main Functionalities
- Dynamic Insertion: Allows building the tree manually by setting nodes and subtrees through the setRaiz, setEsquerda, and setDireita methods.
- Search (pertence): Recursively verifies if a specific piece of information exists anywhere within the tree.
- Node Counting (contarNos): A recursive function that calculates the total number of nodes currently present in the structure.
- Status Check: Includes the estaVazia method to verify if the tree has a root node.
- Textual Representation (Pre-Order): Features a toString method that produces a linearized string of the tree using the Pre-Order traversal (Root, Left, Right), formatted with brackets (e.g., <1<2<><>><3<><>>>).

🧪 Test Plan (JUnit 5)
- Empty/Non-Empty Tree Test: Validates if the tree correctly identifies when it has no root versus when it is populated.
- Search Test (pertence): Ensures that the search algorithm correctly finds elements at the root, internal nodes, and leaf nodes, as well as identifying absent values.
- Textual Representation Test: Confirms that the toString method correctly reflects the tree's hierarchical structure in the expected Pre-Order format.
- Node Count Test: Verifies if the contarNos method accurately returns the total number of elements in a complex tree structure.

---------------------------------------

Projeto: Árvore Binária

📌 Descrição do Projeto
- Implementação de uma estrutura de dados do tipo Árvore Binária em Java.
- O projeto foca em uma estrutura dinâmica onde cada nó contém um valor e referências para até dois filhos (esquerda e direita). Desenvolvida com suporte a Generics (T), a implementação permite flexibilidade no armazenamento de dados enquanto executa algoritmos fundamentais de percurso e manipulação de árvores.

⚙️ Funcionalidades Principais
- Inserção Dinâmica: Permite a construção manual da árvore definindo nós e subárvores através dos métodos setRaiz, setEsquerda e setDireita.
- Busca (pertence): Verifica de forma recursiva se uma informação específica existe em qualquer nó da árvore.
- Contagem de Nós (contarNos): Função recursiva que calcula a quantidade total de nós presentes na estrutura.
- Verificação de Estado: Inclui o método estaVazia para verificar se a árvore possui ou não um nó raiz.
- Representação Textual (Pré-Ordem): Possui o método toString que produz uma representação linearizada da árvore utilizando o percurso em Pré-Ordem (Raiz, Esquerda, Direita), formatada com parênteses angulares (ex: <1<2<><>><3<><>>>).

🧪 Plano de Testes (JUnit 5)
- Teste de Árvore Vazia/Não Vazia: Valida se a árvore identifica corretamente a ausência de raiz e o estado populado.
- Teste de Busca (pertence): Garante que o algoritmo de busca encontra corretamente elementos na raiz, nós internos e folhas, além de identificar valores ausentes.
- Teste de Representação Textual: Confirma se o método toString reflete fielmente a estrutura hierárquica no formato de Pré-Ordem esperado.
- Teste de Contagem de Nós: Verifica se o método contarNos retorna com precisão o total de elementos em uma estrutura complexa.
