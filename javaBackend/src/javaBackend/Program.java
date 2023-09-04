package javaBackend;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;

import javax.swing.*;


public class Program {
	
	private static void initiateInterface() {
		/*System.out.println("Initiating interface");
		JFrame frame = new JFrame();
		Canvas canvas = new Canvas();
		
		frame.add(canvas);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea(
	            "This is a simple\n" +
	            "multiline text paragraph.\n" +
	            "You can easily add and format text here.");
	        textArea.setWrapStyleWord(true);
	        textArea.setLineWrap(true);
	        textArea.setOpaque(false); // Make the background transparent
	        //textArea.setEditable(false); // Make it non-editable

	        JScrollPane scrollPane = new JScrollPane(textArea);
	        frame.add(scrollPane);

	        //frame.setSize(400, 300);
	        frame.setVisible(true);*/
		
		JFrame frame = new JFrame("Rectangle with Multiline Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a custom JPanel for graphics
        JPanel customPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw a filled blue rectangle
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, 200, 100);
            }
        };
        customPanel.setOpaque(false); // Make the background transparent

        // Create a JTextArea for multiline text
        JTextArea textArea = new JTextArea(
                "This is a multiline text paragraph.\n" +
                "It is displayed on top of the blue rectangle.");
       
        textArea.setOpaque(false);

        // Create a JLayeredPane to overlay components
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(400, 300));
        

        // Add components to the layered pane with different layers
        layeredPane.add(customPanel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(textArea, JLayeredPane.PALETTE_LAYER);

        // Set the positions of the components
        customPanel.setBounds(0, 0, 400, 300);
        textArea.setBounds(50, 50, 200, 100);
        
        

        frame.add(layeredPane);
        frame.setVisible(true);
        
        
		
	}
	
	public static void main(String[] args) {
		
		initiateInterface();
		
		DataObject test = new DataObject("Java");
		
		System.out.println(test.getLanguage());
		
		
		//Scanner scanner = new Scanner(System.in);
		
		//String input;
		
		//input = scanner.nextLine();
		
		
	}

}
