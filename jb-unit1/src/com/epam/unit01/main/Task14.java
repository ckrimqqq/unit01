package com.epam.unit01.main;

public class Task14 {
	public static void main(String[] args) {
		//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
		int r=10; // радиус окружности
		double l; // длина окружности
		double s; // площадь окружности
		double Pi = Math.PI;
		l=2*Pi*r;
		s=Pi*Math.pow(r, 2);
		System.out.println("Длина = " + l + "; Площадь=" +s);
	}
}