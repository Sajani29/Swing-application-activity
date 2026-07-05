//AD STUDENT FORM
import javax.swing.*;
import java.awt.*;
class AddStudentForm extends JFrame{
	private JLabel addStudentForm;
	private JLabel[] detailsFormArray;
	private String[] detailsForm;
	private JPanel detailsPanel;
	private JPanel txtPanel;
	private JButton btnAdd;
	private JButton btnCancel;
	private JPanel southButtonPanel;
	
	AddStudentForm(String title){
		setTitle(title);
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		addStudentForm = new JLabel("Add Student Form");
		addStudentForm.setFont(new Font("",1,20));
		addStudentForm.setLayout(new BorderLayout());
		addStudentForm.setHorizontalAlignment(JLabel.CENTER);
		add("North",addStudentForm);
		
		btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("",1,20));
		btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("",1,20));
		southButtonPanel = new JPanel();
		southButtonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		southButtonPanel.add("East",btnAdd);
		southButtonPanel.add("West",btnCancel);
		add("South",southButtonPanel);
		//-------------------------------------------
		JLabel lblStudentID = new JLabel("Student ID");
		JLabel lblName = new JLabel("Name");
		JLabel lblPRFMarks = new JLabel("PRF Marks");
		JLabel lblDBMSMarks = new JLabel("DBMS Marks");
		lblStudentID.setFont(new Font("",1,20));
		lblName.setFont(new Font("",1,20));
		lblPRFMarks.setFont(new Font("",1,20));
		lblDBMSMarks.setFont(new Font("",1,20));
		
		JPanel lblPanel = new JPanel();
		lblPanel.setLayout(new GridLayout(4,1));
		lblPanel.add(lblStudentID);
		lblPanel.add(lblName);
		lblPanel.add(lblPRFMarks);
		lblPanel.add(lblDBMSMarks);
		add("West",lblPanel);
		
		JTextField txtID = new JTextField(5);
		txtID.setFont(new Font("",1,20));
		JTextField txtName = new JTextField(10);
		txtName.setFont(new Font("",1,20));
		JTextField txtPRFMarks = new JTextField(4);
		txtPRFMarks.setFont(new Font("",1,20));
		JTextField txtDBSMarks = new JTextField(4);
		txtDBSMarks.setFont(new Font("",1,20));
		txtPanel = new JPanel();
		txtPanel.setLayout(new GridLayout(4,1));
		
		JPanel idTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTextPanel.add(txtID);
		txtPanel.add(idTextPanel);
		
		JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(txtName);
		txtPanel.add(nameTextPanel);
		
		JPanel prfMarksTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		prfMarksTextPanel.add(txtPRFMarks);
		txtPanel.add(prfMarksTextPanel);
		
		JPanel dbmsMarksTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		dbmsMarksTextPanel.add(txtDBSMarks);
		txtPanel.add(dbmsMarksTextPanel);
		add("Center",txtPanel);
		
		
	}
}
class Demo{
	public static void main(String[] args){
		AddStudentForm formOne = new AddStudentForm("Add Student Form");
		formOne.setVisible(true);
	}
}





















