import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutGui extends JFrame{
	JFrame aboutFrame = new JFrame("About");
	JLabel lblAbout, lblContactUs;

	public AboutGui() throws HeadlessException {
		lblAbout = new JLabel("This is an Ecommerce Application");
		lblContactUs = new JLabel("Contact Us : nazmul.csejust@gmail.com");
		
		lblAbout.setBounds(50, 50, 200, 50);
		lblContactUs.setBounds(50, 100, 250, 50);
		
		aboutFrame.add(lblAbout);
		aboutFrame.add(lblContactUs);
		
		aboutFrame.setLayout(null);
		aboutFrame.setSize(500, 300);
		aboutFrame.setVisible(true);
	}
	
	/*public static void main(String[] args) {
		AboutGui abg = new AboutGui();
	}*/
}
