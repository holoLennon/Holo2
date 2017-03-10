package com.holo.test;

import java.util.Date;

import org.springframework.util.Assert;

public class StaticTest {
	public static void main(String[] args) {
		byte x=124;
	}
	public void  test0223(){
		try {
			System.err.println(111);
			Assert.state(false, "会输出什么");
			System.err.println(222);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void  test0228(){
		Date date=new Date();
		date.getDate();
	}
}
