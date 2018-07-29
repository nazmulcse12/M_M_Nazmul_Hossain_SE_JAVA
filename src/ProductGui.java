import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ProductGui extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Ayons Ecommerce");
	JButton btnDashboard, btnView, btnAdd, btnUpdate, btnDelete, btnAbout ;
	
	ProductGui(){
		
		btnDashboard = new JButton("Dashboard");
		btnView = new JButton("View Product");
		btnAdd = new JButton("Add Product");
		btnUpdate = new JButton("Update Product");
		btnDelete = new JButton("Delete Product");
		btnAbout = new JButton("About");
		
		btnDashboard.setBounds(50, 100, 150, 50);
		btnView.setBounds(200, 100, 150, 50);
		btnAdd.setBounds(350, 100, 150, 50);
		btnUpdate.setBounds(500, 100, 150, 50);
		btnDelete.setBounds(650, 100, 150, 50);
		btnAbout.setBounds(800, 100, 150, 50);
		
		frame.add(btnDashboard);
		frame.add(btnView);
		frame.add(btnAdd);
		frame.add(btnUpdate);
		frame.add(btnDelete);
		frame.add(btnAbout);
		
		btnDashboard.addActionListener(this);
		
		frame.setSize(1000, 400);
		frame.setVisible(true);	
		
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
		
	}

}
