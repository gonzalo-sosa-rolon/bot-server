package server;

import java.io.ObjectInputStream;
import java.net.Socket;

import util.StringUtil;

import common.Action;
import common.BotProtocol;

public class ClientConnection {

	private final Socket _connection;
	private ObjectInputStream _in;
	private Boolean running;

	public ClientConnection(Socket connection) {
		this._connection = connection;
		this._in = null;
		this.running = true;
	}

	public Action receive() {

		Action result = null;

		try {
			if (this._in == null) {
				this._in = new ObjectInputStream(this._connection.getInputStream());
			}

			if (!this._connection.isClosed()) {
				String message = (String) this._in.readObject();
				result = this.parseAction(message);
			} else {
				this.running = false;
			}
		} catch (Exception e) {
			this.running = false;
			e.printStackTrace();
		}

		return result;
	}

	public void sendMessage(String message) {
		//TODO implement
	}

	private Action parseAction(String message) {

		Action result = null;

		if (!StringUtil.isEmpty(message)) {
			result = BotProtocol.parseAction(message);
		}

		return result;
	}

	public boolean isRunning() {
		return this.running;
	}
}
