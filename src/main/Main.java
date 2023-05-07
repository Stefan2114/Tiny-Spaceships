package main;

import javax.swing.JFrame;

public class Main {

public static JFrame window;
	
	
	public static void main(String[] args) {
		window= new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Tiny Planes");
		
		
		GamePanel gamepanel = new GamePanel();
		window.add(gamepanel);
		
		//gamepanel.config.loadConfig();
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamepanel.setupGame();
		gamepanel.startGameThread();
	}

}
