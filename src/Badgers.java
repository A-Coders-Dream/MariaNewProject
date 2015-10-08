import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {
for (int j= 0; j < 2; j++) {
	for (int i = 0; i < 3; i++) {
sayBadger();

}
for (int i = 0; i < 2; i++) {
speak("mushroom");
}
for (int i = 0; i < 1; i++) {
speak("snake");
}
}
}


	private static void sayBadger() {
speak("Badger");
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
