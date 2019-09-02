
public class MinhaThread implements Runnable {

	public static Integer count = 1;
	
	private int id;
	
	public MinhaThread(int id) {
		this.id = id;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Thread "+ id +": " +count++);
				/*
				synchronized(count) {
					System.out.println("Thread "+ id +": " +count++);
				}
				*/
				Thread.sleep(5);
			}
		} catch (Exception ex) {
			System.out.println("Problema na thread: " +ex.getMessage());
		}
	}

}
