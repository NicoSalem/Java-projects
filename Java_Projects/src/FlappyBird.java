import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FlappyBird extends JPanel implements ActionListener, KeyListener{

	int x = 100;  	int velox = 2;
	int y = 300;	int veloy = 2;

	int x2 = 1500;	//int x3 = 400;	
	int y2 = 0;		int y3 = 700;

	int ax=0;
	int ay=700;

	int velx2 = -3;
	//double acely = 0.001;

	Timer timer = new Timer(10, this);
	Random random = new Random();

	public FlappyBird() {
		timer.start();

		addKeyListener(this);
		setFocusable(true);
	}

	public void paintComponent (Graphics g) {

		
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.CYAN);
		//g.fillOval(x, y, 20, 20);

		g.setColor(Color.GREEN);

		//while(x2<10000) {

		//		g.fillRect(x2, 0, 50, 500);
		//		g.fillRect(x2, 700, 50, 300);

		g.fillRect(x2, 0, 50, ay-200);
		g.fillRect(x2, ay, 50, 1000-ay);

		//paintComponent2(g);
		//	x2 +=200;
		//}
		ImageIcon Flappy = new ImageIcon("C:\\Users\\Nico\\Computer Science\\flappy-bird.png");
		Flappy.paintIcon(this, g, x, y);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP){
			veloy = -5;
		}
	}

	public void keyReleased(KeyEvent e) {
		veloy = 2;
	}

	public void keyTyped(KeyEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		if (x>3000) {
			x = 0;
		}
		if (y>1000) {
			y=0;
		}
		if (y<0) {
			y=1000;
		}
		if (x2+300<0) {
			x2=1000;

			//			int n = random.nextInt(5);
			//
			//			for(int i =0; i<9999900; i++) {
			//				if(n%100 == 0) {
			//					ay = n;
			//				}
			//				else {
			//					ay = 400;
			//				}
			//			}
		}

		if (x>=x2 && x<=x2+30 && (y<=y2+500 || y>=y3)) {
			timer.stop();
		}

		//		if (x>=x2 && x<x2+30 && !(y<ay && y>500)) {
		//			timer.stop();
		//		}

		//veloy += acely;
		x2 = x2 + velx2;
	    y = y + veloy;

		ax += velx2;

		repaint();

	}

	public void paintComponent2 (Graphics g) {

		this.ay = random.nextInt(1001);
		this.ax = 500;

		for(int i =0; i<3; i++) {
			if(ay%100 == 0) {

				g.fillRect(ax, 0, 50, ay-200);
				g.fillRect(ax, ay, 50, 900-ay);
				ax+=200;
			}
		}
	}
}

