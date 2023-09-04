package javaBackend;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Canvas extends JComponent {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D graphics = (Graphics2D)g;
		graphics.setColor(Color.blue);
		graphics.fillRect(32, 32, 64, 64);
		graphics.setColor(Color.red);
		graphics.fillOval(128, 32, 64, 64);
		graphics.drawString("Yolo", 64, 64);
		
        
	}
}
