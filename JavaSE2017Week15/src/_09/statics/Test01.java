package _09.statics;

import static java.lang.Integer.MAX_VALUE; //legaldir

import static java.lang.Integer.*;

//static import  java.lang.Integer.MAX_VALUE; //legal degildir

import static java.lang.System.out;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(MAX_VALUE);
		System.out.println(MIN_VALUE);
		
		int maxValue = max(10, 20);
		System.out.println(maxValue);
		//
		
		out.println("static import test!");
		
		parseInt("100");

		//static importlari kullandigimzda static degisken ve stati methodlari bu sekild kullanabiliriz.
	}
}
