package graphUsingLists;

public class GraphStructure {

  public static void main(String[] args) {
    
    Graph graph = new Graph(false);
    
    //Creates vertices
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    
    //Creates edges
    graph.addEdge("A", "B", 5);
    graph.addEdge("C", "A", null);
    graph.addEdge("B", "D", 10);
    
    //Prints out the Graph Adjacency List
    System.out.println("Graph Adjacency List");
    graph.printAdjacencyList();
  }
  
}
