package ThreadTest1;

class ThreadSale implements Runnable{
	private int tickets = 10;
	public void run(){
		while(true){
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName()+" ��Ʊ����"+tickets--+"��");
			}
			else{
				System.exit(0);
			}
		}
	}
}
public class threadtest4 {
	public static void main(String[] args){
		ThreadSale t = new ThreadSale();
		Thread t1 = new Thread(t,"��һ����Ʊ����");
		Thread t2 = new Thread(t,"�ڶ�����Ʊ����");
		Thread t3 = new Thread(t,"��������Ʊ����");
		t1.start();
		t2.start();
		t3.start();
	}
}