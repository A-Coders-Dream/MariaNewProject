import javax.swing.JOptionPane;


public class PotatoQuiz {
	public static void main(String[] args){
		String potato = JOptionPane.showInputDialog("Do you enjoy the taste of potato?");
		if (potato.equals("no")) {
			JOptionPane.showConfirmDialog(null, "Crazy, just crazy.");
		}
		else if (potato.equals("yes")) {
			String potatoHobbie = JOptionPane.showInputDialog("Awesome, whats your fav hobbie?");
		JOptionPane.showMessageDialog(null, potatoHobbie+"is better than potates");
				
			
		}
	}
}
