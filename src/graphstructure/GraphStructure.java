package graphstructure;

public class GraphStructure {

  public static void main(String[] args) {
    Graph undirectedGraph = new Graph();
    
    Vertex v1 = new Vertex("A");
    Vertex v2 = new Vertex("B");
    Vertex v3 = new Vertex("C");
    Vertex v4 = new Vertex("D");
    
    undirectedGraph.addVertex(v1);
    undirectedGraph.addVertex(v2);
    undirectedGraph.addVertex(v3);
    undirectedGraph.addVertex(v4);
    
    undirectedGraph.addDirectedEdge(v1, v2, 5);
    undirectedGraph.addDirectedEdge(v1, v3, 5);
    undirectedGraph.addDirectedEdge(v3, v4, 5);
    
    System.out.println("Directed Graph");
    undirectedGraph.printAdjacencyList();
  }
  
}
