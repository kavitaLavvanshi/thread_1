package practice;

public class YieldMethod extends Thread{
	
	public void run() {
		for(int i=1;i<3;i++) {
			
			System.out.println(Thread.currentThread().getName()+ "My Thread");
		}
		
		
	}
	

	public static void main(String[] args) {
	  YieldMethod y1 = new YieldMethod();
	  YieldMethod y2 = new YieldMethod();
	  
	  y1.start();
	  y2.start();
	  
	  for(int i=1;i<3;i++) {
		  
		  y1.yield();
		  System.out.println(Thread.currentThread().getName()+ "My Thread1");
	  }

	}

}
