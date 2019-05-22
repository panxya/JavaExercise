package d33_yanghui_triangular;

public class Answer {
	public static void main(String[] args){
		int[][] n = new int[10][21];
		n[0][10] = 1;
		for(int i=1;i<10;i++)
		  for(int j=10-i;j<10+i+1;j++)
		    n[i][j] = n[i-1][j-1]+n[i-1][j+1];
		
		for(int i=0;i<10;i++){
			for(int j=0;j<21;j++){
				if(n[i][j]==0)
				  System.out.print("   ");
				else{
			    if(n[i][j]<10)
			      System.out.print("  "+n[i][j]);//空格为了美观需要
			    else if(n[i][j]<100)
			      System.out.print(" "+n[i][j]);
			      else
			        System.out.print(n[i][j]);
			  }
			}
			System.out.println();
		}
	}
//	public static void main(String[] args) {
//
//        int[][]arr=new int[10][10];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i][0]=1;//控制第一列的数等于1
//
//       }
//
//       for (int i = 1; i < arr.length; i++) {
//
//           for (int j=1; j < arr.length; j++) {
//
//              arr[i][j]=arr[i-1][j-1]+arr[i-1][j];//赋值
//
//           }
//
//       }
//
//       //打印结果
//
//       for (int i = 0; i < arr.length ; i++) {
//           for (int k = arr.length-i;k>0;k--) {//空格的控制，为了好看
//              System.out.print("  ");
//           }
//           for (int j = 0; j < arr.length; j++) {//打印出数组的数字
//              if (arr[i][j]!=0) {//把把没赋值的零去掉
//                  System.out.print(arr[i][j]+"   ");
//              }
//           }
//           System.out.println();//控制换行
//       }
//    }
}
