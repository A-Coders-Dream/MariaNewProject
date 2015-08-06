// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks {
public static void main(String[] args) {

	
	String Maria="super-cool";
	String Kaiya="super-adorable";
	String Sky="super-helpful";
	String Upneet="super-talented";
String name=JOptionPane.showInputDialog("Please enter a name.");
	

		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals ("Maria")) {
	JOptionPane.showMessageDialog(null, "Maria's superpower is " +Maria);
}
else if (name.equals ("Kaiya")) {
	JOptionPane.showMessageDialog(null, "Kaiya's superpower is " +Kaiya);
	
} 
else if (name.equals ("Sky")) {
	JOptionPane.showMessageDialog(null, "Sky's superpower is " +Sky);
} 
else if (name.equals ("Upneet")) {
	JOptionPane.showMessageDialog(null,"Upneet's superpower is " +Upneet );
}else {
JOptionPane.showConfirmDialog(null, "Sorry, I don't think that person has a superpower!");


} {
	
}
	}
}
