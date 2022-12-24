import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Swing implements ActionListener{
	
	static JFrame frame;
	static JPanel panel;
	static JLabel userLabel;
	static JTextField userText;
	static JLabel passwordLabel;
	static JPasswordField passwordText;
	static JButton loginButton;
	static JLabel successText;

	public static void main(String[] args) {
		
		frame = new JFrame("Netflix");
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.add(panel);
		
		placeComponents(panel);
		
		frame.setVisible(true);
	}
	
	static void placeComponents(JPanel panel) {
		panel.setLayout(null);
		userLabel = new JLabel("User");
		
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		loginButton = new JButton("login");
		loginButton.setBounds(10,80,80,25);
		loginButton.addActionListener(new Swing());
		panel.add(loginButton);
		
		successText = new JLabel("");
		successText.setBounds(10, 110, 300, 25);
		panel.add(successText);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if(user.equals("Aakash") && password.equals("java")) {
			successText.setText("Login Successfull!!");
		}else {
			successText.setText("Invalid Credentials!!");
		}
		
	}

}
