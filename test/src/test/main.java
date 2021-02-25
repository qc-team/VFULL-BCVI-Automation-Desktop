package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		String str[]=new String [3] ;
		int no[] = new int [3];
        for(int i=0;i<3;i++){
            String s1=scan.next();
            int x=scan.nextInt();
            //Complete this line
            if(s1.length()<10)
            	str[i]=s1;
            if(x>=0 && x <= 999)
            	no[i]= x;
            
        }
        System.out.println("================================");
        int max=0;
        for(int i=0 ; i < 3 ; i++)
        {
        	if(no[i]<100)
        	{
        		System.out.print(str[i]);
        		int temp = 0 ;
        		if(i > 0)
        			if(str[i].length()>str[i-1].length())
        			{
        				if(str[i-1].length()>max)
        				temp=str[i].length()-str[i-1].length();
        				else
        				temp=str[i].length()-max;
        			max=str[i].length();
        			}
        			else if(str[i-1].length()>str[i].length())
        				{
        				if(str[i].length()>max)
        				temp=str[i-1].length()-str[i].length();
        				else
        					temp=str[i-1].length()-max;
        				max=str[i-1].length();
        				}
        			else
        				temp=0;
        		for(int j = 0 ; j < temp+15 ; j ++)
        			System.out.print(" ");
        		System.out.println("0"+no[i]);
        		
        	}
        	else
        	{
        		System.out.print(str[i]);
        		int temp = 0 ;
        		if(i > 0)
        			if(str[i].length()>str[i-1].length())
        			temp=str[i].length()-str[i-1].length();
        			else if(str[i-1].length()>str[i].length())
        				temp=str[i-1].length()-str[i].length();
        			else
        				temp=0;
        		for(int j = 0 ; j < temp+15 ; j ++)
        			System.out.print(" ");
        		System.out.println(no[i]);
        	        	}	
        }
        System.out.println("================================");


	}

}
