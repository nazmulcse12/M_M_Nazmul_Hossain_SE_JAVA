import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DashboardGui extends JFrame implements ActionListener{
	JFrame dashFrame = new JFrame("Dashboard");
	JLabel lblTopProduct , lblTotalSell, lblTopProducts;
	
	ProductDao pdao;
	int totalsell=0;
	ArrayList<String> topProducts;
	String topProductsName="";
	public DashboardGui() throws HeadlessException {
		
		try {
			pdao = new ProductDao();
			totalsell = pdao.getTotalSell();
			topProducts = new ArrayList<>();
			topProducts = pdao.getTopProducts();
			for(String s : topProducts){
				s+="  ";
				topProductsName += s;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		lblTotalSell = new JLabel("Totlal Product Sold= "+totalsell);
		lblTopProduct = new JLabel("Top Profitable Product");
		lblTopProducts = new JLabel();
		
		lblTotalSell.setBounds(50, 50, 200, 20);
		lblTopProduct.setBounds(50, 100, 200, 20);
		lblTopProducts.setBounds(50, 150, 200, 100);
		
		dashFrame.add(lblTopProduct);
		dashFrame.add(lblTotalSell);
		dashFrame.add(lblTopProducts);
		
		lblTopProducts.setText(topProductsName);
		
		dashFrame.setLayout(null);
		dashFrame.setSize(500, 300);
		dashFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		DashboardGui dbg = new DashboardGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
}
