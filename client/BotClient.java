package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

import util.StringUtil;

import common.BotProtocol;

public class BotClient {

	private ObjectOutputStream out;
	private final Integer _port;
	private final String _host;
	private Socket _requestSocket;

	public BotClient(String host, int port) {
		this._port = port;
		this._host = host;

		try {
			this._requestSocket = new Socket(this._host, this._port);
			this.out = new ObjectOutputStream(this._requestSocket.getOutputStream());
			this.out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() throws Exception {

		while (true) {
			Thread.sleep(1500);
			String str = JOptionPane.showInputDialog("Ingrese el texto");

			if (StringUtil.isEmpty(str)) {
				break;
			}
			this.sendMessage(str);
		}

	}

	public void closeConnections() {

		try {
			this.out.close();
			this._requestSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendMoveMouseMessage(Integer deltaY, Integer deltaX) {
		String message = BotProtocol.getMoveMouseMessage(deltaY, deltaX);
		this.sendMessage(message);
	}

	public void sendScrollMessage(Integer scroll) {
		String message = BotProtocol.getScrollMessage(scroll);
		this.sendMessage(message);
	}

	public void sendClickLeftButtonMessage() {
		String message = BotProtocol.getClickLeftButtonMessage();
		this.sendMessage(message);
	}

	public void sendClickRightButtonMessage() {
		String message = BotProtocol.getClickRightButtonMessage();
		this.sendMessage(message);
	}

	public void sendWriteTextMessage(String text) {
		String message = BotProtocol.getWriteTextMessage(text);
		this.sendMessage(message);
	}

	private void sendMessage(String message) {
		try {
			if (message != null) {
				this.out.writeObject(message);
				this.out.flush();
				this.out.reset();
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
