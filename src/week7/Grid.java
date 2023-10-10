package week7;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
public class Grid {
	JFrame frame;
	Grid(){
		frame=new JFrame("Grid layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,1));
		
		
		
		JButton bts1 = new JButton("twice");
		JButton bts2 = new JButton("itzy");
		JButton bts3 = new JButton("nct");
		JButton bts4 = new JButton("blackpink");
		JButton bts5 = new JButton("seventeen");
		
		
		frame.add(bts1);
		frame.add(bts2);
		frame.add(bts3);
		frame.add(bts4);
		frame.add(bts5);
		
		
		
		
		frame.setSize(500 ,500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grid();

	}

}
