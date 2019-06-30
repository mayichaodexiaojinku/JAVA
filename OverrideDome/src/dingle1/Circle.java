package dingle1;
public class Circle {
private double radius;
public void setRadius(double r)throws CircleException
{
	if(r<0)
		throw new CircleException(r);
	else
		radius=r;
}
public void show(){
	System.out.println("Ô²Ãæ»ý="+3.14*radius*radius);
}
}

