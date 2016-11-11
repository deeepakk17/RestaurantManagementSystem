package Restaurant;

import Customer.CustomerWindow;

import Window.MenuWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Restaurant extends JFrame implements ActionListener {

	private final String name="Armenian Food";
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
		menuPanel.setLayout(new GridLayout(4,1));
		menuPanel.add(menu);
		menuPanel.add(customer);
		menuPanel.add(order);
		menuPanel.add(item);
		add(menuPanel);
		item.addActionListener(this);
		customer.addActionListener(this);
		menu.addActionListener(this);
	}
	public static void main(String[] args) {

		new Restaurant();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(menu))
		{
			MenuWindow m=new MenuWindow();
		}
		else if(e.getSource().equals(customer))
		{
			CustomerWindow c=new CustomerWindow ();
		}
		else if(e.getSource().equals(item))
		{
			Window.ItemWindow itemWindow=new Window.ItemWindow();
		}
	}
}