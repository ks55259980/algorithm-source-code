/**   A class that represents a circle.      @author Frank M. Carrano   @version 4.0*/public class Circle implements Circular{	private double radius;	public void setRadius(double newRadius)	{		radius = newRadius;	} // end setRadius	public double getRadius()	{		return radius;	} // end getRadius	public double getArea()	{		return Math.PI * radius * radius;	} // end getArea} // end Circle