package dingle1;
public class Exception10 {
public static void main(String[] args){
Circle cir=new Circle();
  try{
	  cir.setRadius(-2.0);
  }
  catch(CircleException e)
  {
	  System.out.println("�Զ����쳣��"+e.toString()+"");
  }
  cir.show();
}
}
