package animals;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Master m1 = new Master();
		System.out.println("******�������������ĳ��� *******");
		System.out.println("******    1. ��               *******");
		System.out.println("******    2. ���            *******");
		System.out.print("�����룺");
		Scanner s = new Scanner(System.in);
		int kind = s.nextInt();
		Pet pet = m1.getPet(kind);
		s.close();
		m1.play();
		pet.setHealth(pet.getHealth()+1);
		
		//�����û������ĳ������
	    //������������ˣ1
	}

}
