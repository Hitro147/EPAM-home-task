package com.epam.epamassignment;
import java.util.*;

public class Giftbox {
	public static void main(String[] args)
	{
		int total_weight = 0,qnt = 0,wt = 0,totalbox_wt = 0,i=0,totwt=0;
		String s[]= {"Gems","kajukatli","Rasmalai","kitkat"};
		int[] a = new int[4];
        char n1;
        chocolates collect;
        Boolean n=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("select different chocolates which are given below");
        while(n)
        {
        	System.out.println("Available chocolates:");
        	System.out.println("1.Gems");
        	System.out.println("2.kajukatli");
        	System.out.println("3.Rasmalai");
        	System.out.println("4. kitkat");
        	System.out.println("Select from the above chocolates");
        	switch(sc.next().charAt(0))
        	{
        	case '1': System.out.println("Enter the quantity of Gems: ");
        			  qnt=sc.nextInt();
        			  System.out.println("Enter the weight in grams: ");
        			  wt=sc.nextInt();
        			  collect= new Gems();
        			  totwt=qnt*wt;
        			  total_weight=collect.totalwt( qnt, wt);
        			  totalbox_wt=totalbox_wt+total_weight;
        			  System.out.println("Total weight of the box:" + total_weight);
        			  a[0]+=totwt;
        			  
        			  totwt=0;
        			  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        			  System.out.println("do you want to add any other item (y/n)");
   	        	      n1=sc.next().charAt(0);
   	        	      if(n1=='y'|| n1=='Y')
   	        	        { 
   	        	    	  n=true;
   	        	          break;
   	        	        }
   	        	     else
   	        		    {
   	        	    	 n=false;
   	                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
   	                     break;
   	                    }
        	case '2': System.out.println("Enter the quantity of kajukatli: ");
			  qnt=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new kajukatli();
			  total_weight=collect.totalwt( qnt, wt);
			  a[1]+=qnt*wt;
			  totwt=0;
			  totalbox_wt=totalbox_wt+total_weight;
			  System.out.println("Total weight of the box:" + total_weight);
			  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
			  System.out.println("do you want to add any other item (y/n)");
     	      n1=sc.next().charAt(0);
     	      if(n1=='y'|| n1=='Y')
     	        { 
     	    	  n=true;
     	          break;
     	        }
     	     else
     		    {
     	    	 n=false;
                  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                  break;
                 }
     	      
        	case '3': System.out.println("Enter the quantity of Rasmalai: ");
			  qnt=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new Rasmalai();
			  total_weight=collect.totalwt( qnt, wt);
			  totalbox_wt=totalbox_wt+total_weight;
			  a[2]+=qnt*wt;
			  totwt=0;
			  System.out.println("Total weight of the box:" + total_weight);
			  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
			  System.out.println("do you want to add any other item (y/n)");
   	      n1=sc.next().charAt(0);
   	      if(n1=='y'|| n1=='Y')
   	        { 
   	    	  n=true;
   	          break;
   	        }
   	     else
   		    {
   	    	 n=false;
                System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                break;
               }	  
        	
        case '4': System.out.println("Enter the quantity of kitkat: ");
		  qnt=sc.nextInt();
		  System.out.println("Enter the weight in grams: ");
		  wt=sc.nextInt();
		  collect= new kitkat();
		  total_weight=collect.totalwt( qnt, wt);
		  a[3]+=qnt*wt;
		  totwt=0;
		  totalbox_wt=totalbox_wt+total_weight;
		  System.out.println("Total weight of the box:" + total_weight);
		  System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
		  System.out.println("do you want to add any other item (y/n)");
	      n1=sc.next().charAt(0);
	      if(n1=='y'|| n1=='Y')
	        { 
	    	  n=true;
	          break;
	        }
	     else
		    {
	    	 n=false;
            System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            break;
           }
	      default: System.out.println("Please select correct option from 1 to 4");
        }
        	
        }
        System.out.println("Enter the range in which you need to have total weights of the chocolates");
        int w=sc.nextInt();
        int k=sc.nextInt();
        
        for( i=0;i<=3;i++)
        {
        	if(a[i]<=k && a[i]>=w)
        	{
        		System.out.println(s[i]+" :" + a[i]+"\n");
        	}
        }
        sc.close();
	}
}
