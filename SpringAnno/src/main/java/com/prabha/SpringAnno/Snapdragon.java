package com.prabha.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("World Best CPU");
	}

}
