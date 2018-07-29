import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginGui extends JFrame implements ActionListener{
	JFrame loginFrame = new JFrame("Login");
	JLabel lblUserId, lblPassword;
	JTextField txtUsreId, txtPassword;
	JButton btnLogin;
	
	public LoginGui() throws HeadlessException {
		lblUserId = new JLabel("User Id ");
		lblPassword = new JLabel("Password ");
		txtUsreId = new JTextField();
		txtPassword = new JTextField();
		btnLogin = new JButton("Login");
		
		lblUserId.setBounds(50, 50, 100, 50);
		lblPassword.setBounds(50, 100, 150, 50);
		btnLogin.setBounds(50, 200, 100, 20);
		txtUsreId.setBounds(200, 50, 80, 20);
		txtPassword.setBounds(200, 100, 80, 20);
		
		
		loginFrame.add(lblUserId);
		loginFrame.add(lblPassword);
		loginFrame.add(txtUsreId);
		loginFrame.add(txtPassword);
		loginFrame.add(btnLogin);
		
		btnLogin.addActionListener(this);
		
		loginFrame.setLayout(null);
		loginFrame.setSize(500, 300);
		loginFrame.setVisible(true);
	}
	
	/*public static void main(String[] args) {
		LoginGui lg = new LoginGui();
	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin){
			try {
				String id = txtUsreId.getText();
				String pd = txtPassword.getText();
				if(id.equals("admin") && pd.equals("admin")){
					JOptionPane.showMessageDialog(null, "Login Success");
					loginFrame.dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong User Id or Password.Try again");
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
