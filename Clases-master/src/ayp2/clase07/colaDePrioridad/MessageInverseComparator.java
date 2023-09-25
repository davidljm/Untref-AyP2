package ayp2.clase07.colaDePrioridad;

import java.util.Comparator;

public class MessageInverseComparator implements Comparator<Message> {

	@Override
	public int compare(Message messageA, Message messageB) {
		return messageA.compareTo(messageB) * (-1);
	}

}
