			               	---------------Train Problem readme-----------------
Autor: Felipe Viana Bizzo

Coding assiment passado pela empresa Exablack para vaga de estagi�rio.

A solu��o proposta tem 4 classes:

A classe Graph -> representa o Grafo, � composta por um inteiro que representa o n�mero
 de n�s e uma vetor de n�s.

A classe Node -> representa cada n� do grafo individualmente, � composta por um char
 representando o nome da cidade, e um vetor de conex��es.

A classe Connection -> representa cada uma das conex��es dos n�s pertencentes ao grafo,
 � composta por um char que representa o destino do trem e um int que representa a distancia

A classe Show -> � composta pelas fun��es que mostram para o usu�rio o resultado das seguintes pesquisas:

-show_distance2-5 : mostra a distancia entre 2-5 elementos

-show_num_trips : mostra o numero de caminhos que existem dados um grafo,
 um ponto de partida, um ponto de chegada e um n�mero exato de viagens.

-show_num_trips_upto : mostra o numero de caminhos que existem dados um grafo, um ponto de partida,
 um ponto de chegada e um n�mero m�ximo de viagens.

-show_shortest_route : mostra a menor distancia entre dois pontos pertencentes ao grafo.
(Aten��o ao coment�rio em rela��o a esta fun��o)

Existe um arquivo teste.java que testa o "Test Input" que realiza os 10 testes requeridos no enunciado do trabalho.
Todos os testes foram realizados no ambiente windows utilizando o Eclipse.

� poss�vel criar testes pr�prios caso desejado, para isso, sigua as instru��es abaixo para cada uma das fun��es.

-new Graph(int n) -> inicializa um novo grafo com n n�s.

-insert_node(Graph g, char city) -> insere um novo n� no grafo.

-insert_connection(Graph g, char start, char end, int distance) -> estabelece uma nova conex�o entre dois n�s,
 partindo do n� "start" at� o n�"end", com valor igual a "distance.

-show_distance2(Graph g, char start, char end) -> mostra a distancia entre dos n�s se houver conex�o direta,
 a fun��o com 5 n�s fica show_distance5(Graph g, char start, char mid1, char mid2, char mid3, char end).

-show_num_trips_upto(Graph g, char start, char end, int num, 0) -> mostra o n�mero de caminhos onde num � o n�mero m�ximo de viagens,
 e � preciso passar um controlador de m�nimo de viagens(representado com o 0).

-show_num_trips(Graph g, char start, char end, int num) -> mostra o n�mero de caminhos do n� start at� o n� end com exatamente o n�mero num de viagens.

-show_shortest_route(Graph g, char start, char end) -> mostra o menor caminho entre o n� start e o n� end.(Essa fun��o n�o est� funcionando corretamente).





