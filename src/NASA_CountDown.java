import java.io.IOException;

import javax.swing.JOptionPane;


public class NASA_CountDown {
public static void main(String[] args) throws InterruptedException, IOException {
	for (int i = 0; i < 10; i++) {
		Thread.sleep (1000);
		Runtime.getRuntime().exec("say "+(10-i));
	
	}
	
	Runtime.getRuntime().exec("say Blast off!");
}
}
