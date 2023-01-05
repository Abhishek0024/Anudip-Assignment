package fiboRevThread;

public class FiboRevMain {

	public static void main(String[] args) {
		
		// Instantiate FiboRev class
		FiboRev fv = new FiboRev();
		
		// Instantiate both Threads
		Thread th1 = new fiboThread(fv);
		Thread th2 = new revThread(fv);
		
		// Starting Threads
		th1.start();
		th2.start();
	}

}
