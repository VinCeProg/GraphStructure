package graphpractice;

import java.util.ArrayList;

public class Vertex {
  private String label;
  private ArrayList<Edge> adjacentEdges;

  public Vertex(String label) {
    this.label = label;
    this.adjacentEdges = new ArrayList<>();
  }
  
  public String getLabel() {
    return label;
  }

  public ArrayList<Edge> getAdjacentEdges() {
    return adjacentEdges;
  }
  
  public void addEdge(Edge edge){
    adjacentEdges.add(edge);
  }
}
