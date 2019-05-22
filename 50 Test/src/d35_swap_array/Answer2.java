package d35_swap_array;

import java.util.Arrays;
import java.util.Scanner;
//输入数组，
//最大的与第一个元素交换，
//最小的与最后一个元素交换，输出数组。
/*找到该数组的最大值和最小值

   * 找到该数组最大项把它和第一位交换，

   * 找到该数值的最小项把它和最后一项交换

   * 这里有一点值得注意：不能把最大值和最小值先找出来，再连续执行两次操作交换，会出错！

   * 还有一点要注意：没叫到要交换的数值的位置不变，我在网上查了的都会有乱序的
   * 用最大值下标交换第一个
   * 再用最小值下标交换第二个
*/
public class Answer2 {
	public static void main(String[] args) {
        System.out.print("请输入一组数：");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int[]arrA = new int[50];
        int m = 0;//数组的长度
        while(scan.hasNextInt()){//不断给数组A赋值
           arrA[m++] =scan.nextInt();
        }
        scan.close();//关闭输入流
        
        int[]arrB = new int[m];//创建数组B，要求刚好适应输入的数字的个数
       
        for(int i=0;i<m;i++){
            arrB[i] =arrA[i];//把数组A不为零的数值赋值给数组B
        }
        
        int max=0;
        int min=arrB[1];//定义数组的最小值
        for (int i = 0; i < arrB.length; i++) {
           if (arrB[i]>max) {//求数组的最大值
               max=arrB[i];
           }
           if (arrB[i]<=min) {//求数组的最小值
               min=arrB[i];
           }
        }
        int max_i=0;//定义数组最大值的下标
        int min_i=0;//定义数组最小值的下标
       
        
        for (int i = 0; i < arrB.length; i++) {
           if (max==arrB[i]) {
               max_i=i;   
           }
        }
        int temp=0;//定义一个交换值
        //把最大的值和第一个值交换
        temp=arrB[0];
        arrB[0]=arrB[max_i];
        arrB[max_i]=temp;
        
        
        //求数组最小值的下标
        for (int i = 0; i < arrB.length; i++) {
           if (min==arrB[i]) {
               min_i=i;
           }
        }
        //把最小的值和最后一个值交换
        temp=arrB[arrB.length-1];
        arrB[arrB.length-1]=arrB[min_i];
        arrB[min_i]=temp;
        System.out.println(Arrays.toString(arrB));
        scan.close();

	}
}
