package animals;
public class Penguin extends Pet {
	private String sex="Q��";// �Ա�

	//�޲ι��췽��
	public Penguin() {
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	public void eatfood(){
		 this.ChangeHealth(5);
	}
	public void play(){
		 System.out.println("����һ����Ӿ�ɡ�������");
	}
}

