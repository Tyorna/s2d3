package es1;

public class FirstThread extends Thread {

	private String simb;

	public FirstThread(String simb) {
		this.simb = simb;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + " " + this.simb);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}