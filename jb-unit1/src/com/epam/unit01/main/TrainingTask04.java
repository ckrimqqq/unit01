package com.epam.unit01.main;

public class TrainingTask04 {
		public static void main(String[] args) {
	int a=3; //катет 1
	int b=4; //катет 2
	double c=0; //гиппотенуза
	int s=0; //площадь
	double d=0; //катет 1 в квадрате
	double g=0; //катет 2 в квадрате
	double z=0; //произведение катетов
	d=Math.pow(a, 2);
	g=Math.pow(b, 2);
	z=d*g;
	c=Math.sqrt(z); // расчёт гиппотенузы, корень квадратный из произведения квадратов катетов
	s = a*b/2; //расчёт площади
	System.out.println("Гиппотенуза= " + c + "; Площадь= " + s);
		}
}