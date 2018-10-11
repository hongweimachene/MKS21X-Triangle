public class Driver{
  public static void main(String[]args) {
    Point P1 = new Point (1,1);
    Point P2 = new Point (2,4);
    Point P3 = new Point (4,1);
    Triangle T1 = new Triangle(P1, P2, P3);

    System.out.println("Perimeter of triangle: " + T1.getPerimeter());

    System.out.println(T1);
    System.out.println("Vertex 1: "  + T1.getVertex(0));
    System.out.println("Vertex 2: "  + T1.getVertex(1));
    System.out.println("Vertex 3: "  + T1.getVertex(2));

    Point nP = new Point(0,0);
    T1.setVertex(0, nP);

    System.out.println(T1);
    System.out.println("Vertex 1: "  + T1.getVertex(0));
    System.out.println("Vertex 2: "  + T1.getVertex(1));
    System.out.println("Vertex 3: "  + T1.getVertex(2));

  }
}
