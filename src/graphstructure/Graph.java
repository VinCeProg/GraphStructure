package graphstructure;

import java.util.ArrayList;
import java.util.List;

public class Graph {

  private List<Vertex> vertices;
  private List<Edge> edges;
  private boolean isDirected;

  public Graph(boolean isDirected) {
    this.vertices = new ArrayList<>();
    this.edges = new ArrayList<>();
    this.isDirected = isDirected;
  }

  public void addVertex(String label) {
    if (getVertex(label) == null) {
      vertices.add(new Vertex(label));
    }
  }

  public void addEdge(String v1, String v2, Integer weight) {
    Vertex start = getVertex(v1);
    Vertex end = getVertex(v2);

    if (start == null || end == null) {
      throw new IllegalArgumentException("Vertex not Found.");
    }

    Edge edge = new Edge(start, end, weight);
    edges.add(edge);
    start.addEdge(edge);

    if (!isDirected) {
      Edge revEdge = new Edge(end, start, weight);
      edges.add(revEdge);
      end.addEdge(revEdge);
    }
  }

  public void printAdjacencyList() {
    for (Vertex vertex : vertices) {
      System.out.print(vertex + " = ");
      for (Edge edge : vertex.getAdjacentEdges()) {
        System.out.print(edge + "  ");
      }
      System.out.println();
    }
  }

  public Vertex getVertex(String label) {
    for (Vertex vertex : vertices) {
      if (vertex.getLabel().equals(label)) {
        return vertex;
      }
    }
    return null;
  }
}
