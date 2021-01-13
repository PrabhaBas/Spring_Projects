package com.prabha.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Memory implements MobileProcessor{
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("This is Memory of Samsung phone");
	}

}
