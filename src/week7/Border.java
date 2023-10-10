package week7;
import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
public class Border {
	JFrame frame;
	Border(){
		frame = new JFrame("border test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(5,5));
		
		
		JButton btn1 = new JButton("jk");
		JButton btn2 = new JButton("v");
		
		
		JButton btn3 = new JButton("JIN");
		JButton btn4 = new JButton("SG");
		
		frame.add(btn1, BorderLayout.WEST);
		frame.add(btn2, BorderLayout.NORTH);
		frame.add(btn3, BorderLayout.SOUTH);
		frame.add(btn4, BorderLayout.CENTER);
		
		
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Border();
	}

}

