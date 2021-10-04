package product;
import java.util.*;
import javax.swing.*;  
import java.awt.*;


public class product
{	Scanner input=new Scanner(System.in);   	
	String product_name,name;
        
	public product(String product_name,String name)
	{
		
		
		
		this.product_name=product_name;
		this.name=name;
		if(product_name.equals("shampoo"))
			shampoo(name);
		if(product_name.equals("milk"))
			milk(name);
		if(product_name.equals("book"))
			book(name);
			
	}
	double total=0,rate;
	public  void shampoo(String name)
	{
		
		if(name.equals("chik"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("chik.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tCHIK"+"\n"+"\t\tMRP :RS 70.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
				System.out.println("order placed 😊️ ");
				frame.setVisible(false);
			
			//rate=1;
			//c.store(name,rate);
			//total=total+rate;
		}
		if(name.equals("clinic+"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("clinic+.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tCLINIC+"+"\n"+"\t\tMRP :RS 2.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
				System.out.println("order placed 😊️ ");
				frame.setVisible(false);
			
			rate=2;	
			//c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("sunsilk"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("sunsilk.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tSUNSILK"+"\n"+"\t\tMRP :RS 3.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
				System.out.println("order placed 😊️ ");
				frame.setVisible(false);			

			
			rate=3;
			//c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("meera"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("meera.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tMEERA"+"\n"+"\t\tMRP :RS 4.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);			

			
			rate=4;
			//c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("dove"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("dove.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tDOVE"+"\n"+"\t\tMRP :RS 5.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
				System.out.println("order placed 😊️ ");
				frame.setVisible(false);			
		
			
			rate=5;
			//c.store(name,rate);
			total=total+rate;
		}
	}
	public  void milk(String name)
	{
		if(name.equals("aavin"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("aavin.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("AAVIN"+"\n"+"MRP :RS 23.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);			
			
			rate=23;
			//c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("arokya"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("arokya.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tAROKYA"+"\n"+"\t\tMRP :RS 27.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);		
			rate=27;
			//c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("amul"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("Amul.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tAMUL"+"\n"+"\t\tMRP :RS 30.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);		
			rate=30;
			//c.store(name,rate);
			total=total+rate;
		}
	}
	public  void book(String name)
	{
		if(name.equals("wings_of_fire"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("apj.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tWINGS_OF_FIRE"+"\n"+"\t\tMRP :RS 233.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);		
			rate=233;
			//c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("core_java"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("java.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tCORE_JAVA"+"\n"+"\t\tMRP :RS 270.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);		
			rate=270;
			total=total+rate;
		}
		if(name.equals("python"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("python.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tPYTHON"+"\n"+"\t\tMRP :RS 330.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
				System.out.println("order placed 😊️ ");
				frame.setVisible(false);		
			rate=330;
			//c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("c_fundamendals"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("Cbook.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tC_FUNDAMENDALS"+"\n"+"\t\tMRP :RS 380.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);		
			
			rate=380;
		//	c.store(name,rate);
			total=total+rate;
		}
		if(name.equals("staring_how_we_look"))
		{
			JFrame frame = new JFrame("product");  
        		JPanel panel = new JPanel();  
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon=new ImageIcon("staring.jpg");
			JLabel label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);
			frame.pack();
	                frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			System.out.println("\t\tSTARING_HOW_WE_LOOK"+"\n"+"\t\tMRP :RS 330.00");
			System.out.print("enter 1 to buy : ");
			int buy=input.nextInt();
			if(buy==1)
			System.out.println("order placed 😊️ ");
				frame.setVisible(false);		
			
			rate=330;
			//c.store(name,rate);
			total=total+rate;
		}
		
	}
	
}

