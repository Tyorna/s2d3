package es2;

public class SecondoThread extends Thread {
	
		private  SommeParziali c;

		public SecondoThread( SommeParziali  c) {
			this.c = c;
		}

		@Override
		public void run() {
			c.TotSommeParziali();
		}

	}

