
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main {

	// main
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;

	// insert
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;

	// update
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;

	// title insert
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;

	// title update
	// title update
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;

	// result screen
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;

	private JDialog result = null;

	private String comboselect;

	private Today toDay = null;
	private DayDao dayDao = null;

	// Month, Day DayName
	JLabel lblNewLabel_11 = null;
	JLabel lblNewLabel_12 = null;
	JLabel lblNewLabel_13 = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			main window = new main();
			window.frame.setVisible(true);

			// doLookAndFeel();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void result(String temp, String temp1) {
		result = new JDialog();

		result.setBounds(100, 100, 450, 408);
		result.getContentPane().setLayout(null);
		//화면 중간에
		//result.setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Day");
		label.setBounds(12, 266, 57, 15);
		result.getContentPane().add(label);

		textField_59 = new JTextField();
		textField_59.setEditable(false);
		textField_59.setColumns(10);
		textField_59.setBounds(81, 263, 116, 21);
		result.getContentPane().add(textField_59);

		textField_60 = new JTextField();
		textField_60.setEditable(false);
		textField_60.setColumns(10);
		textField_60.setBounds(81, 232, 116, 21);
		result.getContentPane().add(textField_60);

		JLabel label_1 = new JLabel("Week");
		label_1.setBounds(12, 235, 57, 15);
		result.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Month");
		label_2.setBounds(12, 204, 57, 15);
		result.getContentPane().add(label_2);

		textField_61 = new JTextField();
		textField_61.setEditable(false);
		textField_61.setColumns(10);
		textField_61.setBounds(81, 201, 116, 21);
		result.getContentPane().add(textField_61);

		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		textField_62.setBounds(81, 170, 116, 21);
		result.getContentPane().add(textField_62);

		JLabel label_3 = new JLabel("Year");
		label_3.setBounds(12, 173, 57, 15);
		result.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("\uC124\uBA85");
		label_4.setBounds(12, 142, 57, 15);
		result.getContentPane().add(label_4);

		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setColumns(10);
		textField_63.setBounds(81, 139, 334, 21);
		result.getContentPane().add(textField_63);

		textField_64 = new JTextField();
		textField_64.setEditable(false);
		textField_64.setColumns(10);
		textField_64.setBounds(81, 106, 334, 21);
		result.getContentPane().add(textField_64);

		JLabel label_5 = new JLabel("\uC7A5\uC18C");
		label_5.setBounds(12, 109, 57, 15);
		result.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("\uD560\uC77C");
		label_6.setBounds(12, 78, 57, 15);
		result.getContentPane().add(label_6);

		textField_65 = new JTextField();
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		textField_65.setBounds(81, 75, 334, 21);
		result.getContentPane().add(textField_65);

		textField_66 = new JTextField();
		textField_66.setEditable(false);
		textField_66.setColumns(10);
		textField_66.setBounds(81, 42, 334, 21);
		result.getContentPane().add(textField_66);

		JLabel label_7 = new JLabel(" Title :");
		label_7.setBounds(12, 45, 57, 15);
		result.getContentPane().add(label_7);
		// result.setVisible(true);

		toDay = new Today();
		dayDao = new DayDao();
		if (temp.equals("")) {
			toDay = dayDao.select(temp1);
		} else {
			toDay = dayDao.select(temp, temp1);
		}
		if (dayDao.select(temp, temp1) != null) {
			textField_66.setText(toDay.getTitle());
			textField_65.setText(toDay.getToDo());
			textField_64.setText(toDay.getLocation());
			textField_63.setText(toDay.getDescribed());
			textField_62.setText(toDay.getYear());
			textField_61.setText(toDay.getMonth());
			textField_60.setText(toDay.getWeek());
			textField_59.setText(toDay.getDay());
		}

	}

	// public static void doLookAndFeel(){
	// try {
	// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	// }catch(Exception ee) {}
	// }

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	// update
	public void update(String temp, String temp1) {
		JDialog update = new JDialog();

		toDay = new Today();
		dayDao = new DayDao();
		update.setBounds(100, 100, 450, 408);
		update.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			update.getContentPane().add(lblNewLabel);
		}
		{
			textField_33 = new JTextField();
			textField_33.setBounds(96, 7, 334, 21);
			update.getContentPane().add(textField_33);
			textField_33.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			update.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_34 = new JTextField();
			textField_34.setBounds(96, 40, 334, 21);
			update.getContentPane().add(textField_34);
			textField_34.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			update.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_35 = new JTextField();
			textField_35.setBounds(96, 71, 334, 21);
			update.getContentPane().add(textField_35);
			textField_35.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			update.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_36 = new JTextField();
			textField_36.setBounds(96, 104, 334, 21);
			update.getContentPane().add(textField_36);
			textField_36.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			update.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_37 = new JTextField();
			textField_37.setBounds(96, 135, 116, 21);
			update.getContentPane().add(textField_37);
			textField_37.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			update.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_38 = new JTextField();
			textField_38.setBounds(96, 166, 116, 21);
			update.getContentPane().add(textField_38);
			textField_38.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Week");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			update.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_39 = new JTextField();
			textField_39.setColumns(10);
			textField_39.setBounds(96, 197, 116, 21);
			update.getContentPane().add(textField_39);
		}
		{
			JLabel lblDay = new JLabel("Day");
			lblDay.setBounds(27, 231, 57, 15);
			update.getContentPane().add(lblDay);
		}
		{
			textField_40 = new JTextField();
			textField_40.setColumns(10);
			textField_40.setBounds(96, 228, 116, 21);
			update.getContentPane().add(textField_40);
		}
		{
			JButton btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					toDay = new Today();
					dayDao = new DayDao();

					toDay = dayDao.select(temp, temp1);
					// textField_33.setText(toDay.getTitle());
					// textField_34.setText(toDay.getToDo());
					// textField_35.setText(toDay.getLocation());
					// textField_36.setText(toDay.getDescribed());
					// textField_37.setText(toDay.getWeek());
					// textField_38.setText(toDay.getYear());
					// textField_39.setText(toDay.getMonth());
					// textField_40.setText(toDay.getDay());
					// textField_41.setText(toDay.getHours());
					// textField_33.setText(toDay.getTitle());
					// textField_34.setText(toDay.getToDo());
					// textField_35.setText(toDay.getLocation());
					// textField_36.setText(toDay.getDescribed());
					// textField_37.setText(toDay.getYear());
					// textField_38.setText(toDay.getMonth());
					// textField_39.setText(toDay.getWeek());
					// textField_40.setText(toDay.getDay());
					// textField_41.setText(toDay.getHours());
					//

					// System.out.println(comboselect);
					toDay.setTitle(textField_33.getText());
					toDay.setToDo(textField_34.getText());
					toDay.setLocation(textField_35.getText());
					toDay.setDescribed(textField_36.getText());
					toDay.setYear(textField_37.getText());
					toDay.setMonth(textField_38.getText());
					toDay.setWeek(textField_39.getText());
					toDay.setDay(textField_40.getText());
					toDay.setHours(textField_41.getText());
					toDay.setEither(comboselect);
					// toDay.setCount(toDay.getCount());
					// System.out.println(comboModel);
					// today.setEither((String)comboBox.;
					// System.out.println(today.getCount());
					// dialog.setVisible(false);
					// dialog.dispose();
					dayDao.update(toDay);

					// 갱신
					select();

					update.setVisible(false);
					update.dispose();
				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			update.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					toDay = new Today();
					dayDao = new DayDao();

					toDay = dayDao.select(temp, temp1);
					String temp = Integer.toString(toDay.getCount());
					dayDao.delete(temp);

					// reload
					select();

					update.setVisible(false);
					update.dispose();
				}
			});
			btnNewButton_1.setBounds(287, 322, 99, 25);
			update.getContentPane().add(btnNewButton_1);
		}

		JLabel lblNewLabel_7 = new JLabel("Hour");
		lblNewLabel_7.setBounds(27, 262, 57, 15);
		update.getContentPane().add(lblNewLabel_7);

		textField_41 = new JTextField();
		textField_41.setBounds(96, 259, 116, 21);
		update.getContentPane().add(textField_41);
		textField_41.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Am/Pm");
		lblNewLabel_8.setBounds(27, 287, 57, 15);
		update.getContentPane().add(lblNewLabel_8);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "am", "pm" }));
		comboBox.setBounds(96, 290, 116, 23);
		update.getContentPane().add(comboBox);
		if (temp1.equals("am")) {
			comboBox.setSelectedIndex(0);
		} else {
			comboBox.setSelectedIndex(1);
		}
		// comboBox.setSelectedIndex(0);
		comboBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JComboBox jcmbType = (JComboBox) e.getSource();
				String cmbType = (String) jcmbType.getSelectedItem();
				// System.out.println(cmbType);
				comboselect = cmbType;
			}
		});
		update.setVisible(true);
		// comboselect = comboBox.getSelectedIndex();
		toDay = dayDao.select(temp, temp1);
		if (dayDao.select(temp, temp1) != null) {
			textField_33.setText(toDay.getTitle());
			textField_34.setText(toDay.getToDo());
			textField_35.setText(toDay.getLocation());
			textField_36.setText(toDay.getDescribed());
			textField_37.setText(toDay.getYear());
			textField_38.setText(toDay.getMonth());
			textField_39.setText(toDay.getWeek());
			textField_40.setText(toDay.getDay());
			textField_41.setText(toDay.getHours());
			// textField_40.setText(t);
		}

	}

	// insert
	public void insert(String temp, String temp1) {
		JDialog insert = new JDialog();
		toDay = new Today();
		dayDao = new DayDao();

		if (dayDao.select(temp, temp1) != null) {
			// insert(temp, temp1);
			// insert.setVisible(false);
			// insert.dispose();
			// System.exit(0);
			// dialog.exit(0);
			update(temp, temp1);
			System.out.println("close dialog");
		} else {
			insert.setVisible(true);
		}
		insert.setBounds(100, 100, 450, 408);
		insert.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			insert.getContentPane().add(lblNewLabel);
		}
		{
			textField_25 = new JTextField();
			textField_25.setBounds(96, 7, 334, 21);
			insert.getContentPane().add(textField_25);
			textField_25.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			insert.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_26 = new JTextField();
			textField_26.setBounds(96, 40, 334, 21);
			insert.getContentPane().add(textField_26);
			textField_26.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			insert.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_27 = new JTextField();
			textField_27.setBounds(96, 71, 334, 21);
			insert.getContentPane().add(textField_27);
			textField_27.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			insert.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_28 = new JTextField();
			textField_28.setBounds(96, 104, 334, 21);
			insert.getContentPane().add(textField_28);
			textField_28.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			insert.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_29 = new JTextField();
			textField_29.setBounds(96, 135, 116, 21);
			insert.getContentPane().add(textField_29);
			textField_29.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			insert.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_30 = new JTextField();
			textField_30.setBounds(96, 166, 116, 21);
			insert.getContentPane().add(textField_30);
			textField_30.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Day");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			insert.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_31 = new JTextField();
			textField_31.setColumns(10);
			textField_31.setBounds(96, 197, 116, 21);
			insert.getContentPane().add(textField_31);
		}
		{
			JLabel lblDay = new JLabel("Week");
			lblDay.setBounds(27, 231, 57, 15);
			insert.getContentPane().add(lblDay);
		}
		{
			textField_32 = new JTextField();
			textField_32.setColumns(10);
			textField_32.setBounds(96, 228, 116, 21);
			insert.getContentPane().add(textField_32);
		}
		{
			JButton btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					toDay = new Today();
					dayDao = new DayDao();

					System.out.println("test");
					System.out.println(textField_25.getText());
					toDay.setTitle(textField_25.getText());
					toDay.setToDo(textField_26.getText());
					toDay.setLocation(textField_27.getText());
					toDay.setDescribed(textField_28.getText());
					toDay.setYear(textField_29.getText());
					toDay.setMonth(textField_30.getText());
					toDay.setDay(textField_31.getText());
					toDay.setWeek(textField_32.getText());
					toDay.setHours(temp);
					toDay.setEither(temp1);
					dayDao.insert(toDay);
					// today = daydao.selectToday();
					// today = daydao.insert(today);
					// insert close
					select();
					insert.setVisible(false);
					insert.dispose();
				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			insert.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					insert.setVisible(false);
					insert.dispose();
					// dialog.EXIT_ON_CLOSE;
				}
			});

			btnNewButton_1.setBounds(287, 322, 99, 25);
			insert.getContentPane().add(btnNewButton_1);
		}

		toDay = dayDao.select(temp, temp1);
		if (dayDao.select(temp, temp1) != null) {
			textField_25.setText(toDay.getTitle());
			textField_26.setText(toDay.getToDo());
			textField_27.setText(toDay.getLocation());
			textField_28.setText(toDay.getDescribed());
			textField_29.setText(toDay.getYear());
			textField_30.setText(toDay.getWeek());
		}

	}

	// yiss92 Title update
	public void InsertTitleupdate(String temp, String temp1) {
		JDialog dialog = new JDialog();
		System.out.println("update");
		// yiss92 ComboBox mode to String;

		dialog.setBounds(100, 100, 450, 408);
		dialog.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			dialog.getContentPane().add(lblNewLabel);
		}
		{
			textField_50 = new JTextField();
			textField_50.setBounds(96, 7, 334, 21);
			dialog.getContentPane().add(textField_50);
			textField_50.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			dialog.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_51 = new JTextField();
			textField_51.setBounds(96, 40, 334, 21);
			dialog.getContentPane().add(textField_51);
			textField_51.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			dialog.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_52 = new JTextField();
			textField_52.setBounds(96, 71, 334, 21);
			dialog.getContentPane().add(textField_52);
			textField_52.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			dialog.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_53 = new JTextField();
			textField_53.setBounds(96, 104, 334, 21);
			dialog.getContentPane().add(textField_53);
			textField_53.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			dialog.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_54 = new JTextField();
			textField_54.setBounds(96, 135, 116, 21);
			dialog.getContentPane().add(textField_54);
			textField_54.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			dialog.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_55 = new JTextField();
			textField_55.setBounds(96, 166, 116, 21);
			dialog.getContentPane().add(textField_55);
			textField_55.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Week");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			dialog.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_56 = new JTextField();
			textField_56.setColumns(10);
			textField_56.setBounds(96, 197, 116, 21);
			dialog.getContentPane().add(textField_56);
		}
		{
			JLabel lblDay = new JLabel("Day");
			lblDay.setBounds(27, 231, 57, 15);
			dialog.getContentPane().add(lblDay);
		}
		{
			textField_57 = new JTextField();
			textField_57.setColumns(10);
			textField_57.setBounds(96, 228, 116, 21);
			dialog.getContentPane().add(textField_57);
		}
		{
			JButton btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					toDay = new Today();
					dayDao = new DayDao();
					// System.out.println("update");
					toDay = dayDao.select(temp1);

					// textField_50.setText(toDay.getTitle());
					// textField_51.setText(toDay.getToDo());
					// textField_52.setText(toDay.getLocation());
					// textField_53.setText(toDay.getDescribed());
					// textField_54.setText(toDay.getYear());
					// textField_55.setText(toDay.getMonth());
					// textField_56.setText(toDay.getWeek());
					// textField_57.setText(toDay.getDay());

					toDay.setTitle(textField_50.getText());
					toDay.setToDo(textField_51.getText());
					toDay.setLocation(textField_52.getText());
					toDay.setDescribed(textField_53.getText());
					toDay.setYear(textField_54.getText());
					toDay.setMonth(textField_55.getText());
					toDay.setWeek(textField_56.getText());
					toDay.setDay(textField_57.getText());
					// today.setHours(textField_58.getText());
					// today.setEither(comboModel);
					// System.out.println(comboModel);
					// today.setEither((String)comboBox.;
					// System.out.println(today.getCount());
					// dialog.setVisible(false);
					// dialog.dispose();
					dayDao.updateTitle(toDay);

					// reload
					select();

					dialog.setVisible(false);
					dialog.dispose();
				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					toDay = dayDao.select(temp1);
					String intoString = Integer.toString(toDay.getCount());
					dayDao.delete(intoString);

					// reload
					select();

					dialog.setVisible(false);
					dialog.dispose();
				}
			});
			btnNewButton_1.setBounds(287, 322, 99, 25);
			dialog.getContentPane().add(btnNewButton_1);
		}

		// JLabel lblNewLabel_7 = new JLabel("Hour");
		// lblNewLabel_7.setBounds(27, 262, 57, 15);
		// dialog.getContentPane().add(lblNewLabel_7);
		//
		// textField_58 = new JTextField();
		// textField_58.setBounds(96, 259, 116, 21);
		// dialog.getContentPane().add(textField_58);
		// textField_58.setColumns(10);

		toDay = dayDao.select(temp1);
		textField_50.setText(toDay.getTitle());
		textField_51.setText(toDay.getToDo());
		textField_52.setText(toDay.getLocation());
		textField_53.setText(toDay.getDescribed());
		textField_54.setText(toDay.getYear());
		textField_55.setText(toDay.getMonth());
		textField_56.setText(toDay.getWeek());
		textField_57.setText(toDay.getDay());
		// textField_58.setText(today.getHours());
		// comboBox.s;
		// textField_42.
		dialog.setVisible(true);
	}

	// yiss92 Title Insert
	public void insertTitle(String temp, String temp1) {
		JDialog InsertTitle = new JDialog();

		toDay = new Today();
		dayDao = new DayDao();

		if (dayDao.select(temp1) != null) {
			// insert(temp, temp1);
			// insert.setVisible(false);
			// insert.dispose();
			// System.exit(0);
			// dialog.exit(0);
			InsertTitleupdate(temp, temp1);
			System.out.println("close dialog");
		} else {
			InsertTitle.setVisible(true);
		}

		InsertTitle.setBounds(100, 100, 450, 408);
		InsertTitle.getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(" Title :");
			lblNewLabel.setBounds(27, 10, 57, 15);
			InsertTitle.getContentPane().add(lblNewLabel);
		}
		{
			textField_42 = new JTextField();
			textField_42.setBounds(96, 7, 334, 21);
			InsertTitle.getContentPane().add(textField_42);
			textField_42.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD560\uC77C");
			lblNewLabel_1.setBounds(27, 43, 57, 15);
			InsertTitle.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_43 = new JTextField();
			textField_43.setBounds(96, 40, 334, 21);
			InsertTitle.getContentPane().add(textField_43);
			textField_43.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_2.setBounds(27, 74, 57, 15);
			InsertTitle.getContentPane().add(lblNewLabel_2);
		}
		{
			textField_44 = new JTextField();
			textField_44.setBounds(96, 71, 334, 21);
			InsertTitle.getContentPane().add(textField_44);
			textField_44.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\uC124\uBA85");
			lblNewLabel_3.setBounds(27, 107, 57, 15);
			InsertTitle.getContentPane().add(lblNewLabel_3);
		}
		{
			textField_45 = new JTextField();
			textField_45.setBounds(96, 104, 334, 21);
			InsertTitle.getContentPane().add(textField_45);
			textField_45.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(27, 138, 57, 15);
			InsertTitle.getContentPane().add(lblNewLabel_4);
		}
		{
			textField_46 = new JTextField();
			textField_46.setBounds(96, 135, 116, 21);
			InsertTitle.getContentPane().add(textField_46);
			textField_46.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(27, 169, 57, 15);
			InsertTitle.getContentPane().add(lblNewLabel_5);
		}
		{
			textField_47 = new JTextField();
			textField_47.setBounds(96, 166, 116, 21);
			InsertTitle.getContentPane().add(textField_47);
			textField_47.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Day");
			lblNewLabel_6.setBounds(27, 200, 57, 15);
			InsertTitle.getContentPane().add(lblNewLabel_6);
		}
		{
			textField_48 = new JTextField();
			textField_48.setColumns(10);
			textField_48.setBounds(96, 197, 116, 21);
			InsertTitle.getContentPane().add(textField_48);
		}
		{
			JLabel lblDay = new JLabel("Week");
			lblDay.setBounds(27, 231, 57, 15);
			InsertTitle.getContentPane().add(lblDay);
		}
		{
			textField_49 = new JTextField();
			textField_49.setColumns(10);
			textField_49.setBounds(96, 228, 116, 21);
			InsertTitle.getContentPane().add(textField_49);
		}
		{
			JButton btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					toDay = new Today();
					dayDao = new DayDao();

					System.out.println("test");
					System.out.println(textField_42.getText());
					toDay.setTitle(textField_42.getText());
					toDay.setToDo(textField_43.getText());
					toDay.setLocation(textField_44.getText());
					toDay.setDescribed(textField_45.getText());
					toDay.setYear(textField_46.getText());
					toDay.setMonth(textField_47.getText());
					toDay.setDay(textField_48.getText());
					toDay.setWeek(textField_49.getText());
					// toDay.setHours(temp);
					toDay.setEither(temp1);
					dayDao.insert(toDay);
					// today = daydao.selectToday();
					// today = daydao.insert(today);
					// insert close
					select();
					InsertTitle.setVisible(false);
					InsertTitle.dispose();

				}
			});
			btnNewButton.setBounds(78, 322, 99, 25);
			InsertTitle.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
			btnNewButton_1.setBounds(287, 322, 99, 25);
			InsertTitle.getContentPane().add(btnNewButton_1);
		}
		toDay = dayDao.select(temp, temp1);
		if (dayDao.select(temp, temp1) != null) {
			textField_42.setText(toDay.getTitle());
			textField_43.setText(toDay.getToDo());
			textField_44.setText(toDay.getLocation());
			textField_45.setText(toDay.getDescribed());
			textField_46.setText(toDay.getYear());
			textField_47.setText(toDay.getMonth());
			textField_48.setText(toDay.getWeek());
			textField_49.setText(toDay.getDay());

		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "";
				String temp1 = "ti";
				insertTitle(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "";
				String temp1 = "ti";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "";
				String temp1 = "ti";
				if (dayDao.select(temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(75, 60, 643, 21);
		frame.getContentPane().add(textField);

		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// toDay = new Today();
				// dayDao = new DayDao();

				String temp = "12";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				String temp = "12";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				String temp = "12";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(75, 91, 643, 21);
		frame.getContentPane().add(textField_1);

		JLabel label = new JLabel("\uC624\uC804 12\uC2DC");
		label.setBounds(8, 94, 57, 15);
		frame.getContentPane().add(label);

		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String temp = "01";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				String temp = "01";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "01";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(75, 122, 643, 21);
		frame.getContentPane().add(textField_2);

		JLabel label_1 = new JLabel("\uC624\uC804 01\uC2DC");
		label_1.setBounds(8, 125, 57, 15);
		frame.getContentPane().add(label_1);

		textField_3 = new JTextField();
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "02";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "02";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "02";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(75, 153, 643, 21);
		frame.getContentPane().add(textField_3);

		JLabel label_2 = new JLabel("\uC624\uC804 02\uC2DC");
		label_2.setBounds(8, 156, 57, 15);
		frame.getContentPane().add(label_2);

		textField_4 = new JTextField();
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "03";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "03";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "03";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(75, 184, 643, 21);
		frame.getContentPane().add(textField_4);

		JLabel label_3 = new JLabel("\uC624\uC804 03\uC2DC");
		label_3.setBounds(8, 187, 57, 15);
		frame.getContentPane().add(label_3);

		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "04";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "04";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "04";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(75, 215, 643, 21);
		frame.getContentPane().add(textField_5);

		JLabel label_4 = new JLabel("\uC624\uC804 04\uC2DC");
		label_4.setBounds(8, 218, 57, 15);
		frame.getContentPane().add(label_4);

		textField_6 = new JTextField();
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "05";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "05";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "05";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(75, 246, 643, 21);
		frame.getContentPane().add(textField_6);

		JLabel label_5 = new JLabel("\uC624\uC804 05\uC2DC");
		label_5.setBounds(8, 249, 57, 15);
		frame.getContentPane().add(label_5);

		textField_7 = new JTextField();
		textField_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "06";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "06";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "06";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(75, 277, 643, 21);
		frame.getContentPane().add(textField_7);

		JLabel label_6 = new JLabel("\uC624\uC804 06\uC2DC");
		label_6.setBounds(8, 280, 57, 15);
		frame.getContentPane().add(label_6);

		textField_8 = new JTextField();
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "07";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "07";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "07";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(75, 308, 643, 21);
		frame.getContentPane().add(textField_8);

		JLabel label_7 = new JLabel("\uC624\uC804 07\uC2DC");
		label_7.setBounds(8, 311, 57, 15);
		frame.getContentPane().add(label_7);

		textField_9 = new JTextField();
		textField_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "08";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "08";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "08";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(75, 339, 643, 21);
		frame.getContentPane().add(textField_9);

		JLabel label_8 = new JLabel("\uC624\uC804 08\uC2DC");
		label_8.setBounds(8, 342, 57, 15);
		frame.getContentPane().add(label_8);

		textField_10 = new JTextField();
		textField_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "09";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "09";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "09";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(75, 370, 643, 21);
		frame.getContentPane().add(textField_10);

		JLabel label_9 = new JLabel("\uC624\uC804 09\uC2DC");
		label_9.setBounds(8, 373, 57, 15);
		frame.getContentPane().add(label_9);

		textField_11 = new JTextField();
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "10";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "10";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}

			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "10";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(75, 401, 643, 21);
		frame.getContentPane().add(textField_11);

		JLabel label_10 = new JLabel("\uC624\uC804 10\uC2DC");
		label_10.setBounds(8, 404, 57, 15);
		frame.getContentPane().add(label_10);

		textField_12 = new JTextField();
		textField_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "11";
				String temp1 = "am";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "11";
				String temp1 = "am";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "11";
				String temp1 = "am";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(75, 432, 643, 21);
		frame.getContentPane().add(textField_12);

		JLabel label_11 = new JLabel("\uC624\uC804 11\uC2DC");
		label_11.setBounds(8, 435, 57, 15);
		frame.getContentPane().add(label_11);

		textField_13 = new JTextField();
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "12";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "12";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "12";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(75, 463, 643, 21);
		frame.getContentPane().add(textField_13);

		JLabel label_12 = new JLabel("\uC624\uD6C4 12\uC2DC");
		label_12.setBounds(8, 466, 57, 15);
		frame.getContentPane().add(label_12);

		textField_14 = new JTextField();
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "01";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "01";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "01";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(75, 491, 643, 21);
		frame.getContentPane().add(textField_14);

		JLabel label_13 = new JLabel("\uC624\uD6C4 01\uC2DC");
		label_13.setBounds(8, 494, 57, 15);
		frame.getContentPane().add(label_13);

		textField_15 = new JTextField();
		textField_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "02";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "02";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "02";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(75, 522, 643, 21);
		frame.getContentPane().add(textField_15);

		JLabel label_14 = new JLabel("\uC624\uD6C4 02\uC2DC");
		label_14.setBounds(8, 525, 57, 15);
		frame.getContentPane().add(label_14);

		textField_16 = new JTextField();
		textField_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "03";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "03";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "03";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(75, 553, 643, 21);
		frame.getContentPane().add(textField_16);

		JLabel label_15 = new JLabel("\uC624\uD6C4 03\uC2DC");
		label_15.setBounds(8, 556, 57, 15);
		frame.getContentPane().add(label_15);

		textField_17 = new JTextField();
		textField_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "04";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "04";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "04";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(75, 584, 643, 21);
		frame.getContentPane().add(textField_17);

		JLabel label_16 = new JLabel("\uC624\uD6C4 04\uC2DC");
		label_16.setBounds(8, 587, 57, 15);
		frame.getContentPane().add(label_16);

		textField_18 = new JTextField();
		textField_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "05";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "05";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}

			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "05";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(75, 615, 643, 21);
		frame.getContentPane().add(textField_18);

		JLabel label_17 = new JLabel("\uC624\uD6C4 05\uC2DC");
		label_17.setBounds(8, 618, 57, 15);
		frame.getContentPane().add(label_17);

		textField_19 = new JTextField();
		textField_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "06";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "06";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}

			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "06";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(75, 646, 643, 21);
		frame.getContentPane().add(textField_19);

		JLabel label_18 = new JLabel("\uC624\uD6C4 06\uC2DC");
		label_18.setBounds(8, 649, 57, 15);
		frame.getContentPane().add(label_18);

		textField_20 = new JTextField();
		textField_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "07";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "07";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "07";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(75, 677, 643, 21);
		frame.getContentPane().add(textField_20);

		JLabel label_19 = new JLabel("\uC624\uD6C4 07\uC2DC");
		label_19.setBounds(8, 680, 57, 15);
		frame.getContentPane().add(label_19);

		textField_21 = new JTextField();
		textField_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "08";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "08";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "08";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(75, 708, 643, 21);
		frame.getContentPane().add(textField_21);

		JLabel label_20 = new JLabel("\uC624\uD6C4 08\uC2DC");
		label_20.setBounds(8, 711, 57, 15);
		frame.getContentPane().add(label_20);

		textField_22 = new JTextField();
		textField_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "09";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "09";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "09";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(75, 739, 643, 21);
		frame.getContentPane().add(textField_22);

		JLabel label_21 = new JLabel("\uC624\uD6C4 09\uC2DC");
		label_21.setBounds(8, 742, 57, 15);
		frame.getContentPane().add(label_21);

		textField_23 = new JTextField();
		textField_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "10";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "10";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}

			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "10";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(75, 770, 643, 21);
		frame.getContentPane().add(textField_23);

		JLabel label_22 = new JLabel("\uC624\uD6C4 10\uC2DC");
		label_22.setBounds(8, 773, 57, 15);
		frame.getContentPane().add(label_22);

		textField_24 = new JTextField();
		textField_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String temp = "11";
				String temp1 = "pm";
				insert(temp, temp1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String temp = "11";
				String temp1 = "pm";
				toDay = new Today();
				dayDao = new DayDao();
				toDay = dayDao.select(temp, temp1);
				if (dayDao.select(temp, temp1) != null) {
					result(temp, temp1);
					result.setVisible(true);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String temp = "11";
				String temp1 = "pm";
				if (dayDao.select(temp, temp1) != null) {
					result.setVisible(false);
					result.dispose();
				}
			}
		});
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(75, 801, 643, 21);
		frame.getContentPane().add(textField_24);

		JLabel label_23 = new JLabel("\uC624\uD6C4 11\uC2DC");
		label_23.setBounds(8, 804, 57, 15);
		frame.getContentPane().add(label_23);

		JLabel lblNewLabel_9 = new JLabel("\uC6D4");
		lblNewLabel_9.setBounds(254, 32, 57, 15);
		frame.getContentPane().add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("\uC77C");
		lblNewLabel_10.setBounds(356, 32, 57, 15);
		frame.getContentPane().add(lblNewLabel_10);

		JButton btnNewButton_2 = new JButton("\uC77C");
		btnNewButton_2.setBounds(479, 27, 72, 25);
		frame.getContentPane().add(btnNewButton_2);

		JButton button = new JButton("\uC8FC");
		button.setBounds(563, 27, 72, 25);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("\uC6D4");
		button_1.setBounds(646, 27, 72, 25);
		frame.getContentPane().add(button_1);

		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(219, 32, 23, 15);
		frame.getContentPane().add(lblNewLabel_11);
		// month
		// dayDao = new DayDao();
		// dayDao.selectyear();
		// String temp = dayDao.selectyear();
		// System.out.println(dayDao.selectyear());

		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(314, 32, 32, 15);
		frame.getContentPane().add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(399, 32, 57, 15);
		frame.getContentPane().add(lblNewLabel_13);

		frame.setLocationRelativeTo(null);

		// 갱신
		select();
	}

	public void select() {
		toDay = new Today();
		DayDao dayDao = new DayDao();

		lblNewLabel_11.setText(dayDao.selectMonth());
		lblNewLabel_12.setText(dayDao.selectDay());
		lblNewLabel_13.setText(dayDao.selectDayName());

		toDay = dayDao.select("ti");
		if (dayDao.select("ti") != null) {
			textField.setText(toDay.getTitle());
		} else {
			textField.setText("");
		}

		toDay = dayDao.select("12", "am");
		if (dayDao.select("12", "am") != null) {
			textField_1.setText(toDay.getTitle());
		} else {
			textField_1.setText("");
		}

		toDay = dayDao.select("01", "am");
		if (dayDao.select("01", "am") != null) {
			textField_2.setText(toDay.getTitle());
		} else {
			textField_2.setText("");
		}

		toDay = dayDao.select("02", "am");
		if (dayDao.select("02", "am") != null) {
			textField_3.setText(toDay.getTitle());
		} else {
			textField_3.setText("");
		}

		toDay = dayDao.select("03", "am");
		if (dayDao.select("03", "am") != null) {
			textField_4.setText(toDay.getTitle());
		} else {
			textField_4.setText("");
		}

		toDay = dayDao.select("04", "am");
		if (dayDao.select("04", "am") != null) {
			textField_5.setText(toDay.getTitle());
		} else {
			textField_5.setText("");
		}

		toDay = dayDao.select("05", "am");
		if (dayDao.select("05", "am") != null) {
			textField_6.setText(toDay.getTitle());
		} else {
			textField_6.setText("");
		}

		toDay = dayDao.select("06", "am");
		if (dayDao.select("06", "am") != null) {
			textField_7.setText(toDay.getTitle());
		} else {
			textField_7.setText("");
		}

		toDay = dayDao.select("07", "am");
		if (dayDao.select("07", "am") != null) {
			textField_8.setText(toDay.getTitle());
		} else {
			textField_8.setText("");
		}

		toDay = dayDao.select("08", "am");
		if (dayDao.select("08", "am") != null) {
			textField_9.setText(toDay.getTitle());
		} else {
			textField_9.setText("");
		}

		toDay = dayDao.select("09", "am");
		if (dayDao.select("09", "am") != null) {
			textField_10.setText(toDay.getTitle());
		} else {
			textField_10.setText("");
		}

		toDay = dayDao.select("10", "am");
		if (dayDao.select("10", "am") != null) {
			textField_11.setText(toDay.getTitle());
		} else {
			textField_11.setText("");
		}

		toDay = dayDao.select("11", "am");
		if (dayDao.select("11", "am") != null) {
			textField_12.setText(toDay.getTitle());
		} else {
			textField_12.setText("");
		}

		toDay = dayDao.select("12", "pm");
		if (dayDao.select("12", "pm") != null) {
			textField_13.setText(toDay.getTitle());
		} else {
			textField_13.setText("");
		}

		toDay = dayDao.select("01", "pm");
		if (dayDao.select("01", "pm") != null) {
			textField_14.setText(toDay.getTitle());
		} else {
			textField_14.setText("");
		}

		toDay = dayDao.select("02", "pm");
		if (dayDao.select("02", "pm") != null) {
			textField_15.setText(toDay.getTitle());
		} else {
			textField_15.setText("");
		}

		toDay = dayDao.select("03", "pm");
		if (dayDao.select("03", "pm") != null) {
			textField_16.setText(toDay.getTitle());
		} else {
			textField_16.setText("");
		}

		toDay = dayDao.select("04", "pm");
		if (dayDao.select("04", "pm") != null) {
			textField_17.setText(toDay.getTitle());
		} else {
			textField_17.setText("");
		}

		toDay = dayDao.select("05", "pm");
		if (dayDao.select("05", "pm") != null) {
			textField_18.setText(toDay.getTitle());
		} else {
			textField_18.setText("");
		}

		toDay = dayDao.select("06", "pm");
		if (dayDao.select("06", "pm") != null) {
			textField_19.setText(toDay.getTitle());
		} else {
			textField_19.setText("");
		}

		toDay = dayDao.select("07", "pm");
		if (dayDao.select("07", "pm") != null) {
			textField_20.setText(toDay.getTitle());
		} else {
			textField_20.setText("");
		}

		toDay = dayDao.select("08", "pm");
		if (dayDao.select("08", "pm") != null) {
			textField_21.setText(toDay.getTitle());
		} else {
			textField_21.setText("");
		}

		toDay = dayDao.select("09", "pm");
		if (dayDao.select("09", "pm") != null) {
			textField_22.setText(toDay.getTitle());
		} else {
			textField_22.setText("");
		}

		toDay = dayDao.select("10", "pm");
		if (dayDao.select("10", "pm") != null) {
			textField_23.setText(toDay.getTitle());
		} else {
			textField_23.setText("");
		}

		toDay = dayDao.select("11", "pm");
		if (dayDao.select("11", "pm") != null) {
			textField_24.setText(toDay.getTitle());
		} else {
			textField_24.setText("");
		}
	}
}
