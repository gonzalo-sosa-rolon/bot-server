import javax.swing.JOptionPane;

import server.BotServer;
import services.KeyboardService;
import client.BotClient;

public class Main {

	public static class ServerThread extends Thread {

		private final Integer _port;

		public ServerThread(Integer port) {
			this._port = port;
		}

		@Override
		public void run() {
			BotServer server = new BotServer(this._port);
			server.run();
		}
	}

	public static void main(String args[]) {

		Boolean runServer = false;
		Integer port = 3250;

		if (runServer) {
			ServerThread server = new ServerThread(port);

			server.start();
		} else {
			try {				
				BotClient client = new BotClient("localhost", port);
				client.run();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main2(String args[]) {

		KeyboardService keyboardService = KeyboardService.getInstance();

		while (true) {
			try {
				String str = JOptionPane.showInputDialog("Ingrese el texto");

				Thread.sleep(1500);
				keyboardService.type(str);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
