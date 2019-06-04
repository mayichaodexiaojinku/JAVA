package animals;
public class Penguin extends Pet {
	private String sex="Q仔";// 性别

	//无参构造方法
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
		 System.out.println("和我一起游泳吧。。。。");
	}
}

