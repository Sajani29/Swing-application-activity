import javax.swing.*;
class Calculator extends JFrame{
	Calculator(String title){
		
	}
	Calculator(){}
	
	
}
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("JFrame");
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		
		Calculator c1=new Calculator("Calculator");
		c1.setSize(300,300);
		c1.setLocationRelativeTo(null);
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.setVisible(true);
	}
}






















