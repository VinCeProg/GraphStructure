package graphpractice;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
  private String label;
  private List<Edge> adjacentEdges;

  public Vertex(String label) {
    this.label = label;
    this.adjacentEdges = new ArrayList<>();
  }
  
  public String getLabel() {
    return label;
  }

  public List<Edge> getAdjacentEdges() {
    return adjacentEdges;
  }
  
  public void addEdge(Edge edge){
    adjacentEdges.add(edge);
  }
}
