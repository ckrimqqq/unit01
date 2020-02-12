package com.epam.unit01.main;

public class Task11 {
	public static void main(String[] args) {
		//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
		double a=5, b=10; // катеты
		double p; // периметр
		double s; // площадь
		p=a+b+Math.sqrt(a*a+b*b);
		s=0.5*a*b;
		System.out.println("Периметр = " + p + "; Площадь=" +s);
	}
}