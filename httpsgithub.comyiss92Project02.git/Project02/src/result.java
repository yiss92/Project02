import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class result extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			result dialog = new result();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public result() {
		setBounds(100, 100, 450, 408);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Day");
		label.setBounds(12, 266, 57, 15);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(81, 263, 116, 21);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(81, 232, 116, 21);
		getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("Week");
		label_1.setBounds(12, 235, 57, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Month");
		label_2.setBounds(12, 204, 57, 15);
		getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(81, 201, 116, 21);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(81, 170, 116, 21);
		getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("Year");
		label_3.setBounds(12, 173, 57, 15);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\uC124\uBA85");
		label_4.setBounds(12, 142, 57, 15);
		getContentPane().add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(81, 139, 334, 21);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(81, 106, 334, 21);
		getContentPane().add(textField_5);
		
		JLabel label_5 = new JLabel("\uC7A5\uC18C");
		label_5.setBounds(12, 109, 57, 15);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\uD560\uC77C");
		label_6.setBounds(12, 78, 57, 15);
		getContentPane().add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(81, 75, 334, 21);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(81, 42, 334, 21);
		getContentPane().add(textField_7);
		
		JLabel label_7 = new JLabel(" Title :");
		label_7.setBounds(12, 45, 57, 15);
		getContentPane().add(label_7);
	}
}
