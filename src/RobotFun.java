import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class RobotFun {
public static void main(String[] args) {
	Robot Maria=new Robot("batman");
	Maria.setWindowColor(Color.RED.darker());
	Maria.setPenColor(Color.white);
	Maria.penDown();
	Maria.sparkle();
	for (int i = 0; i < 4; i++) {
		Maria.move(50);
		Maria.turn(90);
	}

}
}
