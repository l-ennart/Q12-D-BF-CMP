import java.awt.Point;
import java.util.LinkedList;

public class Graph<T> {

	public class Node<T>{
		
		public T elem;
		public Node(T type) {
			elem = type;
		}
		
	}
	
	public LinkedList<Node<T>> connections;
	
	public Graph() {
		connections = new LinkedList<>();
	}
	
}
