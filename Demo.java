/*import javax.swing.*;
import java.awt.*;

class AddStudentForm extends JFrame{
	private JTextField txtDisplay;
	private JButton btCancel;
	private JButton btAdd;

	
	AddStudentForm(){
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel titleLabel=new JLabel("Add Student Form");
		titleLabel.setFont(new Font("",1,27));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btAdd = new JButton("Add Student");
		btCancel = new JButton("Cancel");
		btAdd.setFont(new Font("",1,20));
		btCancel.setFont(new Font("",1,20));
		southPanel.add(btAdd);
		southPanel.add(btCancel);
		add("South",southPanel);
		
		JLabel lblStudentId = new JLabel("Student ID");
		JLabel lblName = new JLabel("Name");
		JLabel lblPrfMarks = new JLabel("PRF Marks");
		JLabel lblName = new JLabel("Name");
		JLabel lblName = new JLabel("Name");
		
		
		
		
		
	}
}
class Demo{
	public static void main(String args[]){
		new AddStudentForm().setVisible(true);
	}
	
}
*/
































/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AddStudentForm  extends JFrame{
	private JTextField txtStudentId;
	private JTextField txtName;
	private JTextField txtPrfMarks;
	private JTextField txtDbmsMarks;
	
	private JButton btCancel;
	private JButton btAdd;
	
	AddStudentForm(){
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel titleLabel=new JLabel("Add Student Form");
		titleLabel.setFont(new Font("",1,27));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		//-------------------------------------------------------------
		
		JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btAdd=new JButton("Add Student");
		btCancel=new JButton("Cancel");
		btAdd.setFont(new Font("",1,20));
		btCancel.setFont(new Font("",1,20));
		
		btAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("You pressed Add..");
					//dispose();
			}
		});
		btCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("You pressed Cancel..");
					//dispose();
			}
		});

		southPanel.add(btAdd);
		southPanel.add(btCancel);
		add("South",southPanel);
		//-------------------------------------------------------------
		
		JLabel lblStudentId=new JLabel("Student ID");
		JLabel lblName=new JLabel("Name");
		JLabel lblPrfMarks=new JLabel("Prf Marks");
		JLabel lblDbmsMarks=new JLabel("Dbms Marks");
		lblStudentId.setFont(new Font("",1,20));
		lblName.setFont(new Font("",1,20));
		lblPrfMarks.setFont(new Font("",1,20));
		lblDbmsMarks.setFont(new Font("",1,20));
		
		JPanel labelPanel=new JPanel(new GridLayout(4,1));
		JPanel idTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		labelPanel.add(lblStudentId);
		labelPanel.add(lblName);
		labelPanel.add(lblPrfMarks);
		labelPanel.add(lblDbmsMarks);
		add("West",labelPanel);
		
		//-------------------------------------------------------------
		txtStudentId=new JTextField(5);
		txtStudentId.setFont(new Font("",1,20));
		txtName=new JTextField(10);
		txtName.setFont(new Font("",1,20));
		txtPrfMarks=new JTextField(4);
		txtPrfMarks.setFont(new Font("",1,20));
		txtDbmsMarks=new JTextField(4);
		txtDbmsMarks.setFont(new Font("",1,20));
		
		JPanel textPanel=new JPanel(new GridLayout(4,1));
		
		JPanel idTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTextPanal.add(txtStudentId);
		textPanel.add(idTextPanal);
		
		JPanel nameTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanal.add(txtName);
		textPanel.add(nameTextPanal);
		
		JPanel prfMarksTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		prfMarksTextPanal.add(txtPrfMarks);
		textPanel.add(prfMarksTextPanal);
		
		JPanel dbmsMarksTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		dbmsMarksTextPanal.add(txtDbmsMarks);
		textPanel.add(dbmsMarksTextPanal);
		add("Center",textPanel);
	}
}
class Demo{
	public static void main(String args[]){
		new AddStudentForm().setVisible(true);
	}
}*/




// REVISE LAST WEEK THINGS
import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args){
		JFrame f1 = new JFrame("Calculator");
		f1.setSize(500,500);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton[] btnArray = new JButton[5];
		String[] btnNames = {"North","South","West","East","Center"};
		for (int i = 0; i <btnArray.length ; i++)
		{
			btnArray[i] = new JButton(btnNames[i]);
			btnArray[i].setFont(new Font("",1,30));
			f1.add(btnNames[i],btnArray[i]);
		}
		
		/*JButton btnNorth = new JButton("North");
		btnNorth.setFont(new Font("",1,30));
		
		JButton btnSouth = new JButton("South");
		btnNorth.setFont(new Font("",1,30));
		
		JButton btnEast = new JButton("East");
		btnEast.setFont(new Font("",1,30));
		
		JButton btnWest = new JButton("West");
		btnWest.setFont(new Font("",1,30));
		
		JButton btnCenter = new JButton("Center");
		btnCenter.setFont(new Font("",1,30));
		
		
		f1.add("North",btnNorth);
		f1.add("South",btnSouth);
		f1.add("East",btnEast);
		f1.add("West",btnWest);
		f1.add("Center",btnCenter);
		*/
		
		f1.pack();
		f1.setVisible(true);
	}
}

























