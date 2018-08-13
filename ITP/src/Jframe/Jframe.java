package Jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import UI.components.Kbutton;
import UI.components.Klabel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JSeparator;

public class Jframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Kbutton btnNewButton = new Kbutton("New button");
		btnNewButton.setBounds(376, 295, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(347, 153, 46, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBounds(185, 270, 28, 22);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(222, 164, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(198, 229, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		table = new JTable();
		table.setBounds(424, 358, -240, 23);
		contentPane.add(table);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 341, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(222, 128, -104, -11);
		contentPane.add(separator);
		
		
		
		
		
		
		
		
	}
}
