package java8LambdaSolutions;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = RunnableExample::printNumbers;

		Thread incrementerThread = new Thread(runnable);
		incrementerThread.start();
	}

	public static void printNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
