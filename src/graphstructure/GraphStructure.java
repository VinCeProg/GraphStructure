package graphstructure;

public class GraphStructure {

  public static void main(String[] args) {
    
    //Creates instance
    Graph graph = new Graph(false);
    
    //Creates vertices
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    
    //Creates edges
    graph.addEdge("A", "B", 5);
    graph.addEdge("A", "C", null);
    graph.addEdge("B", "D", 10);
    
    System.out.println("Graph Adjacency List");
    graph.printAdjacencyList();
  }
  
}
