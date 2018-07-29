import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ProductGui extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Ayons Ecommerce");
	JButton btnDashboard, btnView, btnAdd, btnUpdate, btnDelete, btnAbout, btnLogin;
	int login = 0;
	
	public ProductGui(){
		
		btnDashboard = new JButton("Dashboard");
		btnView = new JButton("View Product");
		btnAdd = new JButton("Add Product");
		btnUpdate = new JButton("Update Product");
		btnDelete = new JButton("Delete Product");
		btnAbout = new JButton("About");
		btnLogin = new JButton("Login");
		
		btnDashboard.setBounds(50, 100, 150, 50);
		btnView.setBounds(200, 100, 150, 50);
		btnAdd.setBounds(350, 100, 150, 50);
		btnUpdate.setBounds(500, 100, 150, 50);
		btnDelete.setBounds(650, 100, 150, 50);
		btnAbout.setBounds(800, 100, 150, 50);
		btnLogin.setBounds(950, 100, 150, 50);
		
		frame.add(btnDashboard);
		frame.add(btnView);
		frame.add(btnAdd);
		frame.add(btnUpdate);
		frame.add(btnDelete);
		frame.add(btnAbout);
		frame.add(btnLogin);
		
		btnDashboard.addActionListener(this);
		btnView.addActionListener(this);
		btnAdd.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		btnAbout.addActionListener(this);
		btnLogin.addActionListener(this);
		
		frame.setLayout(null);
		frame.setSize(1200, 400);
		frame.setVisible(true);	
		
	}
	
	public int testLogin(int i){
		login = i;
		return login;
		
	}

	public static void main(String[] args) {
		ProductGui pg = new ProductGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnDashboard){
			try {
				DashboardGui dbg = new DashboardGui();
			} catch (Exception e1) {
				System.out.println(e1.toString());
			}
		}
		else if(e.getSource()==btnAbout){
			try {
				AboutGui abg = new AboutGui();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		else if(e.getSource()==btnLogin){
			if(login == 1){
				JOptionPane.showMessageDialog(null, "You are Logged in");
			}
			else{
				LoginGui lg = new LoginGui();
			}
		}
		
	}

}
