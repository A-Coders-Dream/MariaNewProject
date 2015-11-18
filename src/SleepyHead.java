
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		int Answer = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		

		if (Answer == 1) {

			JOptionPane.showMessageDialog(null, "Sleep in!");
		} else   {
			int AnswerTwo = JOptionPane.showConfirmDialog(null, "Are you on vaction?", "", JOptionPane.YES_NO_OPTION);
			if (AnswerTwo == 1) {
				JOptionPane.showMessageDialog(null, "Get up lazybones!");
			} else 
				 {
					JOptionPane.showMessageDialog(null, "Sleep in!");
				}
		}
		/*
		 * Ask the user for these values using
		 * 
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
