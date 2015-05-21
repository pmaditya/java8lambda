package java8Lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			}
		};

		Thread incrementerThread = new Thread(runnable);
		incrementerThread.start();
	}

}
