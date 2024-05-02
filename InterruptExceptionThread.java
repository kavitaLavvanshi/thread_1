package practice;

public class InterruptExceptionThread extends Thread{
	
	public void run() {
		try {
			
			for(int i=1;i<5;i++) {
				
				System.out.println(i);
				Thread.sleep(1000);
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		InterruptExceptionThread t = new InterruptExceptionThread();
		t.start();
		t.interrupt();
	}

}
