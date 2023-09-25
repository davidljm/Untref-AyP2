package ayp2.clase07.colaDePrioridad;

import java.util.PriorityQueue;

public class DemoConComparator {

	public static void main(String[] args) {
		PriorityQueue<Message> pqRev = new PriorityQueue<Message>(3, new MessageInverseComparator());

		pqRev.add(new Message("D", Urgency.Low));
		pqRev.add(new Message("E", Urgency.High));
		pqRev.add(new Message("F", Urgency.Medium));

		Message m;
		while ((m = pqRev.poll()) != null) {
			System.out.println(m);
		}
	}
}
