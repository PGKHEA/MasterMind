import java.awt.BorderLayout;
import java.awt.Color;
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
	private int round = 0;
	private int guessOne = 0;
	private int guessTwo = 0;
	private int guessThree = 0;
	private int guessFour = 0;
	Color brown = new Color(139,69,19);

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
		setBounds(100, 100, 450, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
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
				
				final JButton btnR8G1 = new JButton("");
				btnR8G1.setEnabled(false);
				btnR8G1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						switch(guessOne){
						case 0:
							btnR8G1.setBackground(Color.RED);
							break;
						case 1:
							btnR8G1.setBackground(Color.GREEN);
							break;
						case 2:
							btnR8G1.setBackground(Color.BLUE);
							break;
						case 3:
							btnR8G1.setBackground(Color.YELLOW);
							break;
						case 4:
							btnR8G1.setBackground(brown);
							break;
						case 5:
							btnR8G1.setBackground(Color.ORANGE);
							break;
						case 6:
							btnR8G1.setBackground(Color.BLACK);
							break;
						case 7:
							btnR8G1.setBackground(Color.WHITE);
							break;
						default:
							guessOne = 0;
							btnR8G1.setBackground(Color.RED);
							break;
						}
						
						guessOne += 1;
					}
				});
				btnR8G1.setSize(new Dimension(20, 20));
				btnR8G1.setBounds(10, 57, 40, 40);
				panel_1.add(btnR8G1);
				
				final JButton btnR8G2 = new JButton("");
				btnR8G2.setEnabled(false);
				btnR8G2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						switch(guessTwo){
						case 0:
							btnR8G2.setBackground(Color.RED);
							break;
						case 1:
							btnR8G2.setBackground(Color.GREEN);
							break;
						case 2:
							btnR8G2.setBackground(Color.BLUE);
							break;
						case 3:
							btnR8G2.setBackground(Color.YELLOW);
							break;
						case 4:
							btnR8G2.setBackground(brown);
							break;
						case 5:
							btnR8G2.setBackground(Color.ORANGE);
							break;
						case 6:
							btnR8G2.setBackground(Color.BLACK);
							break;
						case 7:
							btnR8G2.setBackground(Color.WHITE);
							break;
						default:
							guessTwo = 0;
							btnR8G2.setBackground(Color.RED);
							break;
						}
						guessTwo += 1;
					}
				});
				btnR8G2.setSize(new Dimension(20, 20));
				btnR8G2.setBounds(103, 57, 40, 40);
				panel_1.add(btnR8G2);
				
				final JButton btnR8G3 = new JButton("");
				btnR8G3.setEnabled(false);
				btnR8G3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						switch(guessThree){
						case 0:
							btnR8G3.setBackground(Color.RED);
							break;
						case 1:
							btnR8G3.setBackground(Color.GREEN);
							break;
						case 2:
							btnR8G3.setBackground(Color.BLUE);
							break;
						case 3:
							btnR8G3.setBackground(Color.YELLOW);
							break;
						case 4:
							btnR8G3.setBackground(brown);
							break;
						case 5:
							btnR8G3.setBackground(Color.ORANGE);
							break;
						case 6:
							btnR8G3.setBackground(Color.BLACK);
							break;
						case 7:
							btnR8G3.setBackground(Color.WHITE);
							break;
						default:
							guessThree = 0;
							btnR8G3.setBackground(Color.RED);
							break;
						}
						guessThree += 1;
					}
				});
				
						btnR8G3.setSize(new Dimension(20, 20));
						btnR8G3.setBounds(194, 57, 40, 40);
						panel_1.add(btnR8G3);
						
						final JButton btnR8G4 = new JButton("");
						btnR8G4.setEnabled(false);
						btnR8G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessFour){
								case 0:
									btnR8G4.setBackground(Color.RED);
									break;
								case 1:
									btnR8G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR8G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR8G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR8G4.setBackground(brown);
									break;
								case 5:
									btnR8G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR8G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR8G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR8G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
							}
						});
						btnR8G4.setBounds(287, 57, 40, 40);
						panel_1.add(btnR8G4);
						
						final JButton btnR7G1 = new JButton("");
						btnR7G1.setEnabled(false);
						btnR7G1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessOne){
								case 0:
									btnR7G1.setBackground(Color.RED);
									break;
								case 1:
									btnR7G1.setBackground(Color.GREEN);
									break;
								case 2:
									btnR7G1.setBackground(Color.BLUE);
									break;
								case 3:
									btnR7G1.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR7G1.setBackground(brown);
									break;
								case 5:
									btnR7G1.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR7G1.setBackground(Color.BLACK);
									break;
								case 7:
									btnR7G1.setBackground(Color.WHITE);
									break;
								default:
									guessOne = 0;
									btnR7G1.setBackground(Color.RED);
									break;
								}
								
								guessOne += 1;
							}
						});
						btnR7G1.setSize(new Dimension(20, 20));
						btnR7G1.setBounds(10, 108, 40, 40);
						panel_1.add(btnR7G1);
						
						final JButton btnR7G2 = new JButton("");
						btnR7G2.setEnabled(false);
						btnR7G2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessTwo){
								case 0:
									btnR7G2.setBackground(Color.RED);
									break;
								case 1:
									btnR7G2.setBackground(Color.GREEN);
									break;
								case 2:
									btnR7G2.setBackground(Color.BLUE);
									break;
								case 3:
									btnR7G2.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR7G2.setBackground(brown);
									break;
								case 5:
									btnR7G2.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR7G2.setBackground(Color.BLACK);
									break;
								case 7:
									btnR7G2.setBackground(Color.WHITE);
									break;
								default:
									guessTwo = 0;
									btnR7G2.setBackground(Color.RED);
									break;
								}
								guessTwo += 1;
							}
						});
						btnR7G2.setSize(new Dimension(20, 20));
						btnR7G2.setBounds(103, 108, 40, 40);
						panel_1.add(btnR7G2);
						
						final JButton btnR7G3 = new JButton("");
						btnR7G3.setEnabled(false);
						btnR7G3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessThree){
								case 0:
									btnR7G3.setBackground(Color.RED);
									break;
								case 1:
									btnR7G3.setBackground(Color.GREEN);
									break;
								case 2:
									btnR7G3.setBackground(Color.BLUE);
									break;
								case 3:
									btnR7G3.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR7G3.setBackground(brown);
									break;
								case 5:
									btnR7G3.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR7G3.setBackground(Color.BLACK);
									break;
								case 7:
									btnR7G3.setBackground(Color.WHITE);
									break;
								default:
									guessThree = 0;
									btnR7G3.setBackground(Color.RED);
									break;
								}
								guessThree += 1;
							}
						});
						btnR7G3.setSize(new Dimension(20, 20));
						btnR7G3.setBounds(194, 108, 40, 40);
						panel_1.add(btnR7G3);
						
						final JButton btnR7G4 = new JButton("");
						btnR7G4.setEnabled(false);
						btnR7G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessFour){
								case 0:
									btnR7G4.setBackground(Color.RED);
									break;
								case 1:
									btnR7G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR7G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR7G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR7G4.setBackground(brown);
									break;
								case 5:
									btnR7G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR7G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR7G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR7G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
							}
						});
						btnR7G4.setSize(new Dimension(20, 20));
						btnR7G4.setBounds(287, 108, 40, 40);
						panel_1.add(btnR7G4);
						
						final JButton btnR6G1 = new JButton("");
						btnR6G1.setEnabled(false);
						btnR6G1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessOne){
								case 0:
									btnR6G1.setBackground(Color.RED);
									break;
								case 1:
									btnR6G1.setBackground(Color.GREEN);
									break;
								case 2:
									btnR6G1.setBackground(Color.BLUE);
									break;
								case 3:
									btnR6G1.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR6G1.setBackground(brown);
									break;
								case 5:
									btnR6G1.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR6G1.setBackground(Color.BLACK);
									break;
								case 7:
									btnR6G1.setBackground(Color.WHITE);
									break;
								default:
									guessOne = 0;
									btnR6G1.setBackground(Color.RED);
									break;
								}
								
								guessOne += 1;
							}
						});
						btnR6G1.setSize(new Dimension(20, 20));
						btnR6G1.setBounds(10, 162, 40, 40);
						panel_1.add(btnR6G1);
						
						final JButton btnR6G2 = new JButton("");
						btnR6G2.setEnabled(false);
						btnR6G2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessTwo){
								case 0:
									btnR6G2.setBackground(Color.RED);
									break;
								case 1:
									btnR6G2.setBackground(Color.GREEN);
									break;
								case 2:
									btnR6G2.setBackground(Color.BLUE);
									break;
								case 3:
									btnR6G2.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR6G2.setBackground(brown);
									break;
								case 5:
									btnR6G2.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR6G2.setBackground(Color.BLACK);
									break;
								case 7:
									btnR6G2.setBackground(Color.WHITE);
									break;
								default:
									guessTwo = 0;
									btnR6G2.setBackground(Color.RED);
									break;
								}
								guessTwo += 1;
							}
						});
						btnR6G2.setSize(new Dimension(20, 20));
						btnR6G2.setBounds(103, 162, 40, 40);
						panel_1.add(btnR6G2);
						
						final JButton btnR6G3 = new JButton("");
						btnR6G3.setEnabled(false);
						btnR6G3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessThree){
								case 0:
									btnR6G3.setBackground(Color.RED);
									break;
								case 1:
									btnR6G3.setBackground(Color.GREEN);
									break;
								case 2:
									btnR6G3.setBackground(Color.BLUE);
									break;
								case 3:
									btnR6G3.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR6G3.setBackground(brown);
									break;
								case 5:
									btnR6G3.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR6G3.setBackground(Color.BLACK);
									break;
								case 7:
									btnR6G3.setBackground(Color.WHITE);
									break;
								default:
									guessThree = 0;
									btnR6G3.setBackground(Color.RED);
									break;
								}
								guessThree += 1;
							}
						});
						btnR6G3.setSize(new Dimension(20, 20));
						btnR6G3.setBounds(194, 162, 40, 40);
						panel_1.add(btnR6G3);
						
						final JButton btnR6G4 = new JButton("");
						btnR6G4.setEnabled(false);
						btnR6G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessFour){
								case 0:
									btnR6G4.setBackground(Color.RED);
									break;
								case 1:
									btnR6G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR6G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR6G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR6G4.setBackground(brown);
									break;
								case 5:
									btnR6G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR6G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR6G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR6G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
							}
						});
						btnR6G4.setSize(new Dimension(20, 20));
						btnR6G4.setBounds(287, 162, 40, 40);
						panel_1.add(btnR6G4);
						
						final JButton btnR5G1 = new JButton("");
						btnR5G1.setEnabled(false);
						btnR5G1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessOne){
								case 0:
									btnR5G1.setBackground(Color.RED);
									break;
								case 1:
									btnR5G1.setBackground(Color.GREEN);
									break;
								case 2:
									btnR5G1.setBackground(Color.BLUE);
									break;
								case 3:
									btnR5G1.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR5G1.setBackground(brown);
									break;
								case 5:
									btnR5G1.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR5G1.setBackground(Color.BLACK);
									break;
								case 7:
									btnR5G1.setBackground(Color.WHITE);
									break;
								default:
									guessOne = 0;
									btnR5G1.setBackground(Color.RED);
									break;
								}
								
								guessOne += 1;
							}
						});
						btnR5G1.setSize(new Dimension(20, 20));
						btnR5G1.setBounds(10, 213, 40, 40);
						panel_1.add(btnR5G1);
						
						final JButton btnR5G2 = new JButton("");
						btnR5G2.setEnabled(false);
						btnR5G2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessTwo){
								case 0:
									btnR5G2.setBackground(Color.RED);
									break;
								case 1:
									btnR5G2.setBackground(Color.GREEN);
									break;
								case 2:
									btnR5G2.setBackground(Color.BLUE);
									break;
								case 3:
									btnR5G2.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR5G2.setBackground(brown);
									break;
								case 5:
									btnR5G2.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR5G2.setBackground(Color.BLACK);
									break;
								case 7:
									btnR5G2.setBackground(Color.WHITE);
									break;
								default:
									guessTwo = 0;
									btnR5G2.setBackground(Color.RED);
									break;
								}
								guessTwo += 1;
							}
						});
						btnR5G2.setSize(new Dimension(20, 20));
						btnR5G2.setBounds(103, 213, 40, 40);
						panel_1.add(btnR5G2);
						
						final JButton btnR5G3 = new JButton("");
						btnR5G3.setEnabled(false);
						btnR5G3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessThree){
								case 0:
									btnR5G3.setBackground(Color.RED);
									break;
								case 1:
									btnR5G3.setBackground(Color.GREEN);
									break;
								case 2:
									btnR5G3.setBackground(Color.BLUE);
									break;
								case 3:
									btnR5G3.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR5G3.setBackground(brown);
									break;
								case 5:
									btnR5G3.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR5G3.setBackground(Color.BLACK);
									break;
								case 7:
									btnR5G3.setBackground(Color.WHITE);
									break;
								default:
									guessThree = 0;
									btnR5G3.setBackground(Color.RED);
									break;
								}
								guessThree += 1;
							}
						});
						btnR5G3.setSize(new Dimension(20, 20));
						btnR5G3.setBounds(194, 213, 40, 40);
						panel_1.add(btnR5G3);
						
						final JButton btnR5G4 = new JButton("");
						btnR5G4.setEnabled(false);
						btnR5G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								switch(guessFour){
								case 0:
									btnR5G4.setBackground(Color.RED);
									break;
								case 1:
									btnR5G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR5G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR5G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR5G4.setBackground(brown);
									break;
								case 5:
									btnR5G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR5G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR5G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR5G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
							}
						});
						btnR5G4.setSize(new Dimension(20, 20));
						btnR5G4.setBounds(287, 213, 40, 40);
						panel_1.add(btnR5G4);
						
						final JButton btnR4G1 = new JButton("");
						btnR4G1.setEnabled(false);
						btnR4G1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessOne){
								case 0:
									btnR4G1.setBackground(Color.RED);
									break;
								case 1:
									btnR4G1.setBackground(Color.GREEN);
									break;
								case 2:
									btnR4G1.setBackground(Color.BLUE);
									break;
								case 3:
									btnR4G1.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR4G1.setBackground(brown);
									break;
								case 5:
									btnR4G1.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR4G1.setBackground(Color.BLACK);
									break;
								case 7:
									btnR4G1.setBackground(Color.WHITE);
									break;
								default:
									guessOne = 0;
									btnR4G1.setBackground(Color.RED);
									break;
								}
								
								guessOne += 1;
							}
						});
						btnR4G1.setSize(new Dimension(20, 20));
						btnR4G1.setBounds(10, 264, 40, 40);
						panel_1.add(btnR4G1);
						
						final JButton btnR4G2 = new JButton("");
						btnR4G2.setEnabled(false);
						btnR4G2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessTwo){
								case 0:
									btnR4G2.setBackground(Color.RED);
									break;
								case 1:
									btnR4G2.setBackground(Color.GREEN);
									break;
								case 2:
									btnR4G2.setBackground(Color.BLUE);
									break;
								case 3:
									btnR4G2.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR4G2.setBackground(brown);
									break;
								case 5:
									btnR4G2.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR4G2.setBackground(Color.BLACK);
									break;
								case 7:
									btnR4G2.setBackground(Color.WHITE);
									break;
								default:
									guessTwo = 0;
									btnR4G2.setBackground(Color.RED);
									break;
								}
								guessTwo += 1;
							}
						});
						btnR4G2.setSize(new Dimension(20, 20));
						btnR4G2.setBounds(103, 264, 40, 40);
						panel_1.add(btnR4G2);
						
						final JButton btnR4G3 = new JButton("");
						btnR4G3.setEnabled(false);
						btnR4G3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessThree){
								case 0:
									btnR4G3.setBackground(Color.RED);
									break;
								case 1:
									btnR4G3.setBackground(Color.GREEN);
									break;
								case 2:
									btnR4G3.setBackground(Color.BLUE);
									break;
								case 3:
									btnR4G3.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR4G3.setBackground(brown);
									break;
								case 5:
									btnR4G3.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR4G3.setBackground(Color.BLACK);
									break;
								case 7:
									btnR4G3.setBackground(Color.WHITE);
									break;
								default:
									guessThree = 0;
									btnR4G3.setBackground(Color.RED);
									break;
								}
								guessThree += 1;
							}
						});
						btnR4G3.setSize(new Dimension(20, 20));
						btnR4G3.setBounds(194, 264, 40, 40);
						panel_1.add(btnR4G3);
						
						final JButton btnR4G4 = new JButton("");
						btnR4G4.setEnabled(false);
						btnR4G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessFour){
								case 0:
									btnR4G4.setBackground(Color.RED);
									break;
								case 1:
									btnR4G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR4G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR4G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR4G4.setBackground(brown);
									break;
								case 5:
									btnR4G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR4G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR4G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR4G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
								
							}
						});
						btnR4G4.setSize(new Dimension(20, 20));
						btnR4G4.setBounds(287, 264, 40, 40);
						panel_1.add(btnR4G4);
						
						final JButton btnR3G1 = new JButton("");
						btnR3G1.setEnabled(false);
						btnR3G1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessOne){
								case 0:
									btnR3G1.setBackground(Color.RED);
									break;
								case 1:
									btnR3G1.setBackground(Color.GREEN);
									break;
								case 2:
									btnR3G1.setBackground(Color.BLUE);
									break;
								case 3:
									btnR3G1.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR3G1.setBackground(brown);
									break;
								case 5:
									btnR3G1.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR3G1.setBackground(Color.BLACK);
									break;
								case 7:
									btnR3G1.setBackground(Color.WHITE);
									break;
								default:
									guessOne = 0;
									btnR3G1.setBackground(Color.RED);
									break;
								}
								
								guessOne += 1;
							}
						});
						btnR3G1.setSize(new Dimension(20, 20));
						btnR3G1.setBounds(10, 315, 40, 40);
						panel_1.add(btnR3G1);
						
						final JButton btnR3G2 = new JButton("");
						btnR3G2.setEnabled(false);
						btnR3G2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessTwo){
								case 0:
									btnR3G2.setBackground(Color.RED);
									break;
								case 1:
									btnR3G2.setBackground(Color.GREEN);
									break;
								case 2:
									btnR3G2.setBackground(Color.BLUE);
									break;
								case 3:
									btnR3G2.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR3G2.setBackground(brown);
									break;
								case 5:
									btnR3G2.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR3G2.setBackground(Color.BLACK);
									break;
								case 7:
									btnR3G2.setBackground(Color.WHITE);
									break;
								default:
									guessTwo = 0;
									btnR3G2.setBackground(Color.RED);
									break;
								}
								guessTwo += 1;
							}
						});
						btnR3G2.setSize(new Dimension(20, 20));
						btnR3G2.setBounds(103, 315, 40, 40);
						panel_1.add(btnR3G2);
						
						final JButton btnR3G3 = new JButton("");
						btnR3G3.setEnabled(false);
						btnR3G3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessThree){
								case 0:
									btnR3G3.setBackground(Color.RED);
									break;
								case 1:
									btnR3G3.setBackground(Color.GREEN);
									break;
								case 2:
									btnR3G3.setBackground(Color.BLUE);
									break;
								case 3:
									btnR3G3.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR3G3.setBackground(brown);
									break;
								case 5:
									btnR3G3.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR3G3.setBackground(Color.BLACK);
									break;
								case 7:
									btnR3G3.setBackground(Color.WHITE);
									break;
								default:
									guessThree = 0;
									btnR3G3.setBackground(Color.RED);
									break;
								}
								guessThree += 1;
							}
						});
						btnR3G3.setSize(new Dimension(20, 20));
						btnR3G3.setBounds(194, 315, 40, 40);
						panel_1.add(btnR3G3);
						
						final JButton btnR3G4 = new JButton("");
						btnR3G4.setEnabled(false);
						btnR3G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessFour){
								case 0:
									btnR3G4.setBackground(Color.RED);
									break;
								case 1:
									btnR3G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR3G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR3G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR3G4.setBackground(brown);
									break;
								case 5:
									btnR3G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR3G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR3G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR3G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
							}
						});
						btnR3G4.setSize(new Dimension(20, 20));
						btnR3G4.setBounds(287, 315, 40, 40);
						panel_1.add(btnR3G4);
						
						final JButton btnR2G1 = new JButton("");
						btnR2G1.setEnabled(false);
						btnR2G1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessOne){
								case 0:
									btnR2G1.setBackground(Color.RED);
									break;
								case 1:
									btnR2G1.setBackground(Color.GREEN);
									break;
								case 2:
									btnR2G1.setBackground(Color.BLUE);
									break;
								case 3:
									btnR2G1.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR2G1.setBackground(brown);
									break;
								case 5:
									btnR2G1.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR2G1.setBackground(Color.BLACK);
									break;
								case 7:
									btnR2G1.setBackground(Color.WHITE);
									break;
								default:
									guessOne = 0;
									btnR2G1.setBackground(Color.RED);
									break;
								}
								
								guessOne += 1;
							}
						});
						btnR2G1.setSize(new Dimension(20, 20));
						btnR2G1.setBounds(10, 367, 40, 40);
						panel_1.add(btnR2G1);
						
						final JButton btnR2G2 = new JButton("");
						btnR2G2.setEnabled(false);
						btnR2G2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessTwo){
								case 0:
									btnR2G2.setBackground(Color.RED);
									break;
								case 1:
									btnR2G2.setBackground(Color.GREEN);
									break;
								case 2:
									btnR2G2.setBackground(Color.BLUE);
									break;
								case 3:
									btnR2G2.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR2G2.setBackground(brown);
									break;
								case 5:
									btnR2G2.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR2G2.setBackground(Color.BLACK);
									break;
								case 7:
									btnR2G2.setBackground(Color.WHITE);
									break;
								default:
									guessTwo = 0;
									btnR2G2.setBackground(Color.RED);
									break;
								}
								guessTwo += 1;
							}
						});
						btnR2G2.setSize(new Dimension(20, 20));
						btnR2G2.setBounds(103, 367, 40, 40);
						panel_1.add(btnR2G2);
						
						final JButton btnR2G3 = new JButton("");
						btnR2G3.setEnabled(false);
						btnR2G3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessThree){
								case 0:
									btnR2G3.setBackground(Color.RED);
									break;
								case 1:
									btnR2G3.setBackground(Color.GREEN);
									break;
								case 2:
									btnR2G3.setBackground(Color.BLUE);
									break;
								case 3:
									btnR2G3.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR2G3.setBackground(brown);
									break;
								case 5:
									btnR2G3.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR2G3.setBackground(Color.BLACK);
									break;
								case 7:
									btnR2G3.setBackground(Color.WHITE);
									break;
								default:
									guessThree = 0;
									btnR2G3.setBackground(Color.RED);
									break;
								}
								guessThree += 1;
							}
						});
						btnR2G3.setSize(new Dimension(20, 20));
						btnR2G3.setBounds(194, 367, 40, 40);
						panel_1.add(btnR2G3);
						
						final JButton btnR2G4 = new JButton("");
						btnR2G4.setEnabled(false);
						btnR2G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessFour){
								case 0:
									btnR2G4.setBackground(Color.RED);
									break;
								case 1:
									btnR2G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR2G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR2G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR2G4.setBackground(brown);
									break;
								case 5:
									btnR2G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR2G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR2G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR2G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
							}
						});
						btnR2G4.setSize(new Dimension(20, 20));
						btnR2G4.setBounds(287, 367, 40, 40);
						panel_1.add(btnR2G4);
						
						final JButton btnR1G1 = new JButton("");
						btnR1G1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessOne){
								case 0:
									btnR1G1.setBackground(Color.RED);
									break;
								case 1:
									btnR1G1.setBackground(Color.GREEN);
									break;
								case 2:
									btnR1G1.setBackground(Color.BLUE);
									break;
								case 3:
									btnR1G1.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR1G1.setBackground(brown);
									break;
								case 5:
									btnR1G1.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR1G1.setBackground(Color.BLACK);
									break;
								case 7:
									btnR1G1.setBackground(Color.WHITE);
									break;
								default:
									guessOne = 0;
									btnR1G1.setBackground(Color.RED);
									break;
								}
								
								guessOne += 1;
								
							}
						});
						btnR1G1.setSize(new Dimension(20, 20));
						btnR1G1.setBounds(10, 418, 40, 40);
						panel_1.add(btnR1G1);
						
						final JButton btnR1G2 = new JButton("");
						btnR1G2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessTwo){
								case 0:
									btnR1G2.setBackground(Color.RED);
									break;
								case 1:
									btnR1G2.setBackground(Color.GREEN);
									break;
								case 2:
									btnR1G2.setBackground(Color.BLUE);
									break;
								case 3:
									btnR1G2.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR1G2.setBackground(brown);
									break;
								case 5:
									btnR1G2.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR1G2.setBackground(Color.BLACK);
									break;
								case 7:
									btnR1G2.setBackground(Color.WHITE);
									break;
								default:
									guessTwo = 0;
									btnR1G2.setBackground(Color.RED);
									break;
								}
								guessTwo += 1;
							}
						});
						btnR1G2.setSize(new Dimension(20, 20));
						btnR1G2.setBounds(103, 418, 40, 40);
						panel_1.add(btnR1G2);
						
						final JButton btnR1G3 = new JButton("");
						btnR1G3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessThree){
								case 0:
									btnR1G3.setBackground(Color.RED);
									break;
								case 1:
									btnR1G3.setBackground(Color.GREEN);
									break;
								case 2:
									btnR1G3.setBackground(Color.BLUE);
									break;
								case 3:
									btnR1G3.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR1G3.setBackground(brown);
									break;
								case 5:
									btnR1G3.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR1G3.setBackground(Color.BLACK);
									break;
								case 7:
									btnR1G3.setBackground(Color.WHITE);
									break;
								default:
									guessThree = 0;
									btnR1G3.setBackground(Color.RED);
									break;
								}
								guessThree += 1;
							}
						});
						btnR1G3.setSize(new Dimension(20, 20));
						btnR1G3.setBounds(194, 418, 40, 40);
						panel_1.add(btnR1G3);
						
						final JButton btnR1G4 = new JButton("");
						btnR1G4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								switch(guessFour){
								case 0:
									btnR1G4.setBackground(Color.RED);
									break;
								case 1:
									btnR1G4.setBackground(Color.GREEN);
									break;
								case 2:
									btnR1G4.setBackground(Color.BLUE);
									break;
								case 3:
									btnR1G4.setBackground(Color.YELLOW);
									break;
								case 4:
									btnR1G4.setBackground(brown);
									break;
								case 5:
									btnR1G4.setBackground(Color.ORANGE);
									break;
								case 6:
									btnR1G4.setBackground(Color.BLACK);
									break;
								case 7:
									btnR1G4.setBackground(Color.WHITE);
									break;
								default:
									guessFour = 0;
									btnR1G4.setBackground(Color.RED);
									break;
								}
								guessFour += 1;
							}
						});
						btnR1G4.setSize(new Dimension(20, 20));
						btnR1G4.setBounds(287, 418, 40, 40);
						panel_1.add(btnR1G4);
						
						JButton btnCheck = new JButton("Check");
						btnCheck.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								guessOne = 0;
								guessTwo = 0;
								guessThree = 0;
								guessFour = 0;
								
								switch(round){
								case 0:
									btnR1G1.setEnabled(false);
									btnR1G2.setEnabled(false);
									btnR1G3.setEnabled(false);
									btnR1G4.setEnabled(false);
									
									btnR2G1.setEnabled(true);
									btnR2G2.setEnabled(true);
									btnR2G3.setEnabled(true);
									btnR2G4.setEnabled(true);
									break;
								case 1:
									btnR2G1.setEnabled(false);
									btnR2G2.setEnabled(false);
									btnR2G3.setEnabled(false);
									btnR2G4.setEnabled(false);
									
									btnR3G1.setEnabled(true);
									btnR3G2.setEnabled(true);
									btnR3G3.setEnabled(true);
									btnR3G4.setEnabled(true);
									break;
								case 2:
									btnR3G1.setEnabled(false);
									btnR3G2.setEnabled(false);
									btnR3G3.setEnabled(false);
									btnR3G4.setEnabled(false);
									
									btnR4G1.setEnabled(true);
									btnR4G2.setEnabled(true);
									btnR4G3.setEnabled(true);
									btnR4G4.setEnabled(true);
									break;
								case 3:
									btnR4G1.setEnabled(false);
									btnR4G2.setEnabled(false);
									btnR4G3.setEnabled(false);
									btnR4G4.setEnabled(false);
									
									btnR5G1.setEnabled(true);
									btnR5G2.setEnabled(true);
									btnR5G3.setEnabled(true);
									btnR5G4.setEnabled(true);
									break;
								case 4:
									btnR5G1.setEnabled(false);
									btnR5G2.setEnabled(false);
									btnR5G3.setEnabled(false);
									btnR5G4.setEnabled(false);
									
									btnR6G1.setEnabled(true);
									btnR6G2.setEnabled(true);
									btnR6G3.setEnabled(true);
									btnR6G4.setEnabled(true);
									break;
								case 5:
									btnR6G1.setEnabled(false);
									btnR6G2.setEnabled(false);
									btnR6G3.setEnabled(false);
									btnR6G4.setEnabled(false);
									
									btnR7G1.setEnabled(true);
									btnR7G2.setEnabled(true);
									btnR7G3.setEnabled(true);
									btnR7G4.setEnabled(true);
									break;
								case 6:
									btnR7G1.setEnabled(false);
									btnR7G2.setEnabled(false);
									btnR7G3.setEnabled(false);
									btnR7G4.setEnabled(false);
									
									btnR8G1.setEnabled(true);
									btnR8G2.setEnabled(true);
									btnR8G3.setEnabled(true);
									btnR8G4.setEnabled(true);
									break;
								default:
									btnR8G1.setEnabled(false);
									btnR8G2.setEnabled(false);
									btnR8G3.setEnabled(false);
									btnR8G4.setEnabled(false);
										
								}
								round += 1;
							}
						});
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
				
	}
	
}
