import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String test =
JOptionPane.showInputDialog(null, "What is your test score?");
Double score=
Double.parseDouble(test);
if (score > 90.5) {
JOptionPane.showMessageDialog(null, "WOW! YOU MUST HAVE STUDIED REALLY HARD FOR THAT TEST!");
}
else {
JOptionPane.showMessageDialog(null, "GOOD FOR YOU! MAYBE YOU COULD TRY TO GET A HIGHER SCORE ON YOUR NEXT TEST!");	
}
}
}
