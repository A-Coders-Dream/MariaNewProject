import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args){ 
	String age = JOptionPane.showInputDialog("Are you 18 or over?");
if (age.equals("yes")) {
	JOptionPane.showInputDialog("Who are you voting for?");
	JOptionPane.showMessageDialog(null, "Coolio");
}
else {
	JOptionPane.showMessageDialog(null, "Bummer");
}
}

}
