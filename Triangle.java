public class Triangle{
  private Point v1,v2,v3;
  public Triangle(Point p1, Point p2, Point p3) {
    v1 = new Point(p1);
    v2 = new Point(p2);
    v3 = new Point(p3);
  }
  public Triangle(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
    v1 = new Point(p1x, p1y);
    v2 = new Point(p2x, p2y);
    v3 = new Point(p3x, p3y);
  }
  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }
  public Point getVertex(int index) {
    if (index == 0) return v1;
    if (index == 1) return v2;
    if (index == 2) return v3;
    return null;
  }

  public void setVertex(int index, Point newP) {
    if (index ==  0) {
      v1 = new Point(newP);
    }
    if (index == 1) {
      v2 = new Point(newP);
    }
    if (index == 2) {
      v3 = new Point(newP);
    }
  }
  public String toString() {
    return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
  }
}
