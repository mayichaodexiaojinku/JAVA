package test;
public class Student {
   private int _id;
   private String _name;
   private int _age;
   public Student(int id,String name,int age){
	   super();
	   this._id = id;
	   this._name = name;
	   this._age = age;
   }
   public void setName(String name){
	   this._name = name;
   }
   public void setId(int id){
	   this._id = id;
   }
   public String getName(){
         return _name;
   }
   public int getId(){
	     return _id;
   }
   public int getAge(){
	     return _age;
   }
   public boolean equals(Object obj){
	   if(obj == this){
		   return true;
	   }
	   if(!(obj instanceof Student)){
		   return false;
	   } 
	   Student s = (Student) obj;
	   System.out.println("compare 2 students.");
	   return s.getId() == this.getId() && 
			  s.getAge() == this.getAge() && 
			  s.getName().equals(this.getName());
  }
}
