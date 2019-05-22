package d12_reward;

import java.util.Scanner;

public class Answer {
	 public static void main(String[] args) {
	       System.out.println("请输入你创造的利润(单位：万元):");
	       Scanner scanner=new Scanner(System.in);
	    
	       while (!scanner.hasNextDouble()) {
	           System.out.println("请输入金额数字：");
	           scanner.next();         
	       }

	       double profit=scanner.nextDouble();

	       double bonus=0;

	       if (profit<=10) {
	           bonus=profit*0.1;
	      
	       }else if(profit<=20){
	           bonus=(profit-10)*0.075+1; 
	       
	       }else if (profit<=40 ) {
	           bonus=(profit-10)*0.05+1.75;   
	     
	       }else if (profit<=60 ) {
	           bonus=(profit-10)*0.03+2.75;   
	      
	       }else if (profit<=100 ) {
	           bonus=(profit-10)*0.015+3.35;  
	      
	       }else {
	           bonus=(profit-100)*0.01+3.95;
	       }
	       System.out.println(profit+"万元利润，可以获得："+bonus+"万元");
	       scanner.close();

	    }


}
