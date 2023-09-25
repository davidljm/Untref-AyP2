package ayp2.clase05;

public class TimeDemo {

	public static void main(String[] args) {
		System.out.println("Probando la clase para medición de tiempo...");
		Timer timer = new Timer();
		timer.start();

		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		timer.end();
		long totalTime = timer.getTotalTime();
		System.out.println("El programa tardó " + totalTime + " milisegundos en ejecutarse");
	}

}
