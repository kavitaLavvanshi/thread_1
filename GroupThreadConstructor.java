package practice;

public class GroupThreadConstructor implements Runnable{

	

	public String isAlive;
	public String isAlive1;


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
	public static void main(String[] args) {
		GroupThreadConstructor thread = new GroupThreadConstructor();
		ThreadGroup tg1 = new ThreadGroup("parent Thread");
		Thread tg2=new  Thread(tg1, thread, "start");
		tg2.start();
		
		Thread tg3=new Thread(tg1, thread, "the");
		tg3.start();
		
		Thread tg4=new Thread(tg1, thread, "work");
		 tg4.start();
		 
		 System.out.println("Thread Group Name:"+tg1.getName());
		 tg1.list();
		 
		System.out.println("");

	}

}
