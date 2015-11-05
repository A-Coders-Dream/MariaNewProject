import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String crazy = JOptionPane
				.showInputDialog("How many cats do you have? (because cats are awesome!)");
		// 2. Convert their answer into an int
		int cat = Integer.parseInt(crazy);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (cat >= 2) {
			JOptionPane.showMessageDialog(null,
					"You're a crazy cat lady! (thats a good thing)");
			playVideo("https://www.youtube.com/watch?v=2l_PmSOreGc");
		} else if (cat <= 2) {
playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}
		// 4. If they have 3 or less, call the method below to show them a cat
		// video

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like
		// a Human

	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
