package graphstructure;

import java.util.ArrayList;
import java.util.List;

public class Graph {
  private List<Vertex> vertices;
  private List<Edge> edges;
  private boolean isDirected;
  
  public Graph(){
    this.vertices = new ArrayList<>();
    this.edges = new ArrayList<>();
  }
  
  public void addVertex(Vertex vertex){
    vertices.add(vertex);
  }
  
  public void addEdge(Vertex v1, Vertex v2, Integer weight, boolean isDirected){
    Edge edge = new Edge(v1, v2, weight);
  }
  
  public void addDirectedEdge(Vertex start, Vertex end, Integer weight){
    Edge edge = new Edge(start, end, weight);
    edges.add(edge);
    start.addEdge(edge);
    isDirected = true;
  }
  
  public void addUndirectedEdge(Vertex v1, Vertex v2, Integer weight){
    Edge edge1 = new Edge(v1, v2, weight);
    Edge edge2 = new Edge(v2, v1, weight);
    edges.add(edge1);
    edges.add(edge2);
    v1.addEdge(edge1);
    v2.addEdge(edge2);
  }
  
  public void printAdjacencyList(){
    for (Vertex vertex : vertices){
      System.out.print(vertex + " -> ");
      for (Edge edge : vertex.getAdjacent_edges()){
        System.out.print(edge + " ");
      }
      System.out.println();
    }
  }
}
