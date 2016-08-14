package br.ufal.ic.rssf;

import java.util.ArrayList;

public class Sink {
	private int raio = 3;
	
	public Sink() {
	}
	
	/*Tem que setar o pai de cada nó de acordo com a distancia pra o sink, exemplo: Um nó com distancia 5 
	 * deve ter um pai que alcança essa distancia */
	public void gerarArvore(ArrayList<No> nos, Sensor sink){
		for (No no : nos) {
			if (no.raio < sink.raio) {
				no.setPai(sink);
			}
			else{
				/*Verificar qual nó está com a distancia proxima do no */
			}
		}
	}
	
	public String toString(){
		return "Sink";
	}
}
