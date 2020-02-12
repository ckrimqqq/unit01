package com.epam.unit01.main;

public class Task12 {
	public static void main(String[] args) {
		//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
		int a=2; //x1 
		int b=4; //x2
		int c = 6; //y1
		int d=8; //y2
		double l; // расстояние между точками
		l=Math.sqrt(Math.pow((b-a), 2)+Math.pow((d-c), 2));
		System.out.println("Расстояние между точками = " + l);
	}
}