package animals;
public class Dog extends Pet {
	private String strain="牧羊犬";// 品种

	//无参构造方法
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
		System.out.println("和我一起飞飞盘吧。。。。");
	}
}
