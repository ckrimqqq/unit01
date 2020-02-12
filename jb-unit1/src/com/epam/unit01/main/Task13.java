package com.epam.unit01.main;

public class Task13 {
	public static void main(String[] args) {
		//Заданы координаты трех вершин треугольника (х1, у1),(х2, у2),(х3, у3). Найти его периметр и площадь.
		int a=2; //x1 
		int b=4; //x2
		int e=2; //x3
		int c=4; //y1
		int d=6; //y2
		int f=2; //y3
		double l1,l2,l3; // тороны треугольника
		double p; // периметр треугольника
		double pp; // полупериметр треугольника
		double s; // площадь треугольника
		l1=Math.sqrt(Math.pow((b-a), 2)+Math.pow((d-c), 2));
		l2=Math.sqrt(Math.pow((e-b), 2)+Math.pow((f-d), 2));
		l3=Math.sqrt(Math.pow((e-a), 2)+Math.pow((f-c), 2));
		p=l1+l2+l3;
		pp=p/2;
		s=Math.sqrt(pp*(pp-l1)*(pp-l2)*(pp-l3));
		System.out.println("Периметр треугольника = " + p + "; Площадь треугольника=" +s);
	}
}