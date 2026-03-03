Projeto: Lista Linear Estática de Inteiros

📌 Descrição do Projeto:
- Implementação de uma lista capaz de armazenar números inteiros em Java.
- Baseada em um vetor encapsulado que utiliza memória contínua para os dados.
- Desenvolvida seguindo o diagrama de classes e especificações da lista 01 da disciplina.

⚙️ Funcionalidades Principais:
- Inserção Dinâmica: Adiciona o valor fornecido no final do vetor. Caso não haja posições livres, invoca automaticamente o redimensionamento.
- Pseudo-redimensionamento: Quando a lista atinge sua capacidade máxima, um novo vetor é criado com 10 novas posições adicionais e os dados são copiados.
- Busca de Elementos: Localiza a posição (índice) de um número no vetor. Retorna -1 caso o valor não seja encontrado e -2 caso a lista esteja vazia.
- Remoção com Deslocamento: Retira um dado da lista e move todos os elementos sucessores uma posição para a esquerda para não deixar "buracos".
- Acesso Seguro: O método obterElemento retorna o valor em uma posição específica , lançando IndexOutOfBoundsException se a posição for inexistente ou não ocupada.
- Gestão de Memória: O método liberar limpa a estrutura e redefine a capacidade inicial para 10 elementos.

🧪 Plano de Testes (JUnit 5)
- Teste de Inclusão: Valida se os dados 5, 10, 15 e 20 são armazenados corretamente.
- Teste de Tamanho: Garante que o método getTamanho() reflete a quantidade real de itens.
- Teste de Redimensionamento: Verifica a inserção de 15 números para forçar a expansão do vetor original.
- Teste de Exceção: Certifica que o sistema impede o acesso a índices inválidos, como o índice 5 em uma lista com apenas 4 elementos.
