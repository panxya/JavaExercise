package d13_cal;

public class Answer {
	  public static void main(String[] args) {

	       for (int i = 0; i <10000;i++) {

	           int num1=(int)Math.sqrt(i+100);//������ֵ�ѹ̶���

	           int num2=(int)Math.sqrt(i+268);

	           if ((num1*num1==(i+100))&&(num2*num2==(i+268))) {//���������Ĵ�ӡ����

	              System.out.println(i+"  ");

	           }

	       }

	    }

}
