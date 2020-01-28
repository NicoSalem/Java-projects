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

public class Game2 extends JPanel implements ActionListener, KeyListener{

	int x = 200;  	int velox = 2;
	int y = 500;	int veloy = 2;

	int x2 = 500;	//int x3 = 400;	
	int y2 = 0;		int y3 = 700;

	int ax=200;
	int ay=700;

	int velx2 = -3;
	//double acely = 0.001;

	Timer timer = new Timer(10, this);
	Random random = new Random();	

	public Game2() {
		timer.start();

		addKeyListener(this);
		setFocusable(true);
	}

	public void paintComponent (Graphics g) {

		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.CYAN);
		g.fillOval(x, y, 20, 20);

		g.setColor(Color.MAGENTA);

		//while(x2<10000) {

		//		g.fillRect(x2, 0, 50, 600);
		//		g.fillRect(x2, 700, 50, 300);

		g.fillRect(ax, 0, 50, ay-100);
		g.fillRect(ax, ay, 50, 1000-ay);

		//paintComponent2(g);
		//	x2 +=200;
		//}
		//ImageIcon samus = new ImageIcon("C:\\Users\\Nico\\Computer Science\\flappy-bird.png");
		//1
		//samus.paintIcon(this, g, 500, 500);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP)	{
			veloy = -5;
		}
	}

	public void keyReleased(KeyEvent e) {
		veloy = 3;
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

//		if (x2+300<0) {
//			x2=500;
//		}


		if (x>=x2 && x<=x2+30 && (y<=y2+600 || y>=y3)) {
			timer.stop();
		}

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

				g.fillRect(ax, 0, 50, ay-100);
				g.fillRect(ax, ay, 50, 900-ay);
				ax+=200;
			}
		}
	}

//	public int random() {
//		for(int i =0; i<1000; i++) {
//			this.ay = random.nextInt(1001);
//			if(ay%100 == 0) 
//				return ay;
//		}
//	}
}

