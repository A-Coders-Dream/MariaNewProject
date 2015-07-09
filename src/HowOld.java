import javax.swing.JOptionPane;


public class HowOld {
public static void main(String[] args) {
	String hi="you have been alive in ";
	String year = JOptionPane.showInputDialog("What year were you born in?");
	int years = Integer.parseInt(year);
	for (int i = 0; i <= 2014-years; i++) {
	hi+=(years+i+", ");
			
	}
	hi+=("and,"+2015);
	JOptionPane.showMessageDialog(null, hi);
}
}
