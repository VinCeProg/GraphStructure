package graphpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
  
  private Map<String, Vertex> vertices;
  private List<Edge> edges;
  private boolean isDirected;
  
  public Graph(boolean isDirected){
    vertices = new HashMap<>();
    edges = new ArrayList<>();
    this.isDirected = isDirected;
  }
  
  public void addVertex(String label){
    vertices.putIfAbsent(label, new Vertex(label));
  }
  
  public Vertex getVertex(String label){
    return vertices.get(label);
  }
  
  public void addEdge(String v1, String v2, int weight){
    Vertex start = vertices.get(v1);
    Vertex end = vertices.get(v2);
    
    if (start == null || end == null) {
      throw new IllegalArgumentException("Cannot create edge, No Vertex Found");
    }
    
    Edge edge1 = new Edge(start, end, weight);
    edges.add(edge1);
    start.addEdge(edge1);
    
    if(!isDirected){
      Edge edge2 = new Edge(end, start, weight);
      edges.add(edge2);
      end.addEdge(edge2);
    }
  }
  
  @Override
  public String toString(){
    StringBuilder builder = new StringBuilder();
    
    for(Vertex vtx : vertices.values()){
      builder.append(vtx.getLabel()).append(" ->  ");
      for(Edge edge : vtx.getAdjacentEdges()){
        builder.append(edge).append("  ");
      }
      builder.append("\n");
    }
    
    return builder.toString();
  }
  public static void main(String[] args) {
    Graph graph = new Graph(false);
    
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    
    graph.addEdge("A", "B", 1);
    graph.addEdge("B", "C", 10);
    graph.addEdge("C", "D", 12);
    graph.addEdge("D", "A", 15);
    
    System.out.println(graph);
  }
  
}
