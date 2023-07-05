package es2;

public class SommeParziali {
	int tot = 0;

	public void TotSommeParziali() {
		synchronized (this) {
			int tot = 0;
			for (int i = 0; i < 10; i++) {
				tot += i;
				System.out.println("Totale=" + tot);
			}
			System.out.println("Totale Finale=" + tot);
		}
	}
}

