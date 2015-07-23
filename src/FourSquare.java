// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare {
	public static void main(String[] args) {
	
		
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(5);
		
	
		
		// 5. Do steps #6 and #7 four times...
			
			// 6. Change the color of the line the Tortoise draws to a random color 
	
		
		drawSquare();
			
			// 7. Turn the tortoise 90 degrees to the right
		for (int i = 0; i < 4; i++) {
			Tortoise.setPenColor(Colors.getRandomColor());
			drawSquare();
			Tortoise.turn(90);
		}
		
			
	}


	
	static void drawSquare() {
	
	for (int i = 0; i < 4; i++) {
		Tortoise.move(100);
		Tortoise.turn(90);
		
	}
		
		
		
	}
}



