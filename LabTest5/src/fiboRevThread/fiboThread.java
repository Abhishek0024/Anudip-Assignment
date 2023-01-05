package fiboRevThread;

public class fiboThread extends Thread {

	FiboRev f;
    
	// Parameterized Constructor
	public fiboThread(FiboRev f) 
	{
		this.f=f;
	}
	
	@Override
	public void run() {
		f.fibo();
	}
	
}
