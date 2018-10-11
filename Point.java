//immutable point class:
public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public Point copy(){
    return new Point(this);
  }
  public double distanceTo(Point p2) {
    return Math.sqrt(Math.pow(p2.x - x, 2) + Math.pow(p2.y - y, 2));
  }
  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
  }
  public String toString() {
    return "(" + x + "," + y + ")";
  }

}
