package server;

import java.util.ArrayList;
import java.util.List;

import common.Action;

public class BotServer {

	private SmartSocketServer _server;
	private List<ClientConnection> clients;

	public BotServer(int port) {
		this._server = new SmartSocketServer(port);
		this.clients = new ArrayList<ClientConnection>();
	}

	public void run() {

		try {
			this._server.init();
			ClientConnection client = this._server.accept();
			this.clients.add(client);

			while (true) {
				Action action = client.receive();
				if (action != null) {

					try {
						action.exec();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
