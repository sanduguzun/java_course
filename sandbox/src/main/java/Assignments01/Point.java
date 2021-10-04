package Assignments01;


class Point {

  private double x;
  private double y;

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }


  public static double distance(Point p1, Point p2)
  {
    double dx = p2.x - p1.x;
    double dy = p2.y - p1.y;
    return Math.sqrt((dx * dx) + (dy * dy));

  }
}
