package com.epam.unit01.main;

public class Task08 {
	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимаютдействительные значения) 𝑏 + √𝑏2 + 4𝑎𝑐/2𝑎 − 𝑎3𝑐 + 𝑏−2
		int a=4;
		int b=8;
		int c=12;
		double x;
		x=(b+Math.sqrt(Math.pow(b, 2)+4*a*c)/2)-Math.pow(a, 3)*c+Math.pow(b, -2);
		System.out.println("Result = " + x);
	}
}