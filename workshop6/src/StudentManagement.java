import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class StudentManagement {

	protected Shell shell;
	private Text studentIDField;
	private Text firstNameField;
	private Text lastNameField;
	private Text courseNameField;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Student student = new Student();
	
	public static void main(String[] args) {
		try {
			StudentManagement window = new StudentManagement();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected void createContents() {
		shell = new Shell();
		shell.setSize(556, 349);
		shell.setText("Student Management System");
		
		Label studentInfoLabel = new Label(shell, SWT.NONE);
		studentInfoLabel.setText("Enter Student Information");
		studentInfoLabel.setBounds(10, 10, 165, 14);
		
		Label studentIDLabel = new Label(shell, SWT.NONE);
		studentIDLabel.setBounds(10, 33, 69, 14);
		studentIDLabel.setText("Student ID");
		
		studentIDField = new Text(shell, SWT.BORDER);
		studentIDField.setBounds(85, 30, 100, 25);
		
		Label lblFirstName = new Label(shell, SWT.NONE);
		lblFirstName.setBounds(10, 61, 69, 14);
		lblFirstName.setText("First Name");
		
		firstNameField = new Text(shell, SWT.BORDER);
		firstNameField.setBounds(85, 58, 100, 25);
		
		Label lblLastName = new Label(shell, SWT.NONE);
		lblLastName.setBounds(10, 89, 69, 14);
		lblLastName.setText("Last Name");
		
		lastNameField = new Text(shell, SWT.BORDER);
		lastNameField.setBounds(85, 86, 100, 25);
		
		Label lblCourses = new Label(shell, SWT.NONE);
		lblCourses.setBounds(10, 174, 165, 14);
		lblCourses.setText("Enter Course Information");
		
		Label lblCourseName = new Label(shell, SWT.NONE);
		lblCourseName.setBounds(10, 194, 91, 14);
		lblCourseName.setText("Course Name");
		
		courseNameField = new Text(shell, SWT.BORDER);
		courseNameField.setBounds(97, 191, 90, 25);
		
		Button btnAddCourse = new Button(shell, SWT.NONE);
		btnAddCourse.setBounds(20, 222, 165, 36);
		btnAddCourse.setText("Add Course");
		
		TextViewer textViewer = new TextViewer(shell, SWT.BORDER);
		StyledText studentDataView = textViewer.getTextWidget();
		studentDataView.setBounds(297, 33, 210, 175);
		
		Button btnLoadStudentInformation = new Button(shell, SWT.NONE);
		btnLoadStudentInformation.setBounds(297, 220, 210, 40);
		formToolkit.adapt(btnLoadStudentInformation, true, true);
		btnLoadStudentInformation.setText("Load Student Information");
		
		Button btnAddStudent = new Button(shell, SWT.NONE);
		btnAddStudent.setBounds(20, 117, 165, 40);
		btnAddStudent.setText("Add Student");
		
		Button btnSave = new Button(shell, SWT.NONE);
		btnSave.setBounds(20, 264, 165, 36);
		btnSave.setText("Save");
		
		Label lblSavedStudentInformation_1 = new Label(shell, SWT.NONE);
		lblSavedStudentInformation_1.setText("Saved Student Information");
		lblSavedStudentInformation_1.setBounds(297, 10, 165, 14);
		formToolkit.adapt(lblSavedStudentInformation_1, true, true);
		
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				student.SaveToFile("student-data.txt");
				String content = "";
				content += "Student ID: " + student.getID() + "\n";
				content += "First Name: " + student.getFirstName() + "\n";
				content += "Last Name: " + student.getLastName() + "\n";
				content += "Courses \n";
				for(String course : student.getCourses()) {
					content += "Course Name: " + course + "\n";
				}
				studentDataView.setText(content);
			}
		});
		
		btnLoadStudentInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				student.ReadFromFile("student-data.txt");
				String content = "";
				content += "Student ID: " + student.getID() + "\n";
				content += "First Name: " + student.getFirstName() + "\n";
				content += "Last Name: " + student.getLastName() + "\n";
				content += "Courses \n";
				for(String course : student.getCourses()) {
					content += "Course Name: " + course + "\n";
				}
				studentDataView.setText(content);
			}
		});
		
		btnAddCourse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String courseName = courseNameField.getText();
				student.addCourse(courseName);
				courseNameField.setText("");
			}
		});
		
		btnAddStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				int studentID = Integer.parseInt(studentIDField.getText());
				String firstName = firstNameField.getText();
				String lastName = lastNameField.getText();
				student.setID(studentID);
				student.setFirstName(firstName);
				student.setLastName(lastName);
				studentIDField.setText("");
				firstNameField.setText("");
				lastNameField.setText("");
			}
		});
	}
}
