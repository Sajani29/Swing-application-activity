import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton[] buttonArray = new JButton[5];
		String[] buttonName = {"North","South","West","East","Center"};
		
		for (int i = 0; i < buttonArray.length; i++)
		{
			buttonArray[i] = new JButton(buttonName[i]);
			buttonArray[i].setFont(new Font("",1,30));
			f1.add(buttonName[i],buttonArray[i]);
		}
		f1.pack();
		f1.setVisible(true);
	}
}
