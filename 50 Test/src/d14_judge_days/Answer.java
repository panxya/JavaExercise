package d14_judge_days;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {

        System.out.println("请输入年月日（用空格隔开）：");

        Scanner scanner=new Scanner(System.in);

        int year=scanner.nextInt();//获取年份

        int month=scanner.nextInt();//获取月份

        int day=scanner.nextInt();//获取天数

        int sum=0;//天数总和

        //创建一个包含月份天数的数组，先按小年计算，如果是闰年，并且在三月以后再加1

        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};

        sum=day;//输入的天数肯定是要加的

		for (int i = 1; i < month; i++) {  //加上包含的月份天数

            sum+=arr[i];

        }

        //最后判断是否是闰年，如果是的话再加1，否则sum就是结果了,条件比较长，我就抽出来写了

        boolean isRight=(((year%4==0)&&(year%100!=0))||(year%400==0))&&(month>2);

        if (isRight) {

            sum+=1;

        }

        System.out.println(year+"年"+month+"月"+day+"日，是这年的第"+sum+"天");

     }

}
