
// Copyright Wintriss Technical Schools 2013
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SquareShell {

public static void main(String[] args) {



	Tortoise.setSpeed(10);

	
	int length = 25;
	int width = 1;
for (int i = 0; i < 100; i++) {
	Tortoise.setPenColor(Colors.getRandomColor());
	Tortoise.setPenWidth(width);
 length = length+4;
 width = width+1;
	drawTriangle(length);
	
  
	Tortoise.turn(4);
}

 }


private static void drawTriangle(int length) {
for (int i = 0; i < 3; i++) {
	Tortoise.turn(90);
	Tortoise.move(length);
}
	
}
}

