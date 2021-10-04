package Assignments01;

import org.testng.Assert;
import org.testng.annotations.Test;



public class PointTest {

  @Test
  public void TestDistance(){
      Point p1 = new Point(2,2);
      Point p2 = new Point(4,4);
      System.out.println("Distance between points is " + Point.distance(p1, p2));
      Assert.assertEquals(Point.distance(p1, p2),2.8284271247461903);
  }
  @Test
  public void TestDistanceNegative(){
      Point p1 = new Point(2,2);
      Point p2 = new Point(4,4);
      System.out.println("Distance between points is " + Point.distance(p1, p2));
      Assert.assertFalse(Point.distance(p1, p2) == 2);
  }
}

