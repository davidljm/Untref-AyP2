package ayp2.clase07.colaDePrioridad;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		PriorityQueue<Message> pq = new PriorityQueue<Message>(3);

		pq.add(new Message("A", Urgency.Low));
		pq.add(new Message("B", Urgency.High));
		pq.add(new Message("C", Urgency.Medium));

		Message m;
		while ((m = pq.poll()) != null) {
			System.out.println(m);
		}
	}
}