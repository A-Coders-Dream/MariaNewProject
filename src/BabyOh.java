import java.io.IOException;

import javax.swing.JOptionPane;

public class BabyOh {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		for (int i = 0; i < 4; i++) {
			// Thread.sleep(1000);
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					sayBaby("no");
				} else {
					sayBaby("oh");
				}

				Thread.sleep(1000);
			}

			Runtime.getRuntime().exec("say I thought you'll always be mine");

		}

	}

	private static void sayBaby(String Oh) throws IOException,
			InterruptedException {
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			Runtime.getRuntime().exec("say Baby");
		}
		Thread.sleep(1000);

		Runtime.getRuntime().exec("say " + Oh);
	}
}
