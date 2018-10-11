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
    return Math.sqrt(Math.pow(p2.getX() - this.getX(), 2) + Math.pow(p2.getY() - this.getY(), 2));
  }
  public double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
  }
  public String toString() {
    return "Point(" + x + "," + y + ")";
  }

}
