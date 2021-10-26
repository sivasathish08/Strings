package org.stringtypes;

import java.util.Scanner;

public class StringTypes {
	public static void main(java.lang.String[] args) {
		String s1,s2,s3,s4,s5;
		s1="GreensTechnology";
		s2="SeleniumAutomationtool";
		s3="velmurugan";
		s4="j a v a p r o g r a m";
		s5="9095484678";
		/*System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		System.out.println(s5.length());
       
	    int a1=s1.lastIndexOf('o');
	    int a2=s2.indexOf('o');
	    int a3=s3.indexOf('n');
	    int a4=s4.lastIndexOf(' ');
	    int a5=s5.indexOf("8");
	    System.out.println(" \"o\"th position : "+a1);
	    System.out.println(" \"o\"th position : "+a2);
	    System.out.println(" \"n\"th position : "+a3);
	    System.out.println(" \" \"th position : "+a4);
	    System.out.println(" \"8\"th position : "+a5);
	    
		for(int i=s1.indexOf("h");i<=s1.lastIndexOf("h");i++)
		{
			char ch=s1.charAt(i);
			if('h'==ch) {
			System.out.print(ch);
			}
			
		}
		System.out.println(" ");
		for(int i=s2.indexOf("o");i<=s2.lastIndexOf("o");i++)
		{
			char ch=s2.charAt(i);
			if('o'==ch) {
				System.out.print(ch);
				}
			
		}
		System.out.println(" ");
		for(int i=s3.indexOf("u");i<=s3.lastIndexOf("u");i++)
		{
			char ch=s3.charAt(i);
			if('u'==ch) {
				System.out.print(ch);
				}
			
		}
		System.out.println(" ");
		for(int i=s4.indexOf("p");i<=s3.lastIndexOf("p");i++)
		{
			char ch=s4.charAt(i);
			if('p'==ch) {
				System.out.print(ch);
				}
			
		}
		System.out.println(" ");
		for(int i=s5.indexOf("7");i<=s5.lastIndexOf("7");i++)
		{
			char ch=s5.charAt(i);
			if('7'==ch) {
				System.out.print(ch);
				}
			
		}
		
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		for (int i=0;i<2;i++)
		{
		s1=scan1.next();
		s2=scan2.next();
		boolean b1=s1.equalsIgnoreCase(s2);
		System.out.println("result:"+b1);
		}
		
		Scanner scan=new Scanner(System.in);
		String ss1=scan.next();
		for(int i=0;i<=ss1.length()-1;i++)
		{
			char ch=ss1.charAt(i);
			if('@'==ch) {
			System.out.println(" Email Valid");
			break;
			}
			
			
		}
		
		Scanner scan=new Scanner(System.in);
		String ss1=scan.nextLine();
		
		
			
			boolean b1=ss1.contains("pincode");
			if(b1){
				System.out.println("valid address");	
				
			}
			else {
			System.out.println("invalid address");
		
			}
		
		Scanner scan=new Scanner(System.in);
		String a1=scan.nextLine();
		
		boolean b1=a1.contains("@");
		System.out.println(b1);
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(" not Valid");
			System.exit(0);
			}
			
			
		}
		
		System.out.println(" valid");
		
		}
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(" not Valid");
			System.exit(0);
			}
			
			
		}
		
		if(10>=s.length())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");	
		}
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		System.out.println(s.replace("java","sql"));
		
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		System.out.println(s.replace("Adayar","Omr"));
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		System.out.println(s.replace(" ","@"));
		 
		
		}
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int l=s.indexOf(",pincode");
		
	    String ss=s.substring(0,l);
	    System.out.println(ss);
	    
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		
	   
	    System.out.println(s.toLowerCase());
	    
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		
	   
	    System.out.println(s.toUpperCase());
	    
		Scanner scan=new Scanner(System.in);
		        int uppercount=0,lowercount=0;
		            
		        String str1= scan.nextLine();
		        StringBuffer newStr=new StringBuffer(str1);    
		            
		        for(int i = 0; i < str1.length(); i++) {    
		                
		              
		            if(Character.isLowerCase(str1.charAt(i))) {    
		                  
		                uppercount++;   
		            }    
		           
		            else if(Character.isUpperCase(str1.charAt(i))) {    
		                    
		                lowercount++;   
		            }    
		        }    
		        System.out.println("Upper Count : " + uppercount);
		        System.out.println("lower Count : " + lowercount);
		        
		        
		Scanner scan=new Scanner(System.in);
		String str1= scan.nextLine();
		
		boolean b=str1.startsWith("Welcome");
		System.out.println(b);
		
		
		Scanner scan=new Scanner(System.in);
		String str1= scan.nextLine();
		
		boolean b=str1.endsWith("java");
		System.out.println(b);
		
		
		
		
		Scanner scan=new Scanner(System.in);
		String str1=" ";
		System.out.println(str1.isEmpty());
		
		
		
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		String s01=scan1.next();
		String s02=scan2.next();
		
		int i1=s01.compareTo(s02);
        System.out.println(i1);
		
		*/
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		String s01="Nisha";
		String s02="Rengan";
		String s03="NishaRengan";
		
		System.out.println("Literal string");
		System.out.println(System.identityHashCode(s01));
		System.out.println(System.identityHashCode(s02));
		System.out.println(System.identityHashCode(s03));
		
		
		String ss01=new String("Nisha");
		String ss02=new String("Rengan");
		String ss03=new String("Rengan");
		
		System.out.println("non Literal string");
		System.out.println(System.identityHashCode(ss01));
		System.out.println(System.identityHashCode(ss02));
		System.out.println(System.identityHashCode(ss03));
	
		
	}

}


