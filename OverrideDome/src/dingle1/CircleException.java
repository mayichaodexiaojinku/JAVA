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
		return"�뾶r="+radius+"����һ������";
	}
  }

