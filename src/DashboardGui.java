import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DashboardGui extends JFrame implements ActionListener{
	JFrame dashFrame = new JFrame("Dashboard");
	JLabel lbltopProduct , lbltotalSell;
	JTextField item1, item2, item3, item4, item5;
	
	DashboardGui() {
		
		lbltopProduct = new JLabel("Top Profitable Product");
		lbltotalSell = new JLabel("Totlal Product Sold");
		item1 = new JTextField();
		item2 = new JTextField();
		item3 = new JTextField();
		item4 = new JTextField();
		item5 = new JTextField();
		
		lbltopProduct.setBounds(50, 100, 50, 30);
		//item1.setBounds(50, 100, 150, 50);
		
		dashFrame.add(lbltopProduct);
		dashFrame.setSize(600, 400);
		dashFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		DashboardGui dbg = new DashboardGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
