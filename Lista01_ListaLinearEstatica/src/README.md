Project: Static Linear List

📌 Project Description:
- Implementation of a Static Linear List data structure in Java.
- Based on a fixed-size array (vector) that stores integer elements contiguously in memory.
- Developed with a dynamic resizing mechanism (pseudo-redimensionamento) to overcome the initial capacity limitations of standard static arrays.

⚙️ Main Functionalities:
- Contiguous Storage: Uses an integer array (int[]) to store data, ensuring that elements are indexed and stored in sequence.
- Pseudo-Dynamic Resizing: When the array reaches its maximum capacity, the redimensionar method creates a new, larger array (current size + 10) and copies existing elements over.
- Sequential Insertion: Adds new elements to the end of the list, automatically managing the tamanho variable and triggering resizing if necessary.
- Element Search: Iterates through the occupied positions of the array to find a specific value, returning its index or specific error codes (-1 for not found, -2 for empty list).
- Element Removal: Locates a value and performs a left shift of all subsequent elements to maintain list continuity without "holes" in the array.
- Index Access: Provides direct access to elements via the obterElemento method, including bounds checking to prevent invalid memory access.
- Memory Management: The liberar method resets the list to its initial state with a default capacity of 10 slots.

🧪 Test Plan (JUnit 5):
- Inclusion Test: Validates if data 5, 10, 15, and 20 are inserted correctly and if toString reflects the order "5, 10, 15, 20.".
- Size Test: Confirms that the getTamanho method returns the correct number of elements after multiple insertions.
- Search Test: Ensures the search method finds existing elements (returning the correct index) and returns -1 for non-existent ones.
- Removal Test: Verifies that removing an element shifts the remaining items correctly and updates the total size.
- Resizing Test: Tests the list's ability to handle more than 10 elements, triggering the internal resizing logic.
- Exception Test: Guarantees that IndexOutOfBoundsException is thrown when attempting to access an invalid index or an empty list.

--------------------------------------------------------------------

Projeto: Lista Linear Estática

📌 Descrição do Projeto:
- Implementação de uma estrutura de dados do tipo Lista Linear Estática em Java.
- Baseada em um vetor (array) de tamanho fixo que armazena elementos inteiros de forma contígua na memória.
- Desenvolvida com um mecanismo de redimensionamento automático (pseudo-redimensionamento) para superar as limitações de capacidade inicial de vetores estáticos convencionais.

⚙️ Funcionalidades Principais:
- Armazenamento Contíguo: Utiliza um vetor de inteiros (int[]) para armazenar os dados, garantindo que os elementos sejam indexados e mantidos em sequência.
- Pseudo-Redimensionamento: Quando o vetor atinge sua capacidade máxima, o método redimensionar cria um novo vetor maior (tamanho atual + 10) e copia os elementos existentes.
- Inserção Sequencial: Adiciona novos elementos ao final da lista, gerenciando automaticamente a variável tamanho e disparando o redimensionamento se necessário.
- Busca de Elementos: Percorre as posições ocupadas do vetor para encontrar um valor específico, retornando seu índice ou códigos de erro específicos (-1 para não encontrado, -2 para lista vazia).
- Remoção de Elementos: Localiza um valor e realiza o deslocamento para a esquerda (shift) de todos os elementos subsequentes para manter a continuidade da lista sem "buracos".
- Acesso por Índice: Permite o acesso direto aos elementos através do método obterElemento, incluindo verificações de limites para evitar acessos inválidos à memória.
- Gestão de Memória: O método liberar reinicializa a lista para seu estado inicial com uma capacidade padrão de 10 posições.

🧪 Plano de Testes (JUnit 5):
- Teste de Inclusão: Valida se os dados 5, 10, 15 e 20 são inseridos corretamente e se o toString reflete a ordem "5, 10, 15, 20.".
- Teste de Tamanho: Confirma se o método getTamanho retorna a quantidade exata de elementos após múltiplas inserções.
- Teste de Busca: Garante que o método de busca localiza elementos existentes (retornando o índice correto) e retorna -1 para valores inexistentes.
- Teste de Remoção: Verifica se a remoção de um elemento desloca os itens restantes corretamente e atualiza o tamanho total.
- Teste de Redimensionamento: Testa a capacidade da lista de lidar com mais de 10 elementos, disparando a lógica de expansão interna.
- Teste de Exceção: Garante que a exceção IndexOutOfBoundsException é lançada ao tentar acessar um índice inválido ou uma lista vazia.
