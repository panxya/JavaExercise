package d08_calculation;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {

        int n=0,a=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入a的值:");
        a=scanner.nextInt();
        System.out.println("请输入n的值：");
        n=scanner.nextInt();
        int[] arr=new int[n];//创建数组长度为输入的项数
        int i=1;//while循环初始化的值
        arr[0]=a;//数组的第一个值为3
        //把每一项的值赋值给数组里面的数
        while (i<n) {
            a*=10;
            arr[i]=a+arr[i-1];
            i++;         
        }
        //求和
        int sum=0;
        for(int s:arr){
            sum+=s;//累加求和
            if (s==arr[n-1]) {
               System.out.print(s);
               break;//最后一次只输出结果
            }
            System.out.print(s+"+");//前面的值输出结果，后面还要加一个加号
        }
        System.out.println("="+sum);//完美结束
     }
 }


