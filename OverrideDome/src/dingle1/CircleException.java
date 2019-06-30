package dingle1;

public class CircleException extends Exception
{
	double radius;
	CircleException(double r)
	{
		radius=r;
	}
	public String toString()
	{
		return"半径r="+radius+"不是一个正数";
	}
  }

