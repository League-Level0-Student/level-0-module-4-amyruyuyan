package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int happinessLevel = 0; 
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
JOptionPane.showInputDialog("Do you want to buy a cat or a dog from the pet shop?"); 
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 5; i ++) {
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "feed", "groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
cuddle();
}
else if (task == 1) {
feed();
}
else if (task == 2) {
groom();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel == 5) {
JOptionPane.showMessageDialog(null, "You love your pet and your pet loves you.");
break;
}
		}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle () {
	JOptionPane.showMessageDialog(null, "Make sure to do it gently!");	
	happinessLevel++;
	}
	static void feed () {
	JOptionPane.showMessageDialog(null, "Remember to feed your pet both food and water!");
	happinessLevel++;
	}
	static void groom () {
	JOptionPane.showMessageDialog(null, "Your pet will look AMAZING after it's groomed");
	happinessLevel++;
	}

}