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
			System.out.println(who+"�������У�����");
		}
	}
}
public class threadtest1{
    public static void  main(String[] args){
    	Mythread you = new Mythread("��");
    	Mythread she = new Mythread("��");
    	you.start();
    	she.start();
    	System.out.println("������main�������н���");
    }
}