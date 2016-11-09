
public class Show {
	static void show_num_trips(Graph g, char start, char end, int num)
	{
		System.out.println(Graph.num_trips(g, start, end, num));
	}

	static void show_distance2(Graph g, char start, char end)
	{
		if(Graph.get_distance2(g, start, end)!=-1)
			System.out.println(Graph.get_distance2(g, start, end));		
		}

	static void show_distance3(Graph g, char start, char mid, char end)
	{
		if(Graph.get_distance3(g, start, mid, end)!=-1)
			System.out.println(Graph.get_distance3(g, start, mid, end));		
		}

	static void show_distance4(Graph g, char start, char mid1, char mid2, char end)
	{
		if(Graph.get_distance4(g, start, mid1, mid2, end)!=-1)
			System.out.println(Graph.get_distance4(g, start, mid1, mid2, end));		
		}

	static void show_distance5(Graph g, char start, char mid1, char mid2, char mid3, char end)
	{
		if(Graph.get_distance5(g, start, mid1, mid2, mid3, end)!=1)
			System.out.println(Graph.get_distance5(g, start, mid1, mid2, mid3, end));		
		}

	static void show_num_trips_upto(Graph g, char start, char end, int num, int aux)
	{
		System.out.println(Graph.num_trips_upto(g, start, end, num, aux));
	}
	
	static void show_num_trips_less(Graph g, char start, char end, int num, int aux)
	{
		System.out.println(Graph.num_trips_less(g, start, end, num, aux));
	}
	
	//As funções shortest_route não estão funcionando de maneira adequada.
	static void show_shortest_route(Graph g, char start, char end)
	{
		System.out.println(Graph.shortest_route(g, start, end));
	}

}

