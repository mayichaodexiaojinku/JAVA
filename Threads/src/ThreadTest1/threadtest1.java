package ThreadTest1;
class Mythread extends Thread{
	private String who;
	public Mythread(String str){
		who=str;
	}
	public void run(){
		for(int i = 0;i < 5;i++){
			try{
				sleep((int)(1000*Math.random()));
			}
			catch(InterruptedException e){}
			System.out.println(who+"正在运行！！！");
		}
	}
}
public class threadtest1{
    public static void  main(String[] args){
    	Mythread you = new Mythread("你");
    	Mythread she = new Mythread("他");
    	you.start();
    	she.start();
    	System.out.println("主方法main（）运行结束");
    }
}
