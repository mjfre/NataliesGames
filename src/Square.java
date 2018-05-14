import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Objects;

public class Square extends GameObject {
	boolean isAlive = true;
	boolean goingUp = false;
	public boolean left = false;
	public boolean right = false;
	int tempX;
	int tempY;
	int gravity = 2;
	int yVelocty = 0;
	static int size = 50;
	int jumpPower = 20;
	int yLimit = 500;
	boolean atRest = true;
	boolean squareCollision = false;
	int squareCollisionType = 0;
<<<<<<< HEAD
	// Key : Coming From the...
	// * 1 : Left
	// * 2 : Right
	// * 3 : Bottom
	// * 4 : Top
	boolean canJump = true;
=======
	//Key : Coming From the...
	//* 1 : Left
	//* 2 : Right
	//* 3 : Bottom
	//* 4 : Top
>>>>>>> 8228a887e8c2ba1ac4dcfdfd0e9dc87eb547ece0

	public Square(int x, int y, int width, int height) {
		super(x, y, width, height);
		x = tempX;
		y = tempY;
	}

	public int getY() {
		return y;
	}

	public void jump() {
<<<<<<< HEAD
		// if (!squareCollision) {
		//if (canJump) {
			goingUp = true;
			tempY -= jumpPower;
			canJump = false;
		//}
	}

	public void moveLeft() {
		if (x - 5 >= 0) {
			tempX = x - 5;
		}
	}

	public void moveRight() {
		if (x + 5 <= 750) {
			tempX = x + 5;
		}

	}
	// }

	// condensed if else below in square (don't need to check if(colliding) and if(!colliding)
	// created methods for moveLeft and moveRight in square
	// removed canMove variables because the values were never being changed and we can just use ifs to see if it is about to run into trouble
	// created a boolean moveRight and moveLeft in the gamePanel class so that we can move the player left and right at a constant speed
	// if there is no collision we want to assign the values of the collsion box to the values of x
	// MAke window width and height variables static so they can be used to create the floor platform
	// Keep the PFPanel member variable together at the top (i.e. squares)
	// Make a boolean for whether the setup has been completed for a level with an if statement in the actionPerformed so that we aren't redoing that every time we go through
		// calling om.setup1
		// setting setupComplete = true
		// You can also keep the square from falling before the gameState is reached by instantiating your square here and using a setter to set the object manager's square value
		// Put your om.update and om.checkCollsion that is actionPerformed in an if that checks that the state is not equal to T_STATE or E_STATE, 
		//		otherwise it will try to update the square which isn't created until the first game state
	// move player.draw to objectManager's draw method
	// remove the fake floor platform being drawn in drawGameState1
	// if you draw the collisionBox from the GameObject class, you will see that there is only one being collisionbox being drawn (on the left platform)
	// get rid of the duplicate initialization of the window jpanel in the platformer class
	// In check collision, make sure you are checking things in relation to an object's collisionBox, not the object itself
	// Add an else in PFPanel's keyPressed so that if E is pressed and the state = E_STATE, the state = T_STATE and setupcomplete = false.

	public void update() {
		super.update();
		collisionBox.setBounds(tempX, tempY += gravity + 3, Square.size, Square.size);
=======
		//if (!squareCollision) {
			
		//}
	}
	public void moveLeft(int speed) {
		tempX = x - speed;
	}
	public void moveRight(int speed) {
		tempX = x + speed;
	}

	public void update() {
		super.update();
		collisionBox.setBounds(tempX, tempY, Square.size, Square.size);
>>>>>>> 8228a887e8c2ba1ac4dcfdfd0e9dc87eb547ece0
		if (!squareCollision) {
			System.out.println("not colliding " + tempX + " " + x + " " + y + " " + tempY);
			x = (int) collisionBox.getX();
			y = (int) collisionBox.getY() - 3;
		} else {
<<<<<<< HEAD
			System.out.println("colliding");

			System.out.println(squareCollisionType);
			if (squareCollisionType == 1) {
				y = (int) collisionBox.getY() - 3;
			}
			if (squareCollisionType == 2) {
				y = (int) collisionBox.getY() - 3;
			}
			if (squareCollisionType == 3) {
				x = (int) collisionBox.getX();
			}
			if (squareCollisionType == 4) {
				x = (int) collisionBox.getX();
			}
			squareCollision = false;
		}

		// yVelocty += gravity;

=======
			squareCollision = true;
		}

		if (tempX > 750) {
			x -= 10;
		}
		if (tempX < 0) {
			x += 10;
		}
		if (squareCollision) {
			System.out.println("colliding");
			tempY += yVelocty;
			System.out.println(tempY);
			squareCollision = false;
			
		}else {
			tempX = x;
			tempY = y;
			if (left) {
				tempX = x - 5;
			}
			if (right) {
				tempX = x + 5;
			}
		}

		yVelocty += gravity;
		//if (!squareCollision) {
			tempY += yVelocty;
	//	}
>>>>>>> 8228a887e8c2ba1ac4dcfdfd0e9dc87eb547ece0
		if (yVelocty == 0) {
			goingUp = false;
		}

		tempX = x;
		tempY = y;

	}

	public void draw(Graphics g, Color c) {
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(c);
<<<<<<< HEAD
		g.fillRect(tempX, tempY, width, height);
		// System.out.println(x + " :x y: " + y);
=======
		g.fillRect(x, y, width, height);
		//System.out.println(x + " :x y: " + y);
>>>>>>> 8228a887e8c2ba1ac4dcfdfd0e9dc87eb547ece0
		g2.setColor(Color.BLUE);
		g2.draw(collisionBox);
	}

}
