package d12_reward;

import java.util.Scanner;

public class Answer {
	 public static void main(String[] args) {
	       System.out.println("�������㴴�������(��λ����Ԫ):");
	       Scanner scanner=new Scanner(System.in);
	    
	       while (!scanner.hasNextDouble()) {
	           System.out.println("�����������֣�");
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
	       System.out.println(profit+"��Ԫ���󣬿��Ի�ã�"+bonus+"��Ԫ");
	       scanner.close();

	    }


}
