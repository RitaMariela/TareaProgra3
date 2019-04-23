/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author Rita
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class ball {
    private static final int DIAMETER = 100;
	int x = (int)(Math.random()*600)+1, k=(int)(Math.random()*600)+1, l=(int)(Math.random()*800)+1;
	int y = (int)(Math.random()*800)+1, m=(int)(Math.random()*600)+1, n=(int)(Math.random()*800)+1;
	int xa = 1;
	int ya = 1;
	private game game;

	public ball(game game) {
		this.game= game;
	}

	void move() {
		if (x + xa < 0)
			xa = (int)(Math.random()*9)+1;;
		if (x + xa > game.getWidth() - DIAMETER)
			xa = (int)(Math.random()*-9)-1;;
		if (y + ya < 0)
			ya = (int)(Math.random()*9)+1;;
		if (y + ya > game.getHeight() - DIAMETER)
			ya=(int)(Math.random()*-9)-1;;
		x = x + xa;
		y = y + ya;
	}
        void move2() {
		if (k + xa < 0)
			xa = (int)(Math.random()*9)+1;
		if (k + xa > game.getWidth() - DIAMETER)
			xa = (int)(Math.random()*-9)-1;
		if (l + ya < 0)
			ya = (int)(Math.random()*9)+1;
		if (l + ya > game.getHeight() - DIAMETER)
			ya=(int)(Math.random()*-9)-1;
		k = k + xa;
		l = l + ya;
	}
        
         void move3() {
		if (m + xa < 0)
			xa = (int)(Math.random()*9)+1;
		if (m + xa > game.getWidth() - DIAMETER)
			xa = (int)(Math.random()*-9)-1;
		if (n + ya < 0)
			ya = (int)(Math.random()*9)+1;
		if (n + ya > game.getHeight() - DIAMETER)
			ya=(int)(Math.random()*-9)-1;
		m = m + xa;
		n = n + ya;
	}



	public void paint(Graphics2D g) {
                g.setColor(Color.BLUE);
		g.fillOval(x, y, DIAMETER, DIAMETER);
                
	}
        public void paint2(Graphics2D g) {
                g.setColor(Color.GREEN);
		g.fillOval(k, l, DIAMETER, DIAMETER);
     
	}
         public void paint3(Graphics2D g) {
                g.setColor(Color.RED);
		g.fillOval(m, n, DIAMETER, DIAMETER);
         }
	
    
}
