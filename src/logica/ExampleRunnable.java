package logica;

public class ExampleRunnable implements Runnable{
private String labelThread;

	public ExampleRunnable(String labelThread) {
	super();
	this.labelThread = labelThread;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(labelThread+"->"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
