import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	public final Rectangle collisionBox = new Rectangle();
	public boolean isAlive;

	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update() {
		collisionBox.setBounds(x, y, width, height);
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		//g2.setColor(Color.YELLOW);
		//g2.draw(collisionBox);
		g2.setColor(Color.red);
		g2.fillRect(x, y, width, height);
	}

}
