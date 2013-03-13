import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JInternalFrame;
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
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
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
