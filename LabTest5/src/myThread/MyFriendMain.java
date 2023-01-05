package myThread;

public class MyFriendMain {

	public static void main(String[] args) {

		// Instantiate all Threads
		Thread th1 = new MyFriends();
		Thread th2 = new MyFriends();
		Thread th3 = new MyFriends();
		
		// Starting all Threads
		th1.start();
		th2.start();
		th3.start();

	}

}
