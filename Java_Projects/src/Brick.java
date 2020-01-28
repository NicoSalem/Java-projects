import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JPanel;

public class Brick extends JPanel implements ActionListener, KeyListener {

	int px = 470;	int velrx = 0;
	int py = 800; 	int velry = 0;

	int x2 = 470;	int velx2 = 0;
	int y2 = 100;	int vely2 = 0;

	int ox = 100;   int velox = 3;
	int oy = 400;	int veloy = -3;
	
	int victory = 0;

	Timer timer = new Timer(10, this);

	public Brick() {

		timer.start();

		addKeyListener(this);
		setFocusable(true);
	}
	public void paintComponent (Graphics g) {

		super.paintComponent(g);
		this.setBackground(Color.BLACK);

		g.setColor(Color.RED);
		g.fillOval(ox, oy, 10, 10);

		g.setColor(Color.cyan);
		g.fillRect(px, py, 100, 30);

		g.setColor(Color.MAGENTA);
		g.fillRect(x2, y2, 100, 30);

		if (victory == 1) {
			g.setColor(Color.CYAN);
			g.drawString("player 1 won", 500, 500);
			timer.stop();
		}
		
		if (victory == 2) {
			g.setColor(Color.MAGENTA);
			g.drawString("player 2 won", 500, 500);
			timer.stop();
		}
	}

	public void actionPerformed(ActionEvent e) {			

		if(ox>x2 && ox<x2+100 && oy==y2) {
			veloy = -veloy; 
		}

		if(ox>px && ox<px+100 && oy==py) {
			veloy = -veloy; 
		}
		
//		if (oy < 0) {
//			veloy = -veloy;
//		}
		
		if (ox > 1000 || ox < 0) {
			velox = -velox;
		}

		if (oy < y2) {
			victory = 1;			
		}
		if (oy > 900) {
			victory = 2;
		}

		px = px + velrx;
		py = py + velry;

		x2 = x2 + velx2;
		y2 = y2 + vely2;

		ox = ox + velox;
		oy = oy + veloy;

		repaint();		
	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			velrx = 10;
			velry = 0;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			velrx = -10;
			velry = 0;
		}

		//		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		//			velrx = 0;
		//			velry = 10;
		//		}
		//		if (e.getKeyCode() == KeyEvent.VK_UP) {
		//			velrx = 0;
		//			velry = -10;
		//		}

		if (e.getKeyCode() == KeyEvent.VK_D) {
			velx2 = 5;
			vely2 = 0;
		}

		if (e.getKeyCode() == KeyEvent.VK_S) {
			velx2 = -5;
			vely2 = 0;
		}
	}

	public void keyReleased(KeyEvent e) {
		velrx = 0;
		velry = 0;

		velx2 = 0;
		vely2 = 0;
	}

	public void keyTyped(KeyEvent e) {
	}

}
