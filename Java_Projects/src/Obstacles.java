import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Obstacles extends JPanel implements ActionListener {

	Timer timer = new Timer(10, this);
	Random random = new Random();

	int objx = 500;
	int objy = 0;

	public void paintComponent (Graphics g) {

		super.paintComponent(g);
		//this.setBackground(Color.BLACK);
		timer.start();
		g.setColor(Color.MAGENTA);
		
		g.fillRect(600, 0, 50, 600);
		g.fillRect(600, 700, 50, 300);
		
		for (int i=0; i<10000; i++) {

			objy = random.nextInt(1001);

			if(objy%100 == 0) {		
				g.fillRect(objx, 0, 50, objy-100);
				g.fillRect(objx, objy, 50, 1000-objy);
				objx+=200;
			}
			else {
				g.setColor(Color.BLUE);
				g.fillRect(600, 0, 50, 600);
				g.fillRect(600, 700, 50, 300);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//objx-=5;
		repaint();
	}



}
