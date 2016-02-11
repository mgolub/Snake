import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		// Creating the window with all its awesome snaky features
		GameFrame f1 = new GameFrame();

		// Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(700, 700);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
