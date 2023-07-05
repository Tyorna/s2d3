package es1;


public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			FirstThread t1 = new FirstThread("*");
			FirstThread t2 = new FirstThread("!");

			// SimpleThread eredita da Thread quindi posso fare direttamente t1.start()
//			t1.run(); // NON CHIAMARE RUN DIRETTAMENTE

//			SimpleRunnable r1 = new SimpleRunnable();
//			SimpleRunnable r2 = new SimpleRunnable();

			Thread t3 = new Thread(t1);
			Thread t4 = new Thread(t2);
			t3.start();
			t4.start();
	}

}
