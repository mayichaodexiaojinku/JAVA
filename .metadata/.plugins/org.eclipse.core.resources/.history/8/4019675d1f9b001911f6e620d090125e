package ThreadTest1;

class Mythread1 implements Runnable{
	private String who;
	public Mythread1(String str){
		who=str;
	}
	public void run(){
		for(int i = 0;i < 5;i++){
			try{
				Thread.sleep((int)(1000*Math.random()));
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(who+"正在运行！！！");
		}
	}
}
public class threadtest2{
    public static void  main(String[] args){
    	Mythread1 you = new Mythread1("你");
    	Mythread1 she = new Mythread1("他");
    	Thread t1 = new Thread(you);
    	Thread t2 = new Thread(she);
    	t1.start();
    	t2.start();
    }
}
