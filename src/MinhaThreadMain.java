
public class MinhaThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1, t2;
		
		t1 = new Thread(new MinhaThread(1));
		t2 = new Thread(new MinhaThread(2));
		
		t1.start();
		t2.start();
	}

}
