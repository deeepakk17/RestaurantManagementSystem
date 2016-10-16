package Restaurant;

import java.awt.*;

import javax.swing.*;

public class Restaurant extends JFrame {
   
	private final String name="Martuni Mot";
	private JButton menu ;
	private JButton customer ;
	private JButton order;
	private JButton item;
	private JPanel  menuPanel;
	public Restaurant()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.getHeight();
		int x=dim.width*8/10;
		int y=dim.height*9/10;
		this.setLocation(dim.width/2-x/2, dim.height/2-y/2);
		dim.setSize(x, y);
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(dim);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setTitle(name);;
		initButtons();
	}
	public void initButtons()
	{
		menu    =new JButton("Menu");
		menu.setPreferredSize(new Dimension(150,40));
		customer=new JButton("Customers");
		customer.setPreferredSize(new Dimension(150,40));
		order   =new JButton("Orders");
	    order.setPreferredSize(new Dimension(150,40));
		item    =new JButton("Items");
		item.setPreferredSize(new Dimension(150,40));
		menuPanel=new JPanel();
		menuPanel.setLayout(new GridLayout(2,2));
		menuPanel.add(menu);
		menuPanel.add(customer);
		menuPanel.add(order);
		menuPanel.add(item);
		add(menuPanel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new Restaurant();
	}
}
