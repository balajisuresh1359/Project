import product.product;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import file.*;
import java.io.File;

class Productmain
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice;
		String user_inp;int user_type;
		System.out.println("\t\t\tFLIPoZON");
		JFrame frame = new JFrame("FLIPoZON");  
        	JPanel panel = new JPanel();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon=new ImageIcon("01.jpg");
		JLabel label = new JLabel(icon);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	        frame.setLocationRelativeTo(null);  
		frame.setVisible(true);
		
  		int id;String name,filename;
		System.out.print("1 --SIGNUP\n2 --LOGIN\n");
			choice=input.nextInt();
		
		if(choice==1)
			{
					System.out.println("Enter name");
					name=input.next();
					Random rand1 = new Random();      
      					id=rand1.nextInt(11);
					System.out.println("YOUR ID NUMBER IS "+id);
					filename=id+".txt";
					Account e1 = new  Account(name,id,filename);
					e1.storeObject(e1);
					e1.displayObjects();					
			}
		if(choice==2)
			{	
				System.out.print("ENTER login id :");
				id=input.nextInt();
				filename=id+".txt";
				Account.find(filename);
			}
		String[] barray={"wings_of_fire","core_java","python","c_fundamendals","staring_how_we_look"};
		String[] sarray={"meera","dove","sunsilk","clinic+","chik"};
		String[] marray={"aavin","arokya","amul"};
		float bparray[]={400,300,300,350,500};
		float[] sparray={50,200,100,80,40};
		float[] mparray={30,40,50};
		ArrayList<String> productlist=new ArrayList<String>();
		ArrayList<Float> pricelist=new ArrayList<Float>();
		while(true)
		{
			while(true)
			{
	
			System.out.print("1 --Books\n2 --shampoo\n3 --milk\nenter type  : ");
				user_type=input.nextInt();
				if(user_type>=1&&user_type<=3)
					break;
				System.out.println("\n\n[enter correct choice]\n\n");
			}
			while(true)
			{
				System.out.print("enter name product : ");
					user_inp=input.next();
				if(user_type==1)
				{
					for(int i=0;i<barray.length;i++)
					{
						if(barray[i].equals(user_inp))
						{
						product usproduct=new product("book",user_inp);
						System.out.print("product conformation[y/n]  : ");
							char ch=input.next().charAt(0);
						if(ch=='y')
						{
							productlist.add(user_inp);
							pricelist.add(bparray[i]);
						}
						
						break;
						}
						else if(i+1==barray.length)
						{
						System.out.println(user_inp+" is not available here");
						}
			
					}
			
			

				}
				else if(user_type==2)
				{
					for(int i=0;i<sarray.length;i++)
					{
						if(sarray[i].equals(user_inp))
						{
							product usproduct=new product("shampoo",user_inp);
							System.out.print("product conformation[y/n]  : ");
								char ch=input.next().charAt(0);
							if(ch=='y')
							{
								productlist.add(user_inp);
								pricelist.add(sparray[i]);
							}
							break;
						}
						else if(i+1==sarray.length)
						{
						System.out.println(user_inp+" is not available here");
						}
			
					}
			
			

				}
				if(user_type==3)
				{
					for(int i=0;i<marray.length;i++)
					{
						if(marray[i].equals(user_inp))
						{
							product usproduct=new product("milk",user_inp);
							System.out.print("product conformation[y/n]  : ");
								char ch=input.next().charAt(0);
							if(ch=='y')	
							{					
								productlist.add(user_inp);
								pricelist.add(mparray[i]);
							}
							break;
							
						}
						else if(i+1==marray.length)
						{
						System.out.println(user_inp+" is not available here");
						}
			
					}
			
			

				}
				System.out.print("To search other products of same type enter 1  : ");
					int again=input.nextInt();
				if(again!=1)
					break; 
			}
			System.out.print("To search other products of different type enter 1 : ");
					int again=input.nextInt();
				if(again!=1)
					break; 
			
		}
		
		System.out.print("Do you want to display the products that ordered now enter 1 : ");
			int disvar=input.nextInt();
		System.out.println("ORDER'S WILL BE DELIVERED SOON!!!");
		if(disvar==1)
		{
			
			float total=0;
				System.out.println("\t\tproducts | price ");
					System.out.println("--------------------------------------------------");
			for(int i=0;i<productlist.size();i++)
			{
				
				
				System.out.print(productlist.get(i)+"\t\t \t\t:  ");
				System.out.println(pricelist.get(i));
				total+=pricelist.get(i);
				
			}	System.out.println("--------------------------------------------------");

				System.out.println("\t\t\t Total :  "+total);
				System.out.println("thanks for visiting\nhave a great day");
				
		}
		JFrame framep = new JFrame(" LUCKY PRIZE.....");  
        	JPanel panelp = new JPanel();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon iconp=new ImageIcon("prize.jpg");
		JLabel labelp= new JLabel(iconp);
		panelp.add(labelp);
		framep.add(panelp);
		framep.pack();
	        framep.setLocationRelativeTo(null);  
		framep.setVisible(true);
		int luck;
		System.out.println("Enter your luckly number [0-10]");
		luck=input.nextInt();
		Random rand1 = new Random();      
      		int rand=rand1.nextInt(11);
		if(rand!=luck)
		{
				JFrame frame11 = new JFrame("BETTER LUCK NEXT TIME.....");  
        			JPanel panel11 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon11=new ImageIcon("next.jpg");
				JLabel label11 = new JLabel(icon11);
				panel11.add(label11);
				frame11.add(panel11);
				frame11.pack();
	            		frame11.setLocationRelativeTo(null);  
				frame11.setVisible(true);
		}
		if(rand==luck)
		{
			System.out.println("Collect your prize.....");
			if(rand==1)
			{
				JFrame frame1 = new JFrame("COCONUT OIL");  
        			JPanel panel1 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon1=new ImageIcon("free1.jpg");
				JLabel label1 = new JLabel(icon1);
				panel1.add(label1);
				frame1.add(panel1);
				frame1.pack();
	            		frame1.setLocationRelativeTo(null);  
				frame1.setVisible(true);
			}
			if(rand==2)
			{
				JFrame frame2 = new JFrame("FANTA");  
        			JPanel panel2 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon2=new ImageIcon("free2.jpg");
				JLabel label2 = new JLabel(icon2);
				panel2.add(label2);
				frame2.add(panel2);
				frame2.pack();
	           		frame2.setLocationRelativeTo(null);  
				frame2.setVisible(true);
			}
			if(rand==3)
			{
				JFrame frame3 = new JFrame("CREME BETWEENS");  
        			JPanel panel3 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon3=new ImageIcon("free3.jpg");
				JLabel label3 = new JLabel(icon3);
				panel3.add(label3);
				frame3.add(panel3);
				frame3.pack();
	            		frame3.setLocationRelativeTo(null);  
				frame3.setVisible(true);
			}
			if(rand==4)
			{
				JFrame frame4 = new JFrame("COLA");  
        			JPanel panel4 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon4=new ImageIcon("free4.jpg");
				JLabel label4 = new JLabel(icon4);
				panel4.add(label4);
				frame4.add(panel4);
				frame4.pack();
	            		frame4.setLocationRelativeTo(null);  
				frame4.setVisible(true);
			}
			if(rand==5)
			{
				JFrame frame5 = new JFrame("AIRA");  
        			JPanel panel5 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon5=new ImageIcon("free5.jpg");
				JLabel label5 = new JLabel(icon5);
				panel5.add(label5);
				frame5.add(panel5);
				frame5.pack();
	            		frame5.setLocationRelativeTo(null);  
				frame5.setVisible(true);
			}
			if(rand==6)
			{
				JFrame frame6 = new JFrame("M&Ms");  
        			JPanel panel6 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon6=new ImageIcon("free6.jpg");
				JLabel label6 = new JLabel(icon6);
				panel6.add(label6);
				frame6.add(panel6);
				frame6.pack();
	            		frame6.setLocationRelativeTo(null);  
				frame6.setVisible(true);
			}
			
			if(rand==7)
			{
				JFrame frame7 = new JFrame("NUTRI CHOICE");  
        			JPanel panel7 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon7=new ImageIcon("free7.jpg");
				JLabel label7 = new JLabel(icon7);
				panel7.add(label7);
				frame7.add(panel7);
				frame7.pack();
	            		frame7.setLocationRelativeTo(null);  
				frame7.setVisible(true);
			}
			if(rand==8)
			{
				JFrame frame8 = new JFrame("ALL OUT");  
        			JPanel panel8 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon8=new ImageIcon("free8.jpg");
				JLabel label8 = new JLabel(icon8);
				panel8.add(label8);
				frame8.add(panel8);
				frame8.pack();
	            		frame8.setLocationRelativeTo(null);  
				frame8.setVisible(true);
			}
			if(rand==9)
			{
				JFrame frame9= new JFrame("ICE CREAM");  
        			JPanel panel9 = new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon9=new ImageIcon("free9.jpg");
				JLabel label9 = new JLabel(icon9);
				panel9.add(label9);
				frame9.add(panel9);
				frame9.pack();
	            		frame9.setLocationRelativeTo(null);  
				frame9.setVisible(true);
			}
			if(rand==10)
			{
				JFrame frame10= new JFrame("LAYS");  
        			JPanel panel10= new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon10=new ImageIcon("free10.jpg");
				JLabel label10 = new JLabel(icon10);
				panel10.add(label10);
				frame10.add(panel10);
				frame10.pack();
	            		frame10.setLocationRelativeTo(null);  
				frame10.setVisible(true);
			}
		}
				System.out.println("RATE THIS PROJECT.....");
				String rate=input.next();
				JFrame frame101= new JFrame("C");  
        			JPanel panel101= new JPanel();  
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon101=new ImageIcon("end.jpg");
				JLabel label101 = new JLabel(icon101);
				panel101.add(label101);
				frame101.add(panel101);
				frame101.pack();
	            		frame101.setLocationRelativeTo(null);  
				frame101.setVisible(true);
				frame.setVisible(false);
				
	}
	
}
