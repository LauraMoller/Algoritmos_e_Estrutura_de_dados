Project: Linked List

📌 Project Description:
- Implementation of a Linked List data structure in Java.
- Based on dynamic nodes (NoLista) that store a reference to the next element, allowing unidirectional navigation.
- Developed with support for Generics (T), allowing the storage of any type of object.

⚙️ Main Functionalities:
- Dynamic Insertion: Adds new elements always at the beginning of the list. It automatically updates the reference to the "next" node to maintain the structure's integrity.
- Node Chaining: Unlike arrays, it does not use continuous memory; each element is an independent object connected by pointers.
- Element Search: Traverses the list starting from the primeiro pointer until the desired value is found. Returns the complete node reference or null if not located.
- Logical Removal: Locates the node by its value and adjusts the pointers of the preceding node to exclude the target from the sequence.
- List Length: Features the obterComprimento method, which traverses the entire list to count and return the total number of items.
- Position Access: Allows retrieving a specific node based on its index through the obterNo method.

🧪 Test Plan (JUnit 5)
- Inclusion Test: Validates if the data 5, 10, 15, and 20 are inserted at the beginning and if the textual representation (toString) reflects the correct order ("20, 15, 10, 5.").
- Search Test: Ensures that the buscar method correctly locates an existing element at the beginning or middle of the list and returns null for non-existent values.
- Removal Test: Verifies the correct exclusion of the first element and elements located in the middle of the list, ensuring the chain remains intact.
- Length and Index Test: Confirms the accuracy of the list size count and the retrieval of nodes by their specific positions.
- Exception Test: Guarantees that attempting to access an invalid or out-of-bounds index triggers an IndexOutOfBoundsException.

--------------------------------------------------------

Projeto: Lista Encadeada

📌 Descrição do Projeto:
- Implementação de uma estrutura de dados do tipo Lista Encadeada em Java.
- Baseada em nós dinâmicos (NoLista) que armazenam uma referência para o próximo elemento, permitindo navegação unidirecional.
- Desenvolvida com suporte a Generics (T), permitindo armazenar qualquer tipo de objeto.

⚙️ Funcionalidades Principais:
- Inserção Dinâmica: Adiciona novos elementos sempre no início da lista. Atualiza automaticamente a referência do "próximo" nó para manter a integridade da estrutura.
- Encadeamento de Nós: Diferente de vetores, não utiliza memória contínua; cada elemento é um objeto independente conectado por ponteiros.
- Busca de Elementos: Percorre a lista a partir do ponteiro primeiro até encontrar o valor desejado. Retorna a referência do nó completo ou null caso não seja localizado.
- Remoção Lógica: Localiza o nó através do valor e ajusta os ponteiros do nó anterior para excluí-lo da sequência.
- Comprimento da Lista: Possui o método obterComprimento, que percorre toda a lista para contar e retornar a quantidade total de itens.
- Acesso por Posição: Permite recuperar um nó específico com base em seu índice através do método obterNo.

🧪 Plano de Testes (JUnit 5)
- Teste de Inclusão: Valida se os dados 5, 10, 15 e 20 são inseridos no início e se a representação textual (toString) reflete a ordem correta ("20, 15, 10, 5.").
- Teste de Busca: Certifica que o método buscar localiza corretamente um elemento existente no início ou meio da lista e retorna nulo para valores inexistentes.
- Teste de Remoção: Verifica a exclusão correta do primeiro elemento e de elementos no meio da lista, garantindo que o encadeamento permaneça intacto.
- Teste de Comprimento e Índice: Confirma a precisão da contagem do tamanho da lista e a recuperação de nós por suas posições específicas.
- Teste de Exceção: Garante que a tentativa de acessar um índice inválido ou fora dos limites dispara uma IndexOutOfBoundsException.
