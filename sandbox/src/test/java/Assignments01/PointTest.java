package Assignments01;

import org.testng.Assert;
import org.testng.annotations.Test;



public class PointTest {

  @Test
  public void TestDistance(){
      Point p1 = new Point(2,2);
      Point p2 = new Point(4,4);
      System.out.println("Distance between points is " + p1.distance(p2));
      Assert.assertEquals(p1.distance(p2),2.8284271247461903);
  }
  @Test
  public void TestDistanceNegative(){
      Point p1 = new Point(2,2);
      Point p2 = new Point(4,4);
      System.out.println("Distance between points is " + p1.distance(p2));
      Assert.assertFalse(p1.distance(p2) == 2);
  }
}

