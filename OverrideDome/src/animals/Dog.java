package animals;
public class Dog extends Pet {
	private String strain="����Ȯ";// Ʒ��

	//�޲ι��췽��
	public Dog() {
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void eatfood(){
        this.ChangeHealth(5);
	}
	public void play(){
		System.out.println("����һ��ɷ��̰ɡ�������");
	}
}
