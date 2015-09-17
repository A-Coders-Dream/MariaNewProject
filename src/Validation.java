import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018 Ã

		// 2. On paper, write all the numbers that get printed when you run this class
	
		int randomNumber = new Random().nextInt(5);
		// 3. Use the randomNumber to give the user a random compliment.
for (int i = 0; i < 10; i++) {
	System.out.println(randomNumber);
	if (randomNumber==1) {
JOptionPane.showMessageDialog(null, "You are so pretty, no lie.");
}
else if (randomNumber==2) {
JOptionPane.showMessageDialog(null, "You're simply pure awesome, congrats.");
}
else if (randomNumber==3) {
JOptionPane.showMessageDialog(null, "You're eyes are so lovely! <3");
}
else if (randomNumber==4) {
JOptionPane.showMessageDialog(null, "I don't know if you already knew, but you're very, very pretty");
}
else if (randomNumber==5) {
JOptionPane.showMessageDialog(null, "You're a very, very great person");

}
	// 4. Repeat all the code above 10 times
	randomNumber = new Random().nextInt(5);
	// 5. Find someone to test out your program. They will like it :)
}
}

}

