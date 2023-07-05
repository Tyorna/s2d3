package es2;

public class Secondo {

	public static void main(String[] args) {

		int numbers[] = new int[3000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) Math.floor(Math.random() * 10 + 1);
		}

		System.out.println(numbers.length + " random numero " + numbers[15]);

		SommeParziali c = new SommeParziali();
		SecondoThread t1 = new SecondoThread(c);
			SecondoThread t2 = new SecondoThread(c);
			SecondoThread t3 = new SecondoThread(c);

			t1.start();
//			try {
//				t1.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			t2.start();
			t3.start();


		}
	}

