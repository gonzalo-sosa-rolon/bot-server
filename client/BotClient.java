package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class BotClient {

	private ObjectOutputStream out;

	public void run(int port) throws Exception {
		Socket requestSocket = new Socket("localhost", port);

		this.out = new ObjectOutputStream(requestSocket.getOutputStream());
		this.out.flush();

		while (true) {
			Thread.sleep(1500);
			String str = JOptionPane.showInputDialog("Ingrese el texto");
			this.sendMessage(str);
		}
	}

	void sendMessage(String msg) {
		try {
			this.out.writeObject(msg);
			this.out.flush();
			this.out.reset();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
