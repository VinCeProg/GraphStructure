package graphstructure;

public class Edge {

  private Vertex start;
  private Vertex end;
  private Integer weight;
  private boolean isWeighted;

  public Edge(Vertex start, Vertex end, Integer weight) {
    this.start = start;
    this.end = end;
    this.weight = weight;
    this.isWeighted = (weight != null);
  }

  public boolean isWeighted() {
    return isWeighted;
  }

  public Vertex getStart() {
    return start;
  }

  public Vertex getEnd() {
    return end;
  }

  public Integer getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    if (isWeighted) {
      return start + " -(" + weight + ")-> " + end;
    } else {
      return start + " --> " + end;
    }
  }
}
