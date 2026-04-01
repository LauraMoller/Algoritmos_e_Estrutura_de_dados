Project: Static Linear List

📌 Project Description:
- Implementation of a Static Linear List data structure in Java.
- Based on a fixed-size array (Object[]) that stores elements contiguously in memory.
- Developed with support for Generics (T), allowing the storage of any type of object while maintaining type safety.
- It features a dynamic resizing mechanism to overcome the initial capacity limitations of standard arrays.

⚙️ Main Functionalities:
- Contiguous Storage: Uses an internal array to store data, ensuring that elements are indexed and kept in a specific sequence.
- Pseudo-Dynamic Resizing: When the array reaches its maximum capacity, the redimensionar method automatically creates a new array with 10 additional positions and copies the existing data.
- Sequential Insertion: Adds new elements to the next available position at the end of the list, managing the total count via the tamanho variable.
- Element Search: Iterates through the occupied positions to find a specific value, returning its index, or specific codes for "not found" (-1) or "empty list" (-2).
- Element Removal: Locates a value and performs a left shift of all subsequent elements to maintain list continuity without gaps.
- Data Reversal: Includes an inverter method that swaps elements from the extremities toward the center to reverse the stored sequence.
- Memory Management: The liberar method resets the list to its initial state with a default capacity of 10 empty slots.

🧪 Test Plan (JUnit 5)
- Inclusion Test: Validates if the data 5, 10, 15, and 20 are inserted correctly and if the toString representation reflects the order "5, 10, 15, 20.".
- Size Test: Confirms that the getTamanho method returns the correct number of stored elements after insertions.
- Search Test: Ensures the search method correctly identifies the index of an existing element and returns -1 for values not present.
- Removal Test: Verifies that removing an element triggers the internal shift and updates the list size correctly.
- Reversal Test: Validates the inverter logic for both even and odd amounts of elements, checking if the sequence is correctly mirrored.
- Exception Test: Guarantees that IndexOutOfBoundsException or IllegalArgumentException is thrown when attempting to access invalid positions or remove non-existent values.

--------------------------------------------------

Projeto: Lista Linear Estática

📌 Descrição do Projeto:
- Implementação de uma estrutura de dados do tipo Lista Linear Estática em Java.
- Baseada em um vetor (Object[]) de tamanho fixo que armazena elementos de forma contígua na memória.
- Desenvolvida com suporte a Generics (T), permitindo armazenar qualquer tipo de objeto com segurança de tipos.
- Apresenta um mecanismo de redimensionamento dinâmico para superar as limitações de capacidade inicial de vetores convencionais.

⚙️ Funcionalidades Principais:
- Armazenamento Contíguo: Utiliza um array interno para armazenar os dados, garantindo que os elementos sejam indexados e mantidos em uma sequência específica.
- Pseudo-Redimensionamento: Quando o vetor atinge sua capacidade máxima, o método redimensionar cria automaticamente um novo array com 10 posições adicionais e copia os dados existentes.
- Inserção Sequencial: Adiciona novos elementos na próxima posição disponível ao final da lista, gerenciando a contagem total através da variável tamanho.
- Busca de Elementos: Percorre as posições ocupadas para encontrar um valor específico, retornando seu índice, ou códigos específicos para "não encontrado" (-1) ou "lista vazia" (-2).
- Remoção de Elementos: Localiza um valor e realiza o deslocamento para a esquerda (shift) de todos os elementos subsequentes para manter a continuidade da lista sem lacunas.
- Inversão de Dados: Inclui o método inverter, que troca os elementos das extremidades em direção ao centro para inverter a sequência armazenada.
- Gestão de Memória: O método liberar reinicializa a lista para seu estado inicial com uma capacidade padrão de 10 posições vazias.

🧪 Plano de Testes (JUnit 5)
- Teste de Inclusão: Valida se os dados 5, 10, 15 e 20 são inseridos corretamente e se a representação toString reflete a ordem "5, 10, 15, 20.".
- Teste de Tamanho: Confirma se o método getTamanho retorna a quantidade exata de elementos armazenados após as inserções.
- Teste de Busca: Garante que o método de busca identifica corretamente o índice de um elemento existente e retorna -1 para valores não presentes.
- Teste de Remoção: Verifica se a retirada de um elemento dispara o deslocamento interno e atualiza o tamanho da lista corretamente.
- Teste de Inversão: Valida a lógica de inversão para quantidades pares e ímpares de elementos, checando se a sequência é espelhada corretamente.
- Teste de Exceção: Garante que as exceções IndexOutOfBoundsException ou IllegalArgumentException são lançadas ao tentar acessar posições inválidas ou retirar valores inexistentes.
