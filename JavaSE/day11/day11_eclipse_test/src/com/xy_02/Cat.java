package com.xy_02;

import com.xy_01.Jump;

/**
 * ÕâÊÇÃ¨
 * 
 * @author Ğ¡Ñî
 * @version V10
 */
public class Cat extends Animal implements Jump {
	
	@Override
	public void jump() {
		System.out.println("Ã¨Ìø");
	}
	
	@Override
	public void sleep() {
		System.out.println("Ã¨Ë¯");
	}
	
	@Override
	public void eat() {
		System.out.println("Ã¨³Ô");
	}

}
