import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame{
	private JButton btExit;
	private JButton btAdd;
	private JButton btCancel;
	
	Calculator(String title){
		setTitle(title);
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		btExit=new JButton("Exit");
		btExit.setFont(new Font("",1,25));
		btExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("Exited...");
				System.exit(0);	//dispose();
			}
		});
		
		JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btAdd=new JButton("Add Student");
		btCancel=new JButton("Cancel");
		btAdd.setFont(new Font("",1,20));
		btCancel.setFont(new Font("",1,20));
		
		southPanel.add(btAdd);
		southPanel.add(btCancel);
		add("South",southPanel);
		btAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("Pressed add");
				System.exit(0);	//dispose();
			}
		});
		add("North",btExit);
	}
} 
class Demo{
	public static void main(String args[]){
		Calculator c1=new Calculator("Calculator");
		c1.setVisible(true);
	}
}











