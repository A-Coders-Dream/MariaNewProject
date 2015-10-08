import javax.swing.JOptionPane;


public class AreYouHappy {
public static void main(String[] args) {
	String AreYouHappy = JOptionPane.showInputDialog("Are you happy?");
	if (AreYouHappy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
	}
	else if (AreYouHappy.equals("no")) {
		String DoYouWantToBeHappy = JOptionPane.showInputDialog("Do you want to be happy?");
		if (DoYouWantToBeHappy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
	
		}
		else if (DoYouWantToBeHappy.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		}
	}
}
}
