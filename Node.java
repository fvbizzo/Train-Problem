
public class Node {
	char city;
	Connection connections[];
	
	Node(char node, int all_possible)
	{
		this.city = node;
		this.connections = new Connection[all_possible];
	}
	
	static Node insert_connection(Node n, char end, int distance, int all_possible)
	{
		int i = 0;
		while(i<all_possible)
		{
			if(n.connections[i]==null)
			{
				n.connections[i] = new Connection(end, distance);
				return n;
			}
			i++;
		}
		System.out.println("WARNING! YOUR NODE HAS MADE TOO MUCH CONNECTIONS! ERROR!");
		return n;
	}
	
	static int show_distance(Node n, char end, int all_possible)
	{
		int i = 0;
		while(i<all_possible && n.connections[i]!=null)
		{
			if(n.connections[i].end == end)
				return n.connections[i].distance;
			i++;
		}
		System.out.println("NO SUCH ROUTE");
		return -1;
	}

}
