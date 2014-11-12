//Matthew Schlogel
//Midterm2 Password Demo
//Question 33 out of Midterm2
//__________________________________________________________________
//Imports
//__________________________________________________________________

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//__________________________________________________________________
public class PasswordDemo extends JPanel implements ActionListener {
//__________________________________________________________________
    private JFrame controllingFrame; 
    private JPasswordField passwordField;
	private static String OK = "Okay";
    private static String HELP = "Help";
//__________________________________________________________________
//Creating my JFrame    
    public PasswordDemo(JFrame frame) {
        controllingFrame = frame;
        JLabel label = new JLabel("Enter The Password: ");
        label.setLabelFor(passwordField);
        passwordField = new JPasswordField(11);
        passwordField.setActionCommand(OK);
        passwordField.addActionListener(this);
        
//__________________________________________________________________
//Where you put the password into
        JComponent buttonPane = createButtonPanel();
        JPanel textPane = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        textPane.add(label);
        textPane.add(passwordField);
        add(textPane);
        add(buttonPane);
    }
//__________________________________________________________________
//Adding the OK and Help buttons onto the GUI
    protected JComponent createButtonPanel() {
        JPanel p = new JPanel(new GridLayout(0,1));
        JButton okButton = new JButton("OK");
        JButton helpButton = new JButton("Help");
        okButton.setActionCommand(OK);
        helpButton.setActionCommand(HELP);
        okButton.addActionListener(this);
        helpButton.addActionListener(this);
        p.add(okButton);
        p.add(helpButton);
        return p;
    }
//__________________________________________________________________
//Creating instance for when OK is selected.       
    public void actionPerformed(ActionEvent e) {
        String x = e.getActionCommand();
        if (OK.equals(x)) { 
            char[] input = passwordField.getPassword();
            if (correctPass(input)) {
                JOptionPane.showMessageDialog(controllingFrame, "Correct password.");
            } else {
                JOptionPane.showMessageDialog(controllingFrame,"Incorrect password ","Error ",JOptionPane.ERROR_MESSAGE);
            }
            for (int i = 0; i < input.length; i++) {
            	input[i] = 0;
            }
            passwordField.selectAll();
            resetFocus();
        } else { 
            JOptionPane.showMessageDialog(controllingFrame,"Password is on the Second Midterm");
        }
    }
//__________________________________________________________________   

//Parameters for the correct password
    private static boolean correctPass(char[] input) {
        boolean isCorrect = true;
        //"bugaboo" is the correct password for the GUI
        char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] != correctPassword[i]) {
                    isCorrect = false;
                }
            }
        }
        for (int i = 0; i < correctPassword.length; i++) {
            correctPassword[i] = 0;
        }
        return isCorrect;
    }
    protected void resetFocus() {
        passwordField.requestFocusInWindow();
    }
//__________________________________________________________________
//Instantiates the GUI, and runs it to apply the password.
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("PasswordDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final PasswordDemo newContentPane = new PasswordDemo(frame);
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);
        frame.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent e) {
                newContentPane.resetFocus();
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
//__________________________________________________________________
//Main method    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
//__________________________________________________________________