package graphstructure;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

  private String label;
  private List<Edge> adjacent_edges;

  public Vertex(String label) {
    this.label = label;
    this.adjacent_edges = new ArrayList<>();
  }

  public String getLabel() {
    return label;
  }

  public List<Edge> getAdjacent_edges() {
    return adjacent_edges;
  }

  public void addEdge(Edge edge) {
    adjacent_edges.add(edge);
  }

  @Override
  public String toString() {
    return label;
  }
}
