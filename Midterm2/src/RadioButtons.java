//Matthew Schlogel
//MidTerm2
//Question3
//_____________________________________________________
//Imports
import java.awt.*;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//_____________________________________________________
//Main Method
public class RadioButtons extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtons frame = new RadioButtons();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		);
	}
//_____________________________________________________
//Sets the Frame for the buttons
	public RadioButtons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//_____________________________________________________		
//Small button, placed top middle of the frame
		JRadioButton B1 = new JRadioButton("   Small ");
		B1.setBounds(25, 25, 100, 25);
		contentPane.add(B1);
//_____________________________________________________		
//Medium Button, placed middle center of the frame
		JRadioButton B2 = new JRadioButton("   Medium ");
		B2.setBounds(25, 75, 100, 25);
		contentPane.add(B2);
//_____________________________________________________
//Large Button, places middle bottom of the frame
		JRadioButton B3 = new JRadioButton("   Large ");
		B3.setBounds(25, 125, 100, 25);
		contentPane.add(B3);
//_____________________________________________________
//Setting the ButtonGroup
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(B1);
		buttonGroup.add(B2);
		buttonGroup.add(B3);
		B1.setSelected(true);
	}
//Code instantiates the GUI with 3 buttons on the panel labeled small, medium, and large to which small is set as default.
}