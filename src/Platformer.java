import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Platformer {
	JFrame window;
	PFPanel panel;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	Timer timer;

	public Platformer() {
<<<<<<< HEAD
=======
		panel = new PFPanel();
>>>>>>> 8228a887e8c2ba1ac4dcfdfd0e9dc87eb547ece0
		setup();
	}

	public static void main(String[] args) {
		Platformer pf = new Platformer();
	}

	void setup() {
		window = new JFrame("Platform Thing");
		panel = new PFPanel();
		window.addKeyListener(panel);
		window.add(panel);
		panel.startGame();
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		window.setVisible(true);
		window.pack();
		timer = new Timer(1000 / 60, panel);

	}
}