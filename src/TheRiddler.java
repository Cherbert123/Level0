import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		
		String answer = JOptionPane.showInputDialog("feed me and i thrive. give me drink and i die.");
		
		if (answer.equalsIgnoreCase("Fire")){
		JOptionPane.showMessageDialog(null, "Correct");	
		score = score + 1;
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is fire");	
		}
		String answer2 = JOptionPane.showInputDialog("i am tall when i am young, but short when i am old. what am i?");
		
		if (answer2.equalsIgnoreCase("candle")){
		JOptionPane.showMessageDialog(null, "Correct");	
		score = score + 1;
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is candle");	
		}
String answer3 = JOptionPane.showInputDialog("if a electric train is traveling south, which may is the smoke going?");
		
		if (answer3.equalsIgnoreCase("there is none")){
		JOptionPane.showMessageDialog(null, "Correct");	
		score = score + 1;
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is there is none");	
		}
String answer4 = JOptionPane.showInputDialog("Which weighs more, a pound of feathers or a pound of bricks?");
		
		if (answer4.equalsIgnoreCase("neither")){
		JOptionPane.showMessageDialog(null, "Correct");	
		score = score + 1;
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is neither");	
		}
String answer5 = JOptionPane.showInputDialog("What goes up but never comes down?");
		
		if (answer5.equalsIgnoreCase("age")){
		JOptionPane.showMessageDialog(null, "Correct");	
		score = score + 1;
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is age");	
		}
		
		JOptionPane.showMessageDialog(null, "Your score is: " + score +"/5");
	}
}