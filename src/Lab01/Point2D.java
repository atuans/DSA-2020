package Lab01;

import java.awt.Point;
import java.util.*;



public class Point2D  {

   private double x;
   private double y;
   
   public Point2D() {
	   this.x= 0;
	   this.y= 0;
	   
	  
   }
   public Point2D(double x, double y) {
	   
	   this.x=x;
	   this.y=y;
	   
   }
   
   public Point2D(Point2D oldPoint) {
	   
	   this.x= oldPoint.x;
	   this.y= oldPoint.y;
	   
   }
   
   public Point2D clone() {
	   return new Point2D(this.x, this.y);
   }
   
   public String toString() {
	   
	   return String.format("P(%6.2f, %6.2f)", this.x, this.y);
   }
   
   public Point2D existingPoint() {
	   
	   existingPoint().clone();
	   
	   return null ;
	      
   }
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	

	public static Point2D[] generate( int n, double min, double max) {
		
		
		Random generator =new Random();
		Point2D [] list = new Point2D[n];
		
		for( int i=0; i<n;i++) {
			double x = min + generator.nextDouble()*(max-min);
			double y = min + generator.nextDouble()*(max-min);
			
			list[i]= new Point2D(x,y);
		}
		return list;
	}
	
	public double distanceAB(Point2D pointA, Point2D pointB ) {
		
		double dx = pointA.getX() - pointB.getX();
		double dy = pointA.getY() - pointB.getY();
		
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public static void main(String[] args) {
		
		Point2D testPoint2d = new Point2D(2.1,3.4);
		
		testPoint2d.toString();
		
		double distance = testPoint2d.distanceAB(testPoint2d,testPoint2d);
		
		System.out.println(distance);
		
	}
   
   
   

}