class DistanceBwPoint
{
  public static void main(String arg[])
  {
    int x1,x2,y1,y2;
    double dis;
    x1=2;y1=2;x2=4;y2=4;
    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    System.out.println("distancebetweenpoints"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
  }
}