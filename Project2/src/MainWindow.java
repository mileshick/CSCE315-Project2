import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JInternalFrame;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import net.miginfocom.swing.MigLayout;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private NewGameWindow newGame;
	private Board myBoard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setTitle("Team 03 Project 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
		setBounds(100, 100, 700, 450);
		newGame = new NewGameWindow();
		myBoard = new Board();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mntmNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newGame.setVisible(true);
			}
		});
		mnFile.add(mntmNewGame);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutDialog dialog = new AboutDialog();
				dialog.setVisible(true);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 231, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		
		// draw board
		//Board myBoard = new Board();
		Color boardColor = new Color(0x855E42); //set color to brown
		myBoard.setBackground(boardColor);
		setContentPane(myBoard);
	}
	
	class NewGameWindow extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextField textField;
		private JTextField textField_1;
		private final ButtonGroup buttonGroup = new ButtonGroup();
		private final String twoPlayerCommand = "2";
		private final String onePlayerCommand = "1";
		private final String noPlayerCommand = "0";
		private Player player1 = new Player(true, PieceColor.WHITE);
		private Player player2 = new Player(false, PieceColor.BLACK);
		private int ROWS;
		private int COLS;

		/**
		 * Create the dialog.
		 */
		public NewGameWindow() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("default:grow"),},
				new RowSpec[] {
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,}));
			{
				JLabel lblNumberOfPlayers = new JLabel("Number of Players");
				contentPanel.add(lblNumberOfPlayers, "2, 2");
			}
			{
				JLabel lblBoardSize = new JLabel("Board Size");
				contentPanel.add(lblBoardSize, "14, 2");
			}
			{
				JLabel lblColumns = new JLabel("# Columns");
				contentPanel.add(lblColumns, "14, 6");
			}
			{
				JRadioButton rdbtnPlayersNo = new JRadioButton("2 Players, No AI");
				rdbtnPlayersNo.setActionCommand(twoPlayerCommand);
				rdbtnPlayersNo.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						player1 = new Player(true, PieceColor.WHITE);
						player2 = new Player(true, PieceColor.BLACK);
					}
				});
				buttonGroup.add(rdbtnPlayersNo);
				contentPanel.add(rdbtnPlayersNo, "2, 8");
			}
			{
				textField = new JTextField("9");
				contentPanel.add(textField, "14, 8, fill, default");
				textField.setColumns(10);
			}
			{
				JRadioButton rdbtnPlayer = new JRadioButton("1 Player, 1 AI");
				rdbtnPlayer.setActionCommand(onePlayerCommand);
				rdbtnPlayer.setSelected(true);
				rdbtnPlayer.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						player1 = new Player(true, PieceColor.WHITE);
						player2 = new Player(false, PieceColor.BLACK);
					}
				});
				buttonGroup.add(rdbtnPlayer);
				contentPanel.add(rdbtnPlayer, "2, 10");
			}
			{
				JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				contentPanel.add(separator, "8, 1, 1, 12");
			}
			{
				JLabel lblRows = new JLabel("# Rows");
				contentPanel.add(lblRows, "14, 10");
			}
			{
				JRadioButton rdbtnNoPlayers = new JRadioButton("No Players, 2 AIs");
				rdbtnNoPlayers.setActionCommand(noPlayerCommand);
				rdbtnNoPlayers.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("no players");
						player1 = new Player(false, PieceColor.WHITE);
						player2 = new Player(false, PieceColor.BLACK);
					}
				});
				buttonGroup.add(rdbtnNoPlayers);
				contentPanel.add(rdbtnNoPlayers, "2, 12");
			}
			{
				textField_1 = new JTextField("5");
				contentPanel.add(textField_1, "14, 12, fill, default");
				textField_1.setColumns(10);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							try{
								COLS = Integer.parseInt(textField.getText());
								ROWS = Integer.parseInt(textField_1.getText());
							}catch (java.lang.NumberFormatException e){
								JOptionPane.showMessageDialog(null, "# of Rows and Columns must be an odd number between 3 and 13");
								return;
							}
							if((ROWS % 2) == 1 && (COLS % 2) == 1 && ROWS >=3 && ROWS <= 13 && COLS >= 3 && COLS <=13){
								myBoard.newGame(ROWS, COLS, player1, player2);
								myBoard.repaint();
								dispose();
							}
							else JOptionPane.showMessageDialog(null, "# of Rows and Columns must be an odd number between 3 and 13");
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
						}
					});
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
			COLS = 9;
			ROWS = 5;
		}
	}
}

/* Since this dialog is only going to be used by the
 * Main Window I decided to move it here in this file.
 */
class AboutDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public AboutDialog() {
		setTitle("About");
		setResizable(false);
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		{
			JLabel lblNewLabel = new JLabel("Faronora Game for CSCE 315");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("By Team 03:");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Austin Dalton, Nathan Douthit, Miles Hickman");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new MigLayout("", "[54px][54px][54px][54px][][][][][54px][54px][54px][54px]", "[23px]"));
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 0 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 1 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 2 0,grow");
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setVerticalAlignment(SwingConstants.BOTTOM);
				buttonPane.add(okButton, "cell 6 0,grow");
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 8 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 9 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 10 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 11 0,grow");
			}
		}
	}

}
