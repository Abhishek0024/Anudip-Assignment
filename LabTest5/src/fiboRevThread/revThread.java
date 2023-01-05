package fiboRevThread;

public class revThread extends Thread {
	
	FiboRev r;
    
	// Parameterized Constructor
	public revThread(FiboRev r) 
	{
		this.r=r;
	}
	
	@Override
	public void run() {
		r.rev();
	}

}
