package com.xy_02;

import com.xy_01.Jump;

/**
 * ����è
 * 
 * @author С��
 * @version V10
 */
public class Cat extends Animal implements Jump {
	
	@Override
	public void jump() {
		System.out.println("è��");
	}
	
	@Override
	public void sleep() {
		System.out.println("è˯");
	}
	
	@Override
	public void eat() {
		System.out.println("è��");
	}

}
