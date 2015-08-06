 import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		/*

		
		 *
		 * 
		 * 
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 * that number of times.
		 */
		String dizzyness=JOptionPane.showInputDialog("How dizzy do you want Tortoise to be, from 1-10?");
		int dizzy= Integer.parseInt(dizzyness);
		for (int i = 0; i < dizzy; i++) {
			dance(dizzy);
		
		
		}
		
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(90);
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.move(30+i*5);
		}
	}
}
