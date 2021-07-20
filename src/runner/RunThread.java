package runner;

import logica.ExampleRunnable;

public class RunThread {
	public static void main(String[] args) {
		ExampleRunnable runOne = new ExampleRunnable("hilo uno");
		ExampleRunnable runTwo = new ExampleRunnable("hilo Dos");
		Thread thOne = new Thread(runOne);
		
		Thread thTwo = new Thread(runOne);
		Thread thThree = new Thread(runOne);
		thOne.start();
	//	thTwo.start();
		
	}

}
