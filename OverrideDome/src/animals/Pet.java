package animals;
public abstract class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 20;// ���ܶ�
	public Pet() {
	}
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<0||health>100){
			System.out.println("����ֵӦ����0��100֮�䣬Ĭ��ֵΪ60��");
			this.health=60;
			return;
		}
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("���ܶ�Ӧ����0��100֮�䣬Ĭ��ֵΪ10��");
			this.love=10;
			return;
		}
		this.love = love;
	}
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + 
				this.name + "���ҵĽ���ֵ��" + this.health 
				+ "���Һ����˵����̶ܳ���" + this.love + "��");
	}
	public abstract void eatfood();
	public abstract void play();
	public void ChangeHealth(int num){
		this.health += num;
		if(this.health > 100)
			this.health = 100;
	}
}