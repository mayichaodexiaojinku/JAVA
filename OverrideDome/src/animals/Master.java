package animals;

import java.util.Scanner;

public class Master {
	 private Pet pet;
     public void getfood(Pet pet){
    	 if(pet.getHealth() < 100){
    		 pet.eatfood();
    	 }
    	 else{
    		 System.out.println("���Ѿ����ˣ�����Ҫ�Զ���");
    	 }
     }
     public Pet getPet(int kind){
    	 if(kind == 1){
    		 pet = new Dog();
    	     System.out.print("�������������֣�");
    	     Scanner s = new Scanner(System.in);
    	     String _n = s.nextLine();
    	     pet.setName(_n);
    		 pet.setHealth(90);
    		 pet.setLove(80);
    	     s.close();
    	    
    	 }
    	 if(kind == 2){
    		 pet = new Penguin();
    	     System.out.print("�������������֣�");
    	     Scanner s = new Scanner(System.in);
    	     String _n = s.nextLine();
    	     pet.setName(_n);
    	     pet.setHealth(90);
    		 pet.setLove(80);
    	     s.close();
    	       	 }
    	 System.out.println("�����ɹ�");
    	 return pet;
     }
     public void play(){
    	 pet.play();
     }
}
