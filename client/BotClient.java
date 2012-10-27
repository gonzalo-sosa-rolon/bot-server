package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class BotClient {

	private ObjectOutputStream out;
	private final Integer _port;
	private final String _host;

	public BotClient(String host, int port) {
		this._port = port;
		this._host = host;
	}

	public void run() throws Exception {
		Socket requestSocket = new Socket(this._host, this._port);

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
