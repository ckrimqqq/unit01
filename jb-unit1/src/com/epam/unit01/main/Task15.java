package com.epam.unit01.main;

public class Task15 {
	public static void main(String[] args) {
		//Написать программу, которая выводит на экран первые четыре степени числа π
		double Pi = Math.PI;
		double s, ss, sss, ssss; // 1я 2я 3я и 4я степени
		s=Math.pow(Pi, 1);
		ss=Math.pow(Pi, 2);
		sss=Math.pow(Pi, 3);
		ssss=Math.pow(Pi, 4);
		System.out.println("Первая степернь чисра PI = " + s + "; Вторая степернь чисра PI=" +ss+ "; Третяя степернь чисра PI=" +sss + "; Четвёртая степернь чисра PI=" +ssss);
	}
}
