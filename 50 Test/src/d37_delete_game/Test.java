package d37_delete_game;

import java.util.Scanner;

/*：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
 * 凡报到3的人退出圈子，问最后留下的是原来第几号的那位。

关键问题是怎么移除》？:
布尔值确定，如果被选中被赋值为false
     * 从第一个人开始判断，
     * 如果他在圈内，那么报数，
     * 再判断他报的数是否是3，如果是的话移出圈外
     * 接着判断下一个人，
     * 是否到了最末，
     * 如果是的话，
     * 从零开始
     * 不断循环，
     * 直到最后剩下1个人
*/
public class Test {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 1000);
		System.out.println("共有" + n);
		boolean[] A = new boolean[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = true;
		}
		int count = 0;
		int inCount = n;
		int index = 0;
		while (inCount > 1) {
			if (A[index]) {
				count++;
				if (count == 3) {
					count = 0;
					A[index] = false;
					inCount--;
				}
			}
			index++;
			if (index == n) {
				index = 0;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (A[i]) {
				System.out.println("留下" + i);
			}
		}

	}
}
