package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "You are alone on an island in the middle of the ocean where there is no other land near you.");	
int choice = JOptionPane.showOptionDialog(null, "Do you try to call for help, or try to survive on your own?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "call for help", "survive on your own", }, null);
if (choice == 0) {
JOptionPane.showMessageDialog(null, "No one could hear you because land was too far away. Part of the cause of others not hearing you was the loud sound of the ocean waves drowning your voice out. You ended up dying because you were too stubborn to think of trying to survive on your own.");	
}
if (choice == 1) {
JOptionPane.showMessageDialog(null, "You were able to survive on your own for a long time. One day a ship came by and saw you. They brought you on board and returned you to your home by ship.");	
}
}
}
