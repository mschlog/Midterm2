//Matthew Schlogel
//Midterm 2
//Question 5
//______________________________________________________
//Imports
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//______________________________________________________
//Setting the ComboBox for the JFrame
public class DateComboBoxes extends JFrame {
String [] months = {
"January, 1 ",
"February, 2 ",
"March, 3 ",
"April, 4 ",
"May, 5 ",
"June, 6 ",
"July, 7 ",
"August, 8 ",
"September, 9 ",
"October, 10 ",
"November, 11 ",
"December, 12 "};
JComboBox MONTHS = new JComboBox(months);
//______________________________________________________
//Creating new labels
JLabel Month = new JLabel("      Month: ");
JLabel Date = new JLabel("      Date: ");
JLabel Year = new JLabel("      Year: ");
JPanel Panel = new JPanel();
//______________________________________________________
//Labels are added into ComboBox
public DateComboBoxes(){
	setLayout(new BorderLayout());
//______________________________________________________
	Panel.setLayout(new GridLayout(3, 3));
	Panel.add(Month);
	Panel.add(Date);
	Panel.add(Year);
//______________________________________________________
	add(MONTHS);
	add(Panel, BorderLayout.WEST);
//______________________________________________________	
// JFrame size set and action for closing window
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	pack();
//______________________________________________________
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 200);
	setLocationRelativeTo(null);
	}
//______________________________________________________
//Instantiates the ComboBox
public static void main(String [] args){
	DateComboBoxes ComboBox = new DateComboBoxes();
	}
//______________________________________________________
}