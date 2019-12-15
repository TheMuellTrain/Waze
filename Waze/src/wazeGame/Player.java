package wazeGame;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {
	public Player(int x, int y, ID id) {
		
		super(x,y,id);
		velx = 1;
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(x,y,32,32);
		
		
	}

}
