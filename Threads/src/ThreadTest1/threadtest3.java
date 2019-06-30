package ThreadTest1;
class ThreadSale1 extends Thread{
	private int tickets = 10;
	public void run(){
		while(true){
			if(tickets > 0){
				System.out.println(this.getName()+" ÊÛÆ±»ú"+tickets--+ "ºÅ");
			}
			else{
				System.exit(0);
			}
		}
	}
}
public class threadtest3 {
	public static void main(String[] args){
		ThreadSale1 t1 = new ThreadSale1();
		ThreadSale1 t2 = new ThreadSale1();
		ThreadSale1 t3 = new ThreadSale1();
		t1.start();
		t2.start();
		t3.start();
	}
}
