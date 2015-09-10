import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
	
		speak("Czechoslovakia ");
	String Potato= JOptionPane.showInputDialog("Now try spelling it!");
if (Potato.equals("Czechoslovakia" )) {
	JOptionPane.showMessageDialog(null, "Correct! I can't even spell that...");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect, good luck next time!");
}
	
	speak("Xanthosis");
String Potate= JOptionPane.showInputDialog("Now try spelling it!");
if (Potate.equals("Xanthosis" )) {
JOptionPane.showMessageDialog(null, "Correct! I can't even spell that...");
}
else {
JOptionPane.showMessageDialog(null, "Incorrect, good luck next time!");
}

	speak("Antediluvian");
String Potateo= JOptionPane.showInputDialog("Now try spelling it!");
if (Potateo.equals("Antediluvian" )) {
JOptionPane.showMessageDialog(null, "Correct! I can't even spell that...");
}
else {
JOptionPane.showMessageDialog(null, "Incorrect, good luck next time!");
}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
