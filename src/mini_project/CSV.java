package mini_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class Contact{

	private String name;
	private String email;
	private String phone;
	public Contact() {
		
	}
	public Contact(String name, String email,String phone){
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPhone() {
		return this.phone;
	}
}
public class CSV {
	private static void writeTOCSV(ArrayList<Contact>list, String filename)  {
		try {
			FileOutputStream fos=new FileOutputStream(filename);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw=new BufferedWriter(osw);
			for(Contact contact : list) {
				StringBuffer oneLine=new StringBuffer();
				String name=contact.getName();
				String email=contact.getEmail();
				String phone=contact.getPhone();
				oneLine.append(name);
				oneLine.append(",");
				oneLine.append(email);
				oneLine.append(",");
				oneLine.append(phone);
				
				bw.write(oneLine.toString());
				bw.newLine();
			}
			bw.flush();
			bw.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static ArrayList<Contact> readCSV(String filename)throws IOException 
	{
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		int max=0;
		int min=0;
		int count=0;
		Contact max_ct=new Contact();
		Contact min_ct=new Contact();
		FileReader fr;
		try {
			fr=new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String line="";
			while((line = br.readLine() ) !=null) {
				System.out.println("::");
				System.out.println(line);
				String[] items =line.split(",");
				Contact ct= new Contact(items[0],items[1],items[2]);
				String phone=ct.getPhone();
				String[] numbers=phone.split("");
				int sum=0;
				for(String number:numbers) {
					int n=Integer.parseInt(number);
					sum+=n;
				}
				System.out.printf("sum of %s is %d",phone,sum);
				if(count==0) {
					max=sum;
					min=sum;
					max_ct=ct;
					min_ct=ct;
					
				}else {
					if(sum>max) {
						max=sum;
						max_ct=ct;
					}
					if(sum<min) {
						min=sum;
						min_ct=ct;
					}
				}
				++count;
				
			}
			System.out.printf("\nMax Number %s is with %s", max_ct.getPhone(),max_ct.getName());
			System.out.printf("\nMin Number %s is with %s", min_ct.getPhone(),min_ct.getName());
		} catch (Exception e) {
			System.out.println(e);
		}
		return contacts;
	}
	
	
	
	public static void main(String args[]) {
	
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		contactList.add(new Contact("ram","ram@gmail.com","9868620708"));
		contactList.add(new Contact("Hari","hari@gmail.com","986748484"));
		contactList.add(new Contact("Sita","sita@gmail.com","9864474843"));
		contactList.add(new Contact("Gautam","gautam@gmail.com","986843438"));
		contactList.add(new Contact("Srijana","sri@gmail.com","9874733838"));
		
		writeTOCSV(contactList,"contacts.csv");
		try {
			readCSV("contacts.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
