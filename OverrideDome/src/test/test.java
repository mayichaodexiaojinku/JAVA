package test;

public class test {
   public static void main(String[] args){
	   Student stu1 = new Student(1,"Peter",20);
	   Student stu2 = new Student(1,"Peter",20);
	   Student stu3 = stu1;
	   System.out.println("stu1 == stu2 ?" + stu1.equals(stu3));d
   }
}
