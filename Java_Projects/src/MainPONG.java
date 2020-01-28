import java.util.Scanner;

import javax.swing.JFrame;

public class MainPONG extends JFrame {
	public static void main( String[] args ) {

		Scanner scanner = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Brick b = new Brick();


		frame.add(b);
		frame.setSize(1000, 1000);
		frame.setVisible( true );

	}
}

