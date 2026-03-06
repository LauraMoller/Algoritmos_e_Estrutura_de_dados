Projeto Lista Linear Estática Genérica

📌 Descrição do Projeto

- Implementação de uma lista estática de tipo genérico (<T>) em Java, permitindo o armazenamento de qualquer tipo de objeto.
- Baseada em um vetor encapsulado que utiliza memória contínua para a organização dos dados.
- Resolução da lista de exercícios 02 da matéria.

⚙️ Funcionalidades Principais:

- Inserção Dinâmica: Adiciona um valor ao final da lista. Caso o vetor interno atinja sua capacidade máxima, o método redimensionar() é invocado automaticamente.
- Pseudo-redimensionamento: Garante a continuidade das operações ao criar um novo vetor com 10 posições adicionais sempre que o limite atual é alcançado, preservando os dados existentes.
- Busca de Elementos: Localiza o índice de um objeto na lista. Retorna a posição do item, -1 caso não seja encontrado, ou -2 se a lista estiver completamente vazia.
- Remoção com Deslocamento: O método retirar(T valor) remove um item específico e desloca todos os elementos subsequentes para a esquerda, garantindo que não existam lacunas no array.
- Acesso Seguro: O método obterElemento(int idx) retorna o valor em uma posição específica, lançando IndexOutOfBoundsException caso o índice seja inválido ou não esteja ocupado.
- Inversão de Elementos: Possui uma lógica otimizada para inverter a ordem de todos os itens inseridos na lista (primeiro vira último, etc.).
- Gestão de Memória: O método liberar() reinicializa a lista, descartando os dados atuais e definindo a capacidade inicial padrão de 10 posições.

🧪 Plano de Testes (JUnit 5):

- Teste de Inclusão: Valida se os dados 5, 10, 15 e 20 são armazenados corretamente.
- Teste de Tamanho: Garante que o método getTamanho() reflete a quantidade real de itens.
- Teste de Redimensionamento: Verifica a inserção de 15 números para forçar a expansão do vetor original.
- Teste de Exceção: Certifica que o sistema impede o acesso a índices inválidos, como o índice 5 em uma lista com apenas 4 elementos.
- Teste de Inversão: Certifica que a lógica de inversão funciona tanto para listas com quantidade par quanto ímpar de elementos.
