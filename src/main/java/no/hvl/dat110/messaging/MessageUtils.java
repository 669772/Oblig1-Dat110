package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START
		segment = new byte[SEGMENTSIZE];
		
		data = message.getData();
		
		segment[0] = (byte) data.length;
		
		for(int i = 1; i <= segment[0]; i++) {
			segment[i] = data[i-1];
		}
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
			
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		// decapsulate segment and put received payload data into a message
		
		byte[] b = new byte[segment[0]];
		
		
		for (int i = 1; i <= segment[0]; i++) {
			b[i-1] = segment[i];
		}
		
		message = new Message(b);
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
		
		return message;
		
	}
	
}
