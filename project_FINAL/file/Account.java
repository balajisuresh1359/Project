package file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.File;
import java.util.*;
import java.lang.*;
public class Account implements Serializable{
	 private String name,filename;
   	 private int id;
    public  Account(String name, int id,String filename){
        this.name = name;
        this.id = id;
	this.filename=filename;
    }
     public Account()
	{
		System.out.println();
	}
    public String toString(){
      
	return "Name :"+name+"\n"+"Id :"+id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 	public String getfilename() {
        return filename;
    }
 
    public void setfileName(String filename) {
        this.filename = filename;
    }
    public  int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
	
	public  void  storeObject( Account emp){
		System.out.println();
		OutputStream ops = null;
		ObjectOutputStream objOps = null;
		
		try {
			
			ops = new FileOutputStream(getfilename());
			objOps = new ObjectOutputStream(ops);
			objOps.writeObject(emp);
			objOps.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{
				if(objOps != null) objOps.close();
			} catch (Exception ex){
				
			}
		}
		
	}
	
	public  void displayObjects(){
		InputStream fileIs = null;
		ObjectInputStream objIs = null;
		try {
			fileIs = new FileInputStream(getfilename());
			objIs = new ObjectInputStream(fileIs);
			 Account emp = ( Account) objIs.readObject();
			System.out.println("Account was created!"+"\n"+"Your profile  :");
			System.out.println(emp);
			Account e=(Account)emp;
			System.out.println("Welcome "+e.name);
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(objIs != null)
				 objIs.close();
			} catch (Exception ex){
				
			}
		}
		
	}
     
	public static void find(String name)
	{
		File temp= new File(name);
		if(temp.exists())
			{
			InputStream fileIs = null;
			ObjectInputStream objIs = null;
			try {
				fileIs = new FileInputStream(name);
				objIs = new ObjectInputStream(fileIs);
				 Account emp = ( Account) objIs.readObject();
				Account e=(Account)emp;
				System.out.println("HELLO "+e.name);
				} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				e.printStackTrace();
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			finally 
			{
				try 
				{
					if(objIs != null)
					 objIs.close();
				} 
				catch (Exception ex){}
			}	
		}
		else
		{
			System.out.println("NO SUCH DATA.....");
			System.exit(0);	
		}
	}   
}