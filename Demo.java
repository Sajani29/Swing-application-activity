import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton b1=new JButton();
		b1.setText("Hello");
		b1.setFont(new Font("",1,30));
		f1.add("South",b1);
		
		JButton b2 = new JButton();
		b2.setText("Hello North");
		b2.setFont(new Font("",1,30));
		f1.add("North",b2);
		
		JButton b3 = new JButton();
		b3.setText("Hello West");
		b3.setFont(new Font("",1,30));
		f1.add("West",b3);
		
		JButton b4 = new JButton();
		b4.setText("Hello East");
		b4.setFont(new Font("",1,30));
		f1.add("East",b4);
		
		JButton b5 = new JButton();
		b5.setText("Hello Center");
		b5.setFont(new Font("",1,30));
		f1.add("Center",b5);
		f1.pack();
		f1.setVisible(true);
	}
}
