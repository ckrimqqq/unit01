package com.epam.unit01.main;

public class Task01 {
	public static void main(String[] args) {
		//Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
		int a=2;
		int b=4;
		int sum, razn, umn, del;
		sum=a+b;
		razn=b-a;
		umn=a*b;
		del=b/a;
		System.out.println("Сумма = " + sum + "; Разность=" + razn + "; Произведение = " + umn + "; Частное = " + del);
	}
}
