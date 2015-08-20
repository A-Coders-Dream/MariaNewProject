// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import javax.swing.colorchooser.ColorChooserComponentFactory;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseSpiralMaker {

	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Colors.getRandomColor());
		// 3. Make a variable to hold the number of sides and set it to 0
		int Sides = 0;
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String Shape = JOptionPane.showInputDialog("What shape, Square, Triangle, Pentagon?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (Shape.equals("Square")) {
			int Sides1 = 90;
			for (int i = 0; i < 70; i++) {
				Tortoise.move(7*i);
				Tortoise.turn(Sides1);
			}
		}
		else if (Shape.equals("Triangle")) {
			int Sides2 = 120;
			for (int i = 0; i < 70; i++) {
				Tortoise.move(7*i);
				Tortoise.turn(Sides2);
			}
		}
		else if (Shape.equals("Pentagon")) {
			int Sides3 = 72 ;
			for (int i = 0; i < 70; i++) {
				Tortoise.move(7*i);
				Tortoise.turn(Sides3);
			}
		}
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		for (int i = 0; i < 15; i++) {
			Tortoise.move(7*i);
			Tortoise.turn(Sides);
		}
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}

