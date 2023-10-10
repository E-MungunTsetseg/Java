package week7;
import java.awt.*;
import javax.swing.*;
//import javax.swing.JFrame.*;
public class sg {
	JFrame frame;
	sg(){
		frame = new JFrame ("suga");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(10,1));
		
		
		
	
		JButton bts1 = new JButton("exo");
		JButton bts2 = new JButton("easpa");
		JButton bts3 = new JButton("mamamoo");
		JButton bts4 = new JButton("txt");
		JButton bts5 = new JButton("newjeans");
		JButton bts6 = new JButton("2ne1");
		JButton bts7 = new JButton("bigbang");
		JButton bts8 = new JButton("ive");
		JButton bts9 = new JButton("g idle");
		JButton bts10 = new JButton("BTS");
		
		
		JPanel panel=new JPanel(new GridLayout(7,10));

		panel.add(bts6);
		panel.add(bts7);
		panel.add(bts8);
		panel.add(bts9);
		panel.add(bts10);
	
		frame.add(bts4);
		frame.add(bts5);
		frame.add(panel);
		
		
		
		frame.add(bts1,BorderLayout.NORTH);
		frame.add(bts2,BorderLayout.EAST);
		frame.add(bts3,BorderLayout.WEST);

		
		
		
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sg();

	}

}
