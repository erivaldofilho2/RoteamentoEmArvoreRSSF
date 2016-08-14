package br.ufal.ic.rssf;

import java.util.ArrayList;

public class Simulador {
	public static void main(String[] args) {
		
		Sink sink = new Sink();
		
		No no1 = new No(1);
		No no2 = new No(2);
		No no3 = new No(7);
		No no4 = new No(9);
		No no5 = new No(5);
		No no6 = new No(8);
		
		ArrayList<No> arrayNo = new ArrayList<No>();

		arrayNo.add(no1);
		arrayNo.add(no2);
		arrayNo.add(no3);
		arrayNo.add(no4);
		arrayNo.add(no5);
		arrayNo.add(no6);
		
		System.out.println(arrayNo);
		


	}
}
