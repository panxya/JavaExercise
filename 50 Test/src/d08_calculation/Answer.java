package d08_calculation;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {

        int n=0,a=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("������a��ֵ:");
        a=scanner.nextInt();
        System.out.println("������n��ֵ��");
        n=scanner.nextInt();
        int[] arr=new int[n];//�������鳤��Ϊ���������
        int i=1;//whileѭ����ʼ����ֵ
        arr[0]=a;//����ĵ�һ��ֵΪ3
        //��ÿһ���ֵ��ֵ�������������
        while (i<n) {
            a*=10;
            arr[i]=a+arr[i-1];
            i++;         
        }
        //���
        int sum=0;
        for(int s:arr){
            sum+=s;//�ۼ����
            if (s==arr[n-1]) {
               System.out.print(s);
               break;//���һ��ֻ������
            }
            System.out.print(s+"+");//ǰ���ֵ�����������滹Ҫ��һ���Ӻ�
        }
        System.out.println("="+sum);//��������
     }
 }


