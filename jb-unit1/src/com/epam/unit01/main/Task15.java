package com.epam.unit01.main;

public class Task15 {
	public static void main(String[] args) {
		//Написать программу, которая выводит на экран первые четыре степени числа π
		int r=10; // радиус окружности
		double l; // длина окружности
		double s; // площадь окружности
		double Pi = Math.PI;
		l=2*Pi*r;
		s=Pi*Math.pow(r, 2);
		System.out.println("Длина = " + l + "; Площадь=" +s);
	}
}
