
public class Teste{

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g = Graph.insert_node(g, 'A');
		g = Graph.insert_node(g, 'B');
		g = Graph.insert_node(g, 'C');
		g = Graph.insert_node(g, 'D');
		g = Graph.insert_node(g, 'E');
		g = Graph.insert_connection(g, 'A', 'B', 5);
		g = Graph.insert_connection(g, 'B', 'C', 4);
		g = Graph.insert_connection(g, 'C', 'D', 8);
		g = Graph.insert_connection(g, 'D', 'C', 8);
		g = Graph.insert_connection(g, 'D', 'E', 6);
		g = Graph.insert_connection(g, 'A', 'D', 5);
		g = Graph.insert_connection(g, 'C', 'E', 2);
		g = Graph.insert_connection(g, 'E', 'B', 3);
		g = Graph.insert_connection(g, 'A', 'E', 7);
		Show.show_distance3(g, 'A', 'B', 'C');	
		Show.show_distance2(g, 'A', 'D');	
		Show.show_distance3(g, 'A', 'D', 'C');	
		Show.show_distance5(g, 'A', 'E', 'B', 'C', 'D');
		Show.show_distance3(g, 'A', 'E', 'D');	
		Show.show_num_trips_upto(g,  'C',  'C', 3, 0);
		Show.show_num_trips(g, 'A', 'C', 4);
		//Show.show_num_trips_less(g,  'C',  'C',  30,  0);
		/* A função shortest_route não está funcionando de maneia adequada.
		Show.show_shortest_route(g, 'A', 'C');
		Show.show_shortest_route(g,  'B',  'B');*/
	}

}
