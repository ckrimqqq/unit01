package com.epam.unit01.main;

public class Task09 {
	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают действительные значения):𝑎/𝑐∗𝑏/𝑑−𝑎𝑏−𝑐/𝑐𝑑
		int a=10, b=8, c=6, d=2;
		double x;
		x=((a/c)*(b/d))-((a*b-c)/(c*d));
		System.out.println("Result = " + x);
	}
}
