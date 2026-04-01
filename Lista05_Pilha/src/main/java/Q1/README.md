Project: Static Stack (LIFO)

📌 Project Description:
- Implementation of a Stack data structure in Java based on a static array.
- The project follows the LIFO (Last-In, First-Out) principle, where the last element added is the first one to be removed.
- Developed with support for Generics (T) and guided by a formal interface (Pilha<T>), ensuring flexibility for storing any object type with a fixed capacity.

⚙️ Main Functionalities:
- Push (Insertion): Adds an element to the top of the stack. If the predefined limit is reached, it triggers a PilhaCheiaException.
- Pop (Removal): Removes and returns the element currently at the top of the stack. If the stack is empty, it triggers a PilhaVaziaException.
- Peek (Consultation): Returns the element at the top without removing it, allowing the user to check the next item to be processed.
- Status Check: Includes the estaVazia method to verify if the stack contains any elements.
- String Representation: Features a toString method that returns all elements from top to bottom, separated by commas (e.g., "30, 20, 10.").
- Memory Management: The liberar method nullifies all internal references in the array to assist the Java Garbage Collector and resets the stack's size.

🧪 Test Plan (JUnit 5)
- Push/Pop Test: Validates if elements 10, 20, and 30 are stacked and unstacked in the correct reverse order.
- Peek Test: Ensures that the top element can be viewed without being removed from the structure.
- Full Stack Test: Verifies if attempting to push into a stack at maximum capacity correctly triggers a PilhaCheiaException.
- Empty Stack Test: Guarantees that calling pop on an empty stack triggers a PilhaVaziaException.
- Cleanup Test: Confirms that the liberar method effectively empties the stack and nullifies internal data.

-------------------------------------------------------------------

Projeto: Pilha Estática (LIFO)

📌 Descrição do Projeto:
- Implementação de uma estrutura de dados do tipo Pilha em Java baseada em um vetor estático.
- O projeto segue o princípio LIFO (Last-In, First-Out), onde o último elemento a entrar é o primeiro a ser retirado.
- Desenvolvida com suporte a Generics (T) e guiada por uma interface formal (Pilha<T>), garantindo flexibilidade para armazenar qualquer tipo de objeto com uma capacidade fixa.

⚙️ Funcionalidades Principais:
- Empilhar (Push): Adiciona um elemento no topo da pilha. Caso o limite definido seja atingido, dispara uma PilhaCheiaException.
- Desempilhar (Pop): Remove e retorna o elemento que está no topo. Caso a pilha esteja vazia, dispara uma PilhaVaziaException.
- Topo (Peek): Retorna o elemento do topo sem removê-lo, permitindo consultar o próximo item a ser processado.
- Verificação de Estado: Inclui o método estaVazia para verificar se a estrutura contém elementos.
- Representação Textual: Possui o método toString que retorna todos os elementos do topo para a base, separados por vírgula (ex: "30, 20, 10.").
- Gestão de Memória: O método liberar percorre o vetor anulando as referências internas para auxiliar o Garbage Collector do Java e reinicia o tamanho da pilha.

🧪 Plano de Testes (JUnit 5)
- Teste de Empilhar/Desempilhar: Valida se os dados 10, 20 e 30 são inseridos e removidos na ordem inversa correta.
- Teste de Topo: Garante que o elemento no topo pode ser visualizado sem ser removido da estrutura.
- Teste de Pilha Cheia: Verifica se a tentativa de push em uma pilha com capacidade máxima dispara corretamente a PilhaCheiaException.
- Teste de Pilha Vazia: Garante que a chamada de pop em uma pilha sem elementos dispara a PilhaVaziaException.
- Teste de Limpeza: Confirma que o método liberar efetivamente esvazia a pilha e anula os dados internos.
