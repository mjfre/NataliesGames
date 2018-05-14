
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	ArrayList<GameObject> objects;

	private int score = 0;
	Square s;

	long enemyTimer = 0;
	int enemySpawnTime = 1000;

	public ObjectManager(Square s) {
		objects = new ArrayList<GameObject>();
		this.s = s;
	}

	public void addObject(GameObject steps) {
		objects.add(steps);

	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.update();
		}
		s.update();
	}

	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
			s.draw(g);
		}
		g.setColor(Color.BLACK);
		s.draw(g, Color.WHITE);
	}

	public void checkCollision() {
		for (int i = 0; i < objects.size(); i++) {
				GameObject o1 = objects.get(i);
				if (s.collisionBox.intersects(o1.collisionBox)) {
					//results
					//s.tempY = s.getY() + o1.y;
					//System.out.println(s.y);
					//s.collisionBox.setBounds(s.x, o1.y - s.height, 50, 50);
					//System.out.println("Did the thing");
<<<<<<< HEAD
					
					//Key : Coming From the...
					//* 1 : Left
					//* 2 : Right
					//* 3 : Bottom
					//* 4 : Top
					
					int collisionBuffer = 10;
//					
					//1 - left
					if(s.collisionBox.x + s.collisionBox.width > o1.collisionBox.x && s.collisionBox.y + s.collisionBox.height > o1.collisionBox.y && s.collisionBox.y + s.collisionBox.height < o1.collisionBox.y+o1.collisionBox.height && s.collisionBox.x < o1.collisionBox.x+collisionBuffer) {
						s.squareCollisionType =  1;
					}
					//2 - Right 
					if(s.collisionBox.x + s.collisionBox.width > o1.collisionBox.x + (o1.collisionBox.width - collisionBuffer) && s.collisionBox.y + s.collisionBox.height > o1.collisionBox.y && s.collisionBox.y + s.collisionBox.height < o1.collisionBox.y+o1.collisionBox.height && s.collisionBox.x < o1.collisionBox.x+o1.collisionBox.width) {
						s.squareCollisionType =  2;
					}
					//3 - Bottom
					if(s.collisionBox.x + s.collisionBox.width > o1.collisionBox.x && s.collisionBox.y > o1.collisionBox.y + (o1.collisionBox.height-collisionBuffer)&& s.collisionBox.y < o1.collisionBox.y+o1.collisionBox.height && s.collisionBox.x < o1.collisionBox.x+o1.collisionBox.width) {
						s.squareCollisionType =  3;
=======
					if (s.collisionBox.x + s.collisionBox.width > o1.collisionBox.x && s.y > o1.collisionBox.y && s.y < o1.collisionBox.y + o1.collisionBox.height && s.x < o1.collisionBox.x + o1.collisionBox.width) {
						
>>>>>>> 8228a887e8c2ba1ac4dcfdfd0e9dc87eb547ece0
					}
					//4 - Top
					if(s.collisionBox.x + s.collisionBox.width > o1.collisionBox.x && s.collisionBox.y + s.collisionBox.height > o1.collisionBox.y && s.collisionBox.y + s.collisionBox.height < o1.collisionBox.y+collisionBuffer && s.collisionBox.x < o1.collisionBox.x+o1.collisionBox.width) {
						s.squareCollisionType =  4;
					}
					
					s.squareCollision = true;
					
				}
				
		}
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int s) {
		score = s;
	}
	
	public void setSquare(Square s) {
		this.s = s;
	}

	public void reset() {
		objects.clear();
	}

	
	public void setup1() {
		Steps floor = new Steps(0, PFPanel.WINDOW_H-20, PFPanel.WINDOW_W, 20);
		objects.add(floor);
		Steps afloor = new Steps(0, 600, 800, 50);
		objects.add(afloor);
		afloor.collisionBox.setBounds(0, 600, 800, 50);
		Steps ap1 = new Steps(250, 500, 100, 25);
		ap1.collisionBox.setBounds(250, 500, 100, 25);
		objects.add(ap1);
		Steps ap2 = new Steps(500, 400, 100, 25);
		objects.add(ap2);
		
	}
	public void setup2() {
		Steps bp1 = new Steps(1,1,1,1);
	}
}
