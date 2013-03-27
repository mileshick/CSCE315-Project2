import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewGameWindow extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final String twoPlayerCommand = "2";
	private final String onePlayerCommand = "1";
	private final String noPlayerCommand = "0";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NewGameWindow dialog = new NewGameWindow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
			buttonGroup.add(rdbtnPlayersNo);
			contentPanel.add(rdbtnPlayersNo, "2, 8");
		}
		{
			textField = new JTextField();
			contentPanel.add(textField, "14, 8, fill, default");
			textField.setColumns(10);
		}
		{
			JRadioButton rdbtnPlayer = new JRadioButton("1 Player, 1 AI");
			rdbtnPlayer.setActionCommand(onePlayerCommand);
			rdbtnPlayer.setSelected(true);
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
			buttonGroup.add(rdbtnNoPlayers);
			contentPanel.add(rdbtnNoPlayers, "2, 12");
		}
		{
			textField_1 = new JTextField();
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
	}
}
