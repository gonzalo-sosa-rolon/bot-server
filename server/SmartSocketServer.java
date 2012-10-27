package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import model.BusinessException;

public class SmartSocketServer {

	private ServerSocket _socket;
	private int _port;

	public SmartSocketServer(int port) {
		this._socket = null;
		this._port = port;
	}

	public ClientConnection accept() {

		ClientConnection result = null;

		if (this._socket == null) {
			throw new BusinessException(
					"Error: you neet to init the server before try to accept clients");
		}

		try {
			Socket clientConnection = this._socket.accept();
			result = new ClientConnection(clientConnection);
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}

		return result;
	}

	public void init() throws IOException {
		this._socket = new ServerSocket(this._port);
	}
}
