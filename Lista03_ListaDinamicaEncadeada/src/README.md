Projeto Lista Linear Encadeada Genérica

📌 Descrição do Projeto:
- Implementação de uma estrutura de dados do tipo Lista Encadeada capaz de armazenar objetos de qualquer tipo (Genéricos) em Java.
- Diferente das listas estáticas, esta implementação utiliza alocação dinâmica de memória, onde cada elemento (nó) aponta para o próximo, não exigindo espaços contíguos na memória.
- Desenvolvida com foco em modularidade, separando a lógica do nó (NoLista) da estrutura de gerenciamento (ListaEncadeada).

⚙️ Funcionalidades Principais:
- Inserção Dinâmica: Adiciona novos elementos no início da lista. O novo nó é criado apontando para o antigo "primeiro", e a referência da lista é atualizada.
- Busca de Elementos: Percorre a lista linearmente a partir do primeiro nó até encontrar o valor correspondente, retornando o objeto NoLista ou null caso não exista.
- Remoção Lógica: Localiza um valor específico e ajusta os ponteiros do nó anterior para "pular" o nó removido, garantindo a integridade da corrente.
- Acesso por Índice: O método obterNo(int idx) permite acessar um nó em uma posição específica, percorrendo a lista até o contador atingir o índice desejado.
- Gestão de Tamanho: Método obterComprimento() que calcula em tempo real a quantidade de elementos presentes na estrutura.
- Representação Textual: Sobrescrita do método toString() para exibir todos os elementos da lista formatados, facilitando a visualização dos dados.

🧪 Plano de Testes (JUnit 5):
- Teste de Lista Vazia: Valida se a lista é inicializada corretamente como vazia e se o método estaVazia() responde adequadamente.
- Teste de Inclusão Múltipla: Verifica se a inserção de múltiplos valores (5, 10, 15) mantém a ordem correta (LIFO - o último a entrar é o primeiro da lista).
- Teste de Busca: Garante que a busca localiza elementos no início, no meio e retorna nulo para valores inexistentes.
- Teste de Remoção: Valida a exclusão do primeiro item e de itens intermediários, conferindo se a string resultante reflete a nova estrutura.
- Teste de Exceção: Certifica que o sistema lança IndexOutOfBoundsException ao tentar acessar índices negativos ou maiores que o comprimento da lista.
