package animals;
public abstract class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 20;// 亲密度
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
			System.out.println("健康值应该在0至100之间，默认值为60。");
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
			System.out.println("亲密度应该在0至100之间，默认值为10。");
			this.love=10;
			return;
		}
		this.love = love;
	}
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + 
				this.name + "，我的健康值是" + this.health 
				+ "，我和主人的亲密程度是" + this.love + "。");
	}
	public abstract void eatfood();
	public abstract void play();
	public void ChangeHealth(int num){
		this.health += num;
		if(this.health > 100)
			this.health = 100;
	}
}