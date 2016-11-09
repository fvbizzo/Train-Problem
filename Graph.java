public class Graph {
	public int tam;
	public Node nodes[];
	
	Graph(int elem)
	{
		this.tam = elem;
		this.nodes = new Node[elem];
	}
	
	static Graph insert_node(Graph g, char node)
	{
		int i =0;
		while(i<g.tam)
		{
			if(g.nodes[i] == null){
				g.nodes[i] = new Node(node, g.tam-1);
				return g;
			}
			i++;
		}
		System.out.println("WARNING! YOUR GRAPH IS FULL");
		return g;
	}
	
	static Graph insert_connection(Graph g, char start, char end, int distance)
	{
		int i, j;
		j = g.tam;
		i = 0;
		while(i<j)
		{
			if(g.nodes[i].city == start)
			{
				g.nodes[i] = Node.insert_connection(g.nodes[i], end, distance, g.tam-1);
				return g;
			}
			i++;
		}
		System.out.println("ERROR! STARTING NODE NONEXISTENT");
		return g;
	}
	
	static int get_distance2(Graph g, char start, char end)
	{
		int i, j;
		i = 0;
		j = g.tam;
		while(i<j)
		{
			if(g.nodes[i].city==start)
			{
				return Node.show_distance(g.nodes[i], end, j-1);
			}
			i++;
		}
		System.out.println("ERROR! STARTING NODE NONEXISTENT");
		return -1;
	}
	
	static int get_distance3(Graph g, char start, char mid, char end)
	{
		int i, j, dis;
		i = 0;
		j = g.tam;
		while(i<j)
		{
			if(g.nodes[i].city==start)
			{
				dis = Node.show_distance(g.nodes[i], mid, j-1);
				if(dis==-1)
					return-1;
				if(get_distance2(g, mid, end)!=-1)
					return dis +  get_distance2(g, mid, end);
				else
					return -1;
			}
			i++;
		}
		System.out.println("ERROR! STARTING NODE NONEXISTENT");
		return -1;
	}
	
	static int get_distance4(Graph g, char start, char mid1, char mid2, char end)
	{
		int i, j, dis;
		i = 0;
		j = g.tam;
		while(i<j)
		{
			if(g.nodes[i].city==start)
			{
				dis = Node.show_distance(g.nodes[i], mid1, j-1);
				if(dis==-1)
					return-1;
				if(get_distance3(g, mid1, mid2, end)!=-1)
					return dis +  get_distance3(g, mid1, mid2, end);
				else
					return -1;
			}
			i++;
		}
		System.out.println("ERROR! STARTING NODE NONEXISTENT");
		return -1;
	}
	
	static int get_distance5(Graph g, char start, char mid1, char mid2, char mid3, char end)
	{
		int i, j, dis;
		i = 0;
		j = g.tam;
		while(i<j)
		{
			if(g.nodes[i].city==start)
			{
				dis = Node.show_distance(g.nodes[i], mid1, j-1);
				if(dis==-1)
					return-1;
				if(get_distance4(g, mid1, mid2, mid3, end)!=-1)
					return dis +  get_distance4(g, mid1, mid2, mid3, end);
				else
					return -1;
			}
			i++;
		}
		System.out.println("ERROR! STARTING NODE NONEXISTENT");
		return -1;
	}
	
	static int num_trips(Graph g, char start, char end, int num)
	{
		int i, j, n, k;
		i = n = 0;
		j = g.tam;
		while(i<j)
		{
			if(g.nodes[i].city==start)
			{
				if (num !=0)
					for(k=0; k<j-1 && g.nodes[i].connections[k]!=null ; k++)
						n = n + num_trips(g, g.nodes[i].connections[k].end, end, num-1);
				else if(g.nodes[i].city == end)
					return 1;
				else
					return 0;
			}
			i++;
		}
		return n;
	}
	
	static int num_trips_upto(Graph g, char start, char end, int num, int aux)
	{
		int i, j, n, k;
		i = n = 0;
		j = g.tam;
		while(i<j)
		{
			if(g.nodes[i].city==start)
			{
				if (aux == 0)
					for(k=0; k<j-1 && g.nodes[i].connections[k]!=null ; k++)
						n = n + num_trips_upto(g, g.nodes[i].connections[k].end, end, num, aux+1);
				else if(aux<num && g.nodes[i].city == end)
				{
					n++;
					for(k=0; k<j-1 && g.nodes[i].connections[k]!=null ; k++)
						n = n + num_trips_upto(g, g.nodes[i].connections[k].end, end, num, aux+1);
				}
				else if(aux<num && g.nodes[i].city != end)
					for(k=0; k<j-1 && g.nodes[i].connections[k]!=null ; k++)
						n = n + num_trips_upto(g, g.nodes[i].connections[k].end, end, num, aux+1);
				else if(aux==num && g.nodes[i].city == end)
					return 1;
				else
					return 0;
			}
			i++;
		}
		return n;
	}
	
	//A função mostra todas as viagens, incluindo repetições, equivocadamente. 
	static int num_trips_less(Graph g, char start, char end, int num, int aux)
	{
		int i, j, n, k;
		i = n = 0;
		j = g.tam;
		while(i<j)
		{
			if(g.nodes[i].city==start)
			{
				if (aux == 0)
					for(k=0; k<j-1 && g.nodes[i].connections[k]!=null ; k++)
						n = n + num_trips_upto(g, g.nodes[i].connections[k].end, end, num, aux+1);
				else if(aux<num && g.nodes[i].city == end)
				{
					n++;
					for(k=0; k<j-1 && g.nodes[i].connections[k]!=null ; k++)
						n = n + num_trips_upto(g, g.nodes[i].connections[k].end, end, num, aux+1);
				}
				else if(aux<num && g.nodes[i].city != end)
					for(k=0; k<j-1 && g.nodes[i].connections[k]!=null ; k++)
						n = n + num_trips_upto(g, g.nodes[i].connections[k].end, end, num, aux+1);
				else
					return 0;
			}
			i++;
		}
		return n;
	}
	
	//A função shortest_route e shortest_route2 não estão funcionando como deveriam, não estão devolvendo os valores esperados.
	
	
	static int shortest_route(Graph g, char start, char end)
	{
		int i, n, j;
		char aux[];
		int aux2[];
		char flag[];
		j =g.tam;
		n = 0;
		flag = new char[j];			//vetor flag é usado para verificar quais pontos já foram contados.
		aux = new char[j];			 //vetor de nós que já foram visitados.
		aux2 = new int[j];			// vetor do valor da menor distancia para cada nó até o momento.
		i = 0;
		while(i<j)
		{
			aux[i] = g.nodes[i].city;
			aux2[i] = 1000;
			i++;
		}
		i =0;
		while(i<j)
		{
			if(g.nodes[i].city == start)
			{
				aux2[i] = 0;
				n = shortest_route2(g, i, end, aux, aux2, flag, j);
			}
			i++;
		}
		return n;
	}
	
	static int shortest_route2(Graph g, int start, char end, char aux[], int aux2[],char flag[],  int tam)
	{
		int i, j, k, n, m;
		n = i = 0;
		while(i<tam)
		{
			aux[i] = g.nodes[i].city;
			i++;
		}
		i = 0;
		while(i < tam && g.nodes[start].connections[i]!=null){
			j = g.nodes[start].connections[i].distance + aux2[i];
			m=0;
			while( g.nodes[start].connections[i].end != aux[m])
				m++;
			k = aux2[m];
			if(j<k)
				aux2[m] = j;
			if(g.nodes[start].city==end)
			{
				n=0;
				while(n<tam && aux[n]!=g.nodes[start].connections[i].end)
					n++;
				return n;
			}
			else 
			{
				n=0;
				while(n<tam)
				{
					if(g.nodes[i].city==flag[n])
						return aux2[n];
					n++;
				}
				flag[i] = g.nodes[i].city;
				n = shortest_route2(g, i, end, aux, aux2, flag, tam);
			}
			i++;
		}
		return aux2[n];		
	}

}
