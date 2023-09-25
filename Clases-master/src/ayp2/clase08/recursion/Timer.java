package ayp2.clase08.recursion;

public class Timer {
	private long startTime = 0;
	private long endTime = 0;
	
	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void end() {
		endTime = System.currentTimeMillis();
	}

	public long getTotalTime() {
		return endTime - startTime;
	}

}
