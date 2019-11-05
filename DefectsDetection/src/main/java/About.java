import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public About() {
		setTitle("About");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Authors:");
		lblNewLabel.setBounds(32, 41, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblVersion = new JLabel("Version:");
		lblVersion.setBounds(32, 130, 61, 16);
		contentPane.add(lblVersion);
		
		JLabel lblReleaseDate = new JLabel("Release Date:");
		lblReleaseDate.setBounds(32, 86, 96, 16);
		contentPane.add(lblReleaseDate);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			
			//closing about window
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(327, 243, 117, 29);
		contentPane.add(btnOk);
		
		JLabel lblSomeRandomPeople = new JLabel("Some random people");
		lblSomeRandomPeople.setBounds(100, 41, 139, 16);
		contentPane.add(lblSomeRandomPeople);
		
		JLabel lblTbd = new JLabel("13 December 2019");
		lblTbd.setBounds(124, 86, 127, 16);
		contentPane.add(lblTbd);
		
		JLabel label = new JLabel("1.0");
		label.setBounds(100, 130, 61, 16);
		contentPane.add(label);
	}
}
