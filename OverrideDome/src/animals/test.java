package animals;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Master m1 = new Master();
		System.out.println("******输入你想领养的宠物 *******");
		System.out.println("******    1. 狗               *******");
		System.out.println("******    2. 企鹅            *******");
		System.out.print("请输入：");
		Scanner s = new Scanner(System.in);
		int kind = s.nextInt();
		Pet pet = m1.getPet(kind);
		s.close();
		m1.play();
		pet.setHealth(pet.getHealth()+1);
		
		//输入用户领养的宠物类别
	    //与领养宠物玩耍1
	}

}
