package practice;

public class JoinThread extends Thread {
	
	public void run() {
		
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
				
			}
			System.out.println(i);
			
		}
		
	}

	public static void main(String[] args) {
	JoinThread j1 = new JoinThread();
	JoinThread j2 = new JoinThread();
	JoinThread j3 = new JoinThread();
	j1.start();
	try {
		j1.join();
		
	}catch(Exception e) {
		
		System.out.println(e);
	}
     j2.start();
     j3.start();
	}

}
