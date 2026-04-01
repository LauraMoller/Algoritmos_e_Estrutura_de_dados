Project: Stack with Linked List

📌 Project Description:
- Implementation of a Stack data structure in Java using a dynamic Linked List as the base.
- This implementation follows the LIFO (Last-In, First-Out) principle, where the first element added is the last to be removed.
- Developed with support for Generics (T) and an interface-based design (Pilha<T>), allowing the storage of any object type without fixed capacity constraints.

⚙️ Main Functionalities:
- Push (Insertion): Adds a new element to the top of the stack. Since it uses a linked list, it allocates a new dynamic node without capacity limits.
- Pop (Removal): Removes and returns the element currently at the top of the stack. It updates the top reference to the next node in the sequence.
- Peek (Consultation): Returns the information of the element at the top of the stack without removing it.
- Dynamic Chaining: Uses a ListaEncadeada internally, where each element is a NoLista containing the data and a pointer to the next element.
- Status Check: Includes the estaVazia method, which checks if the stack top is null, indicating there are no stored elements.
- Memory Management: The liberar method resets the stack by nullifying its internal list, facilitating the work of the Java Garbage Collector.

🧪 Test Plan (JUnit 5)
- Inclusion Test: Validates if the data 10, 20, and 30 are pushed onto the stack correctly and if the state reflects a non-empty stack.
- Push/Pop Test: Ensures that elements are unstacked in the correct reverse order (LIFO), confirming that after popping 30, 20, and 10, the stack becomes empty.
- Peek Test: Verifies if the peek method correctly returns the top value (30) without modifying the stack structure.
- Exception Test: Guarantees that attempting to pop from an empty stack triggers a PilhaVaziaException.

---------------------------------------------------------

Projeto: Pilha com Lista Encadeada

📌 Descrição do Projeto:
- Implementação de uma estrutura de dados do tipo Pilha em Java utilizando uma Lista Encadeada dinâmica como base.
- Esta implementação segue o princípio LIFO (Last-In, First-Out), onde o primeiro elemento adicionado é o último a ser removido.
- Desenvolvida com suporte a Generics (T) e baseada em uma interface (Pilha<T>), permitindo o armazenamento de qualquer tipo de objeto sem as restrições de capacidade de um vetor fixo.

⚙️ Funcionalidades Principais:
- Empilhar (Push): Adiciona um novo elemento no topo da pilha. Por utilizar uma lista encadeada, aloca um novo nó dinâmico sem limites de capacidade.
- Desempilhar (Pop): Remove e retorna o elemento que está no topo da pilha. Atualiza a referência do topo para o próximo nó da sequência.
- Topo (Peek): Retorna a informação do elemento no topo da pilha sem removê-lo da estrutura.
- Encadeamento Dinâmico: Utiliza internamente uma ListaEncadeada, onde cada elemento é um NoLista contendo o dado e um ponteiro para o próximo elemento.
- Verificação de Estado: Inclui o método estaVazia, que verifica se o topo da pilha é nulo, indicando a ausência de elementos.
- Gestão de Memória: O método liberar reinicializa a pilha anulando sua lista interna, facilitando o trabalho do Garbage Collector do Java.

🧪 Plano de Testes (JUnit 5)
- Teste de Inclusão: Valida se os dados 10, 20 e 30 são empilhados corretamente e se o estado reflete uma pilha não vazia.
- Teste de Empilhar/Desempilhar: Garante que os elementos são desempilhados na ordem inversa correta (LIFO), confirmando que após remover 30, 20 e 10, a pilha se torna vazia.
- Teste de Topo: Verifica se o método peek retorna corretamente o valor do topo (30) sem alterar a estrutura da pilha.
- Teste de Exceção: Garante que a tentativa de desempilhar (pop) de uma pilha vazia dispara uma PilhaVaziaException.
