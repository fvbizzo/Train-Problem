			               	---------------Train Problem readme-----------------
Autor: Felipe Viana Bizzo

Coding assiment passado pela empresa Exablack para vaga de estagiário.

A solução proposta tem 4 classes:

A classe Graph -> representa o Grafo, é composta por um inteiro que representa o número
 de nós e uma vetor de nós.

A classe Node -> representa cada nó do grafo individualmente, é composta por um char
 representando o nome da cidade, e um vetor de conexções.

A classe Connection -> representa cada uma das conexções dos nós pertencentes ao grafo,
 é composta por um char que representa o destino do trem e um int que representa a distancia

A classe Show -> É composta pelas funções que mostram para o usuário o resultado das seguintes pesquisas:

-show_distance2-5 : mostra a distancia entre 2-5 elementos

-show_num_trips : mostra o numero de caminhos que existem dados um grafo,
 um ponto de partida, um ponto de chegada e um número exato de viagens.

-show_num_trips_upto : mostra o numero de caminhos que existem dados um grafo, um ponto de partida,
 um ponto de chegada e um número máximo de viagens.

-show_shortest_route : mostra a menor distancia entre dois pontos pertencentes ao grafo.
(Atenção ao comentário em relação a esta função)

Existe um arquivo teste.java que testa o "Test Input" que realiza os 10 testes requeridos no enunciado do trabalho.
Todos os testes foram realizados no ambiente windows utilizando o Eclipse.

É possível criar testes próprios caso desejado, para isso, sigua as instruções abaixo para cada uma das funções.

-new Graph(int n) -> inicializa um novo grafo com n nós.

-insert_node(Graph g, char city) -> insere um novo nó no grafo.

-insert_connection(Graph g, char start, char end, int distance) -> estabelece uma nova conexão entre dois nós,
 partindo do nó "start" até o nó"end", com valor igual a "distance.

-show_distance2(Graph g, char start, char end) -> mostra a distancia entre dos nós se houver conexão direta,
 a função com 5 nós fica show_distance5(Graph g, char start, char mid1, char mid2, char mid3, char end).

-show_num_trips_upto(Graph g, char start, char end, int num, 0) -> mostra o número de caminhos onde num é o número máximo de viagens,
 e é preciso passar um controlador de mínimo de viagens(representado com o 0).

-show_num_trips(Graph g, char start, char end, int num) -> mostra o número de caminhos do nó start até o nó end com exatamente o número num de viagens.

-show_shortest_route(Graph g, char start, char end) -> mostra o menor caminho entre o nó start e o nó end.(Essa função não está funcionando corretamente).





