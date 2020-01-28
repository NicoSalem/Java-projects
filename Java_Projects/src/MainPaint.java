import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;

public class MainPaint extends JFrame {

	public static void main( String[] args ) {

		Scanner scanner = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlappyBird fb = new FlappyBird();


		frame.add(fb);
		frame.setSize(1000, 1000);
		frame.setVisible( true );

	}
}



