package server;

import java.util.ArrayList;
import java.util.List;

import common.Action;

public class BotServer {

	private final SmartSocketServer _server;
	private final List<ClientConnection> clients;

	public BotServer(int port) {
		this._server = new SmartSocketServer(port);
		this.clients = new ArrayList<ClientConnection>();
	}

	public void run() {

		try {
			this._server.init();

			while (true) {
				ClientConnection client = this._server.accept();

				ClientThread clientThread = new ClientThread(client);
				clientThread.start();	

				this.clients.add(client);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static class ClientThread extends Thread {

		private final ClientConnection _client;

		public ClientThread(ClientConnection client) {
			this._client = client;
		}

		@Override
		public void run() {
			while (true) {
				Action action = this._client.receive();
				if (action != null) {
					try {
						action.exec();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
