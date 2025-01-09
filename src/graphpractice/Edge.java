package graphpractice;

public class Edge {

  private Vertex start;
  private Vertex end;
  private int weight;
  private boolean isWeighted;

  public Edge(Vertex start, Vertex end, int weight) {
    this.start = start;
    this.end = end;
    this.weight = weight;
    this.isWeighted = !(weight == 1);
  }

  public Vertex getStart() {
    return start;
  }

  public Vertex getEnd() {
    return end;
  }

  public int getWeight() {
    return weight;
  }

  public boolean isIsWeighted() {
    return isWeighted;
  }

  @Override
  public String toString() {
    if (isWeighted) {
      return start.getLabel() + " -(" + weight + ")-> " + end.getLabel();
    } else {
      return start.getLabel() + " --> " + end.getLabel();
    }
  }
}
