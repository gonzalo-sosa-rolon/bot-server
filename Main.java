import javax.swing.JOptionPane;

import server.BotServer;
import services.KeyboardService;
import client.BotClient;

public class Main {

	public static class ServerThread extends Thread {

		@Override
		public void run() {
			BotServer server = new BotServer(3210);

			server.run();
		}
	}

	public static void main(String args[]) {

		ServerThread server = new ServerThread();

		server.start();

		try {
			Thread.sleep(1500);
			BotClient client = new BotClient("localhost", 3210);
			client.run();
		} catch (Exception e) {
			e.printStackTrace();
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
