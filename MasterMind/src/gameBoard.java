import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Dimension;


public class gameBoard extends JFrame {

	private JPanel contentPane;
	private JTextField tbxName;
	private static gameBoard frame;
	final JPanel panel_1;
	final JPanel panel;
	private JLabel lblR8G1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame = new gameBoard();
	
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
	public gameBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNumGames = new JLabel("How many games would you like to play?");
		lblNumGames.setBounds(11, 75, 195, 14);
		panel.add(lblNumGames);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(229, 72, 29, 20);
		panel.add(spinner);
		
		JButton btnSubmit = new JButton("Submit");
		
				btnSubmit.setBounds(345, 228, 79, 23);
				panel.add(btnSubmit);
				
				tbxName = new JTextField();
				tbxName.setBounds(11, 34, 86, 20);
				panel.add(tbxName);
				tbxName.setColumns(10);
				
				JLabel lblPlayerOneName = new JLabel("Player One Name:");
				lblPlayerOneName.setBounds(10, 9, 87, 14);
				panel.add(lblPlayerOneName);
				
				btnSubmit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel.setVisible(false);
						panel_1.setVisible(true);
						frame.setBounds(frame.getX(), frame.getY(), panel_1.getWidth(), panel_1.getHeight());
						contentPane.setSize(panel_1.getWidth(), panel_1.getHeight());
					}
				});

		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 434, 601);
		contentPane.add(panel_1);
		panel_1.setVisible(false);
		panel_1.setLayout(null);
		
		JButton btnChoosen1 = new JButton("?");
		btnChoosen1.setSize(new Dimension(20, 20));
		
		btnChoosen1.setBounds(10, 11, 40, 40);
		panel_1.add(btnChoosen1);
		
		JButton btnChoosen2 = new JButton("?");
		btnChoosen2.setSize(new Dimension(20, 20));
		btnChoosen2.setBounds(103, 11, 40, 40);
		panel_1.add(btnChoosen2);
		
		JButton btnChoosen3 = new JButton("?");
		btnChoosen3.setSize(new Dimension(20, 20));
		btnChoosen3.setBounds(194, 11, 40, 40);
		panel_1.add(btnChoosen3);
		
		JButton btnChoosen4 = new JButton("?");
		btnChoosen4.setSize(new Dimension(20, 20));
		btnChoosen4.setBounds(287, 11, 40, 40);
		panel_1.add(btnChoosen4);
		
		JButton btnR8G1 = new JButton("");
		btnR8G1.setSize(new Dimension(20, 20));
		btnR8G1.setBounds(10, 57, 40, 40);
		panel_1.add(btnR8G1);
		
		JButton btnR8G2 = new JButton("");
		btnR8G2.setSize(new Dimension(20, 20));
		btnR8G2.setBounds(103, 57, 40, 40);
		panel_1.add(btnR8G2);
		
		JButton btnR8G3 = new JButton("");
		
				btnR8G3.setSize(new Dimension(20, 20));
				btnR8G3.setBounds(194, 57, 40, 40);
				panel_1.add(btnR8G3);
				
				JButton btnR8G4 = new JButton("");
				btnR8G4.setBounds(287, 57, 40, 40);
				panel_1.add(btnR8G4);
				
				JButton btnR7G1 = new JButton("");
				btnR7G1.setSize(new Dimension(20, 20));
				btnR7G1.setBounds(10, 108, 40, 40);
				panel_1.add(btnR7G1);
				
				JButton btnR7G2 = new JButton("");
				btnR7G2.setSize(new Dimension(20, 20));
				btnR7G2.setBounds(103, 108, 40, 40);
				panel_1.add(btnR7G2);
				
				JButton btnR7G3 = new JButton("");
				btnR7G3.setSize(new Dimension(20, 20));
				btnR7G3.setBounds(194, 108, 40, 40);
				panel_1.add(btnR7G3);
				
				JButton btnR7G4 = new JButton("");
				btnR7G4.setSize(new Dimension(20, 20));
				btnR7G4.setBounds(287, 108, 40, 40);
				panel_1.add(btnR7G4);
				
				JButton btnR6G1 = new JButton("");
				btnR6G1.setSize(new Dimension(20, 20));
				btnR6G1.setBounds(10, 162, 40, 40);
				panel_1.add(btnR6G1);
				
				JButton btnR6G2 = new JButton("");
				btnR6G2.setSize(new Dimension(20, 20));
				btnR6G2.setBounds(103, 162, 40, 40);
				panel_1.add(btnR6G2);
				
				JButton btnR6G3 = new JButton("");
				btnR6G3.setSize(new Dimension(20, 20));
				btnR6G3.setBounds(194, 162, 40, 40);
				panel_1.add(btnR6G3);
				
				JButton btnR6G4 = new JButton("");
				btnR6G4.setSize(new Dimension(20, 20));
				btnR6G4.setBounds(287, 162, 40, 40);
				panel_1.add(btnR6G4);
				
				JButton btnR5G1 = new JButton("");
				btnR5G1.setSize(new Dimension(20, 20));
				btnR5G1.setBounds(10, 213, 40, 40);
				panel_1.add(btnR5G1);
				
				JButton btnR5G2 = new JButton("");
				btnR5G2.setSize(new Dimension(20, 20));
				btnR5G2.setBounds(103, 213, 40, 40);
				panel_1.add(btnR5G2);
				
				JButton btnR5G3 = new JButton("");
				btnR5G3.setSize(new Dimension(20, 20));
				btnR5G3.setBounds(194, 213, 40, 40);
				panel_1.add(btnR5G3);
				
				JButton btnR5G4 = new JButton("");
				btnR5G4.setSize(new Dimension(20, 20));
				btnR5G4.setBounds(287, 213, 40, 40);
				panel_1.add(btnR5G4);
				
				JButton btnR4G1 = new JButton("");
				btnR4G1.setSize(new Dimension(20, 20));
				btnR4G1.setBounds(10, 264, 40, 40);
				panel_1.add(btnR4G1);
				
				JButton btnR4G2 = new JButton("");
				btnR4G2.setSize(new Dimension(20, 20));
				btnR4G2.setBounds(103, 264, 40, 40);
				panel_1.add(btnR4G2);
				
				JButton btnR4G3 = new JButton("");
				btnR4G3.setSize(new Dimension(20, 20));
				btnR4G3.setBounds(194, 264, 40, 40);
				panel_1.add(btnR4G3);
				
				JButton btnR4G4 = new JButton("");
				btnR4G4.setSize(new Dimension(20, 20));
				btnR4G4.setBounds(287, 264, 40, 40);
				panel_1.add(btnR4G4);
				
				JButton btnR3G1 = new JButton("");
				btnR3G1.setSize(new Dimension(20, 20));
				btnR3G1.setBounds(10, 315, 40, 40);
				panel_1.add(btnR3G1);
				
				JButton btnR3G2 = new JButton("");
				btnR3G2.setSize(new Dimension(20, 20));
				btnR3G2.setBounds(103, 315, 40, 40);
				panel_1.add(btnR3G2);
				
				JButton btnR3G3 = new JButton("");
				btnR3G3.setSize(new Dimension(20, 20));
				btnR3G3.setBounds(194, 315, 40, 40);
				panel_1.add(btnR3G3);
				
				JButton btnR3G4 = new JButton("");
				btnR3G4.setSize(new Dimension(20, 20));
				btnR3G4.setBounds(287, 315, 40, 40);
				panel_1.add(btnR3G4);
				
				JButton btnR2G1 = new JButton("");
				btnR2G1.setSize(new Dimension(20, 20));
				btnR2G1.setBounds(10, 367, 40, 40);
				panel_1.add(btnR2G1);
				
				JButton btnR2G2 = new JButton("");
				btnR2G2.setSize(new Dimension(20, 20));
				btnR2G2.setBounds(103, 367, 40, 40);
				panel_1.add(btnR2G2);
				
				JButton btnR2G3 = new JButton("");
				btnR2G3.setSize(new Dimension(20, 20));
				btnR2G3.setBounds(194, 367, 40, 40);
				panel_1.add(btnR2G3);
				
				JButton btnR2G4 = new JButton("");
				btnR2G4.setSize(new Dimension(20, 20));
				btnR2G4.setBounds(287, 367, 40, 40);
				panel_1.add(btnR2G4);
				
				JButton btnR1G1 = new JButton("");
				btnR1G1.setSize(new Dimension(20, 20));
				btnR1G1.setBounds(10, 418, 40, 40);
				panel_1.add(btnR1G1);
				
				JButton btnR1G2 = new JButton("");
				btnR1G2.setSize(new Dimension(20, 20));
				btnR1G2.setBounds(103, 418, 40, 40);
				panel_1.add(btnR1G2);
				
				JButton btnR1G3 = new JButton("");
				btnR1G3.setSize(new Dimension(20, 20));
				btnR1G3.setBounds(194, 418, 40, 40);
				panel_1.add(btnR1G3);
				
				JButton btnR1G4 = new JButton("");
				btnR1G4.setSize(new Dimension(20, 20));
				btnR1G4.setBounds(287, 418, 40, 40);
				panel_1.add(btnR1G4);
				
				JButton btnCheck = new JButton("Check");
				btnCheck.setBounds(184, 514, 89, 23);
				panel_1.add(btnCheck);
				
				lblR8G1 = new JLabel("");
				lblR8G1.setBounds(337, 70, 15, 14);
				panel_1.add(lblR8G1);
				
				JLabel lblR8G2 = new JLabel("");
				lblR8G2.setBounds(362, 70, 15, 14);
				panel_1.add(lblR8G2);
				
				JLabel lblR8G3 = new JLabel("");
				lblR8G3.setBounds(337, 83, 15, 14);
				panel_1.add(lblR8G3);
				
				JLabel lblR8G4 = new JLabel("");
				lblR8G4.setBounds(362, 83, 15, 14);
				panel_1.add(lblR8G4);
				
				JLabel lblR7G1 = new JLabel("");
				lblR7G1.setBounds(337, 121, 15, 14);
				panel_1.add(lblR7G1);
				
				JLabel lblR7G2 = new JLabel("");
				lblR7G2.setBounds(362, 121, 15, 14);
				panel_1.add(lblR7G2);
				
				JLabel lblR7G3 = new JLabel("");
				lblR7G3.setBounds(337, 134, 15, 14);
				panel_1.add(lblR7G3);
				
				JLabel lblR7G4 = new JLabel("");
				lblR7G4.setBounds(362, 134, 15, 14);
				panel_1.add(lblR7G4);
				
				JLabel lblR6G1 = new JLabel("");
				lblR6G1.setBounds(337, 175, 15, 14);
				panel_1.add(lblR6G1);
				
				JLabel lblR6G2 = new JLabel("");
				lblR6G2.setBounds(362, 175, 15, 14);
				panel_1.add(lblR6G2);
				
				JLabel lblR6G3 = new JLabel("");
				lblR6G3.setBounds(337, 188, 15, 14);
				panel_1.add(lblR6G3);
				
				JLabel lblR6G4 = new JLabel("");
				lblR6G4.setBounds(362, 188, 15, 14);
				panel_1.add(lblR6G4);
				
				JLabel lblR5G1 = new JLabel("");
				lblR5G1.setBounds(337, 226, 15, 14);
				panel_1.add(lblR5G1);
				
				JLabel lblR5G2 = new JLabel("");
				lblR5G2.setBounds(362, 226, 15, 14);
				panel_1.add(lblR5G2);
				
				JLabel lblR5G3 = new JLabel("");
				lblR5G3.setBounds(337, 239, 15, 14);
				panel_1.add(lblR5G3);
				
				JLabel lblR5G4 = new JLabel("");
				lblR5G4.setBounds(362, 239, 15, 14);
				panel_1.add(lblR5G4);
				
				JLabel lblR4G1 = new JLabel("");
				lblR4G1.setBounds(337, 277, 15, 14);
				panel_1.add(lblR4G1);
				
				JLabel lblR4G2 = new JLabel("");
				lblR4G2.setBounds(362, 277, 15, 14);
				panel_1.add(lblR4G2);
				
				JLabel lblR4G3 = new JLabel("");
				lblR4G3.setBounds(337, 290, 15, 14);
				panel_1.add(lblR4G3);
				
				JLabel lblR4G4 = new JLabel("");
				lblR4G4.setBounds(362, 290, 15, 14);
				panel_1.add(lblR4G4);
				
				JLabel lblR3G1 = new JLabel("");
				lblR3G1.setBounds(337, 328, 15, 14);
				panel_1.add(lblR3G1);
				
				JLabel lblR3G2 = new JLabel("");
				lblR3G2.setBounds(362, 328, 15, 14);
				panel_1.add(lblR3G2);
				
				JLabel lblR3G3 = new JLabel("");
				lblR3G3.setBounds(337, 341, 15, 14);
				panel_1.add(lblR3G3);
				
				JLabel lblR3G4 = new JLabel("");
				lblR3G4.setBounds(362, 341, 15, 14);
				panel_1.add(lblR3G4);
				
				JLabel lblR2G1 = new JLabel("");
				lblR2G1.setBounds(337, 380, 15, 14);
				panel_1.add(lblR2G1);
				
				JLabel lblR2G2 = new JLabel("");
				lblR2G2.setBounds(362, 380, 15, 14);
				panel_1.add(lblR2G2);
				
				JLabel lblR2G3 = new JLabel("");
				lblR2G3.setBounds(337, 393, 15, 14);
				panel_1.add(lblR2G3);
				
				JLabel lblR2G4 = new JLabel("");
				lblR2G4.setBounds(362, 393, 15, 14);
				panel_1.add(lblR2G4);
				
				JLabel lblR1G1 = new JLabel("");
				lblR1G1.setBounds(337, 431, 15, 14);
				panel_1.add(lblR1G1);
				
				JLabel lblR1G2 = new JLabel("");
				lblR1G2.setBounds(362, 431, 15, 14);
				panel_1.add(lblR1G2);
				
				JLabel lblR1G3 = new JLabel("");
				lblR1G3.setBounds(337, 444, 15, 14);
				panel_1.add(lblR1G3);
				
				JLabel lblR1G4 = new JLabel("");
				lblR1G4.setBounds(362, 444, 15, 14);
				panel_1.add(lblR1G4);
				
	}
	
}
