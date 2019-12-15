package wazeGame;

import java.awt.Graphics;

public abstract class GameObject {
	
	protected int x,y;
	protected ID id; 
	protected int velx, vely;
	
	public GameObject(int x , int y, ID id) {
		
		this.x = x;
		this.y = y;
		this.id = id;
		
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public void setx(int x) {
		this.x = x;
	}
	public void sety(int y) {
		this.y = y;
		
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public void setId(ID id) {
		this.id= id;
	}
	public ID getid() {
		return id;
	}
	public void setvelx(int velx) {
		this.velx = velx;
	}
	public void setvely(int vely) {
		this.vely = vely;
	}
	public int getvelx() {
		return velx;
		}
	public int getvely() {
		return vely;
		
	}
}
