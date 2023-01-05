package demandSupply;

public class ProducerMain {

	public static void main(String[] args) {
		
		// Instantiate Producer class with 1000 availableprobucts
		Producer p = new Producer(1000);
		
		// Instantiate both Thread
		DemandThread dt = new DemandThread(p);
		SupplyThread st = new SupplyThread(p);
		
		// Starting both Threads
		dt.start();
		st.start();

	}

}
