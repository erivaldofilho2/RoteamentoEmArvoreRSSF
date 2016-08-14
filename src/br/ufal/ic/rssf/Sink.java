package br.ufal.ic.rssf;

import java.util.ArrayList;

public class Sink implements Sensor {
	private int raio = 3;
	
	public Sink() {
	}
	
	public void gerarArvore(ArrayList<Sensor> sensores){
		for (Sensor sensor : sensores) {
			
		}
	}
	
	public String toString(){
		return "Sink";
	}
}
