/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rita
 */
public class game extends JPanel {
    
	ball ball = new ball(this);
        ball ball2=new ball(this);
        ball ball3=new ball(this);
	
	private void move() {
		ball.move();
                ball2.move2();
                ball3.move3();
		
	}
        private void move2(){
            
        }

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
                ball2.paint2(g2d);
                ball3.paint3(g2d);
	}
	


	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Tarea Youtubers");
		game game = new game();
		frame.add(game);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
	}
}
    

