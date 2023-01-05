package demandSupply;

public class Producer {

	int availableProducts;
	
	// Parameterized Constructor
	Producer(int availableProducts)
	{
		this.availableProducts=availableProducts;
	}
	
	// Method to check and fulfill demand
	synchronized void demand(int n)
	{
		System.out.println("Available Product :"+availableProducts);
		
		// Check if available product is enough
		if (n>availableProducts)
		{
			try {
				  wait();
				}catch(InterruptedException ie)
			     {
					ie.printStackTrace();
					
			     }
			}
			
		availableProducts-=n;
		System.out.println("Available Products after demant fulfillment :"+availableProducts);
			
	}
	
	
	// Method to add supply to available products
	synchronized void supply(int n)
	{
		System.out.println("Available Products before receiving supply :"+availableProducts);
		
		// Add supply to available products
		availableProducts+=n;
		
		System.out.println("Available Products after receiving supply :"+availableProducts);
		notify();
	}
}
