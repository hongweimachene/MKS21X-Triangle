public class Triangle{
  private Point v1,v2,v3;
  public Point[]p = {v1, v2, v3};
  public Triangle(Point p1, Point p2, Point p3) {
    v1 = new Point(p1);
    v2 = new Point(p2);
    v3 = new Point(p3);
    p[0] = v1;
    p[1] = v2;
    p[2] = v3;
  }
  public Triangle(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
    v1 = new Point(p1x, p1y);
    v2 = new Point(p2x, p2y);
    v3 = new Point(p3x, p3y);
    p[0] = v1;
    p[1] = v2;
    p[2] = v3;
  }
  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }
  public Point getVertex(int index) {
    return new Point(p[index].getX(), p[index].getY());
  }

  public void setVertex(int index, Point newP) {
    p[index] = new Point(newP);
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
    return "Triangle: A(" + v1.getX() + "," + v1.getY() + ")" +
    " B(" + v2.getX() + "," + v2.getY() + ")" +
    " C(" + v3.getX() + "," + v3.getY() + ")";
  }
}
