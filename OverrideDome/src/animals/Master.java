package animals;

import java.util.Scanner;

public class Master {
	 private Pet pet;
     public void getfood(Pet pet){
    	 if(pet.getHealth() < 100){
    		 pet.eatfood();
    	 }
    	 else{
    		 System.out.println("我已经饱了，不需要吃东西");
    	 }
     }
     public Pet getPet(int kind){
    	 if(kind == 1){
    		 pet = new Dog();
    	     System.out.print("请输入宠物的名字：");
    	     Scanner s = new Scanner(System.in);
    	     String _n = s.nextLine();
    	     pet.setName(_n);
    		 pet.setHealth(90);
    		 pet.setLove(80);
    	     s.close();
    	    
    	 }
    	 if(kind == 2){
    		 pet = new Penguin();
    	     System.out.print("请输入宠物的名字：");
    	     Scanner s = new Scanner(System.in);
    	     String _n = s.nextLine();
    	     pet.setName(_n);
    	     pet.setHealth(90);
    		 pet.setLove(80);
    	     s.close();
    	       	 }
    	 System.out.println("领养成功");
    	 return pet;
     }
     public void play(){
    	 pet.play();
     }
}
