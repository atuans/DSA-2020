package Lab01;

import java.lang.Math;
import java.math.BigInteger;
import java.util.Random;

public class Vector implements Cloneable {

    static Random RANDOM = new Random();
    private double xDirect;
    private double yDirect;

    public Vector(double xDirect, double yDirect) {
        this.xDirect = xDirect;
        this.yDirect = yDirect;
    }

    public Vector(Vector oldVector) {
    	
    	this.xDirect=oldVector.xDirect;
    	this.yDirect=oldVector.yDirect;
    	
    }
    
    
    public Vector() {
    	this.xDirect=1;
    	this.yDirect=0;
    }
    
    public Vector Clone() {
    	
    	return new Vector(this.xDirect, this.yDirect);
    }
    
    public Vector existingVector() {
    	
    	existingVector().Clone();
    	return null;
    }
    
    
    public static Random getRANDOM() {
		return RANDOM;
	}


	public static void setRANDOM(Random rANDOM) {
		RANDOM = rANDOM;
	}


	public double getxDirect() {
		return xDirect;
	}


	public void setxDirect(double xDirect) {
		this.xDirect = xDirect;
	}


	public double getyDirect() {
		return yDirect;
	}


	public void setyDirect(double yDirect) {
		this.yDirect = yDirect;
	}


	public Vector A2B(Vector x, Vector y) {
		
		return null;
		
	}
	 public double length(Vector dX, Vector dY) {
	      
		 double lX = dX.getxDirect();
		 double lY = dY.getyDirect();
		 return Math.sqrt ( lX*lX + lY*lY );
	   }
	 
	 
	 public Vector normalize() {
	      Vector v2 = new Vector();

	      double length = Math.sqrt( this.xDirect*this.yDirect + this.yDirect*this.yDirect );
	      if (length != 0) {
	        v2.xDirect = this.xDirect/length;
	        v2.yDirect = this.yDirect/length;
	      }

	      return v2;
	   }   
	 
	 public double dotProduct ( Vector v1 ) {
	        return this.xDirect*v1.xDirect + this.yDirect*v1.yDirect;
	   }
	
	 
	 public static double angleBetweenTwoPointsWithFixedPoint(double point1X, double point1Y, 
		        double point2X, double point2Y, 
		        double fixedX, double fixedY) {

		    double angle1 = Math.atan2(point1Y - fixedY, point1X - fixedX);
		    double angle2 = Math.atan2(point2Y - fixedY, point2X - fixedX);

		    return angle1 - angle2; 
		}

	 
	 
	 
	@Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return (Vector) super.clone();
        } catch (Exception e) {
            return new Vector(this.xDirect, this.yDirect);
        }
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", xDirect, yDirect);
    }

    public Vector getPerp() {
        int seed = RANDOM.nextInt(2); // Random value [0, 1]; Or else, False or True !
        int gcd = BigInteger.valueOf((int) yDirect).gcd(BigInteger.valueOf((int) xDirect)).intValue();

        return seed == 0
                ? new Vector(-this.yDirect / gcd, this.xDirect / gcd)
                : new Vector(this.yDirect / gcd, -this.xDirect / gcd);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Vector thisVec = new Vector(2.0, 4.0);
        Object newVec = thisVec.clone();
        System.out.println(thisVec);
        System.out.println(thisVec.getPerp());
        System.out.println(Math.toDegrees(angleBetweenTwoPointsWithFixedPoint(0, 0,1, 1, 1, 0)));
    }
}