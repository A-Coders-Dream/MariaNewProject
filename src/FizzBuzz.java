import javax.swing.JOptionPane;

import com.sun.tools.apt.Main;


public class FizzBuzz {
public static void main(String[] args) {
	for (int i = 1; i < 36; i++) {
		if (i % 3==0&&i % 5==0) {
			JOptionPane.showMessageDialog(null, "FIZZ! BUZZ!");	
		}
		if (i % 3==0) {
			JOptionPane.showMessageDialog(null, "FIZZ!");	
		}
		else if (i % 5==0) {
			JOptionPane.showMessageDialog(null, "BUZZ!");	
		}

		else {
			JOptionPane.showMessageDialog(null, i);
		}

		}
	
	}
}

