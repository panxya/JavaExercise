package d14_judge_days;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {

        System.out.println("�����������գ��ÿո��������");

        Scanner scanner=new Scanner(System.in);

        int year=scanner.nextInt();//��ȡ���

        int month=scanner.nextInt();//��ȡ�·�

        int day=scanner.nextInt();//��ȡ����

        int sum=0;//�����ܺ�

        //����һ�������·����������飬�Ȱ�С����㣬��������꣬�����������Ժ��ټ�1

        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};

        sum=day;//����������϶���Ҫ�ӵ�

		for (int i = 1; i < month; i++) {  //���ϰ������·�����

            sum+=arr[i];

        }

        //����ж��Ƿ������꣬����ǵĻ��ټ�1������sum���ǽ����,�����Ƚϳ����Ҿͳ����д��

        boolean isRight=(((year%4==0)&&(year%100!=0))||(year%400==0))&&(month>2);

        if (isRight) {

            sum+=1;

        }

        System.out.println(year+"��"+month+"��"+day+"�գ�������ĵ�"+sum+"��");

     }

}
