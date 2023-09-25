package ayp2.clase07.colaDePrioridad;

public class Message implements Comparable<Message> {
	private String text;
	private Urgency urgency;

	Message(String text, Urgency urgency) {
		this.text = text;
		this.urgency = urgency;
	}

	@Override
	public int compareTo(Message other) {
		return this.urgency.compareTo(other.urgency);
	}

	@Override
	public String toString() {
		return "Message [text=" + text + ", urgency=" + urgency + "]";
	}
}
