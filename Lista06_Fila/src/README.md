Project: Static Queue (FIFO)

📌 Project Description
Implementation of a Queue data structure in Java based on a circular static array.
The project follows the FIFO (First-In, First-Out) principle, where the first element added is the first one to be removed.
Developed with support for Generics (T) and guided by a formal interface (Fila), ensuring flexibility for storing any object type with a fixed capacity and optimized memory reuse through circular indexing.

⚙️ Main Functionalities
- Insert (Enqueue): Adds an element to the end of the queue. If the predefined limit is reached, it triggers a FilaCheiaException.
- Retire (Dequeue): Removes and returns the element currently at the front of the queue. If the queue is empty, it triggers a FilaVaziaException.
- Peek (Consultation): Returns the element at the front without removing it, allowing the user to check the next item to be processed.
- Status Check: Includes the estaVazia method to verify if the structure contains any elements.
- Concatenation: Features the criarFilaConcatenada method, which merges two queues into a new third queue with a combined capacity.
- String Representation: Features a toString method that returns all elements from the front to the end, separated by commas (e.g., "10, 20, 30.").
- Memory Management: The liberar method nullifies internal references in the array to assist the Java Garbage Collector and resets the queue's state.

🧪 Test Plan (JUnit 5)
- Creation Test: Validates if the queue starts empty upon instantiation.
- Enqueue/Dequeue Test: Validates if elements 10, 20, and 30 are inserted and removed in the correct sequential order (FIFO).
- Peek Test: Ensures that the front element can be viewed without being removed from the structure.
- Full Queue Test: Verifies if attempting to insert into a queue at maximum capacity correctly triggers a FilaCheiaException.
- Empty Queue Test: Guarantees that calling "retirar" on an empty queue triggers a FilaVaziaException.
- Concatenation Test: Confirms that two independent queues can be merged into a new one while maintaining the integrity of the original structures.
- Cleanup Test: Confirms that the liberar method effectively empties the queue and nullifies internal data.

------------
Projeto: Fila Estática (FIFO)

📌 Descrição do Projeto
Implementação de uma estrutura de dados do tipo Fila em Java baseada em um vetor estático circular.
O projeto segue o princípio FIFO (First-In, First-Out), onde o primeiro elemento a entrar é o primeiro a ser retirado.
Desenvolvida com suporte a Generics (T) e guiada por uma interface formal (Fila), garantindo flexibilidade para armazenar qualquer tipo de objeto com uma capacidade fixa e reutilização otimizada de memória através de índices circulares.

⚙️ Funcionalidades Principais
- Inserir (Enqueue): Adiciona um elemento ao final da fila. Caso o limite definido seja atingido, dispara uma FilaCheiaException.
- Retirar (Dequeue): Remove e retorna o elemento que está no início. Caso a fila esteja vazia, dispara uma FilaVaziaException.
- Início (Peek): Retorna o elemento do início sem removê-lo, permitindo consultar o próximo item a ser processado.
- Verificação de Estado: Inclui o método estaVazia para verificar se a estrutura contém elementos.
- Concatenação: Possui o método criarFilaConcatenada, que une duas filas em uma terceira nova fila com a capacidade somada.
- Representação Textual: Possui o método toString que retorna todos os elementos do início para o fim, separados por vírgula (ex: "10, 20, 30.").
- Gestão de Memória: O método liberar percorre o vetor anulando as referências internas para auxiliar o Garbage Collector do Java e reinicia o estado da fila.

🧪 Plano de Testes (JUnit 5)
- Teste de Criação: Valida se a fila inicia vazia ao ser instanciada.
- Teste de Enfileirar/Desenfileirar: Valida se os dados 10, 20 e 30 são inseridos e removidos na ordem sequencial correta (FIFO).
- Teste de Início: Garante que o elemento no início pode ser visualizado sem ser removido da estrutura.
- Teste de Fila Cheia: Verifica se a tentativa de inserção em uma fila com capacidade máxima dispara corretamente a FilaCheiaException.
- Teste de Fila Vazia: Garante que a chamada de retirar em uma fila sem elementos dispara a FilaVaziaException.
- Teste de Concatenação: Confirma que duas filas independentes podem ser fundidas em uma nova, mantendo a integridade das estruturas originais.
- Teste de Limpeza: Confirma que o método liberar efetivamente esvazia a fila e anula os dados internos.
