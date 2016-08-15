package br.ufal.ic.rssf;

import java.util.ArrayList;

public class Sink implements Sensor {

	private int id = 0;
	public Sink() {
	}

	/*
	 * Tem que setar o pai de cada nó de acordo com a distancia pra o sink,
	 * exemplo: Um nó com distancia 5 deve ter um pai que alcança essa distancia
	 */
	public ArrayList<No> gerarArvore(ArrayList<No> nos, Sensor sink) {
		for (No no : nos) {
			System.out.println("========"+no.getId());
			if (no.getdistanciaSink() < sink.raio) {
				no.setPai(sink);
			} else {
				for (No no2 : nos) {
//					System.out.println("AQUI");
					int disNo = no.getdistanciaSink();
					int disNo2 = no2.getdistanciaSink()+no2.raio;
					
					if (no.getId() != no2.getId() && no2.getPai() != null
							&& disNo <= disNo2) {
					System.out.println(disNo+"/"+disNo2);
						no.setPai(no2);
						
					}
					
				}
			}
		}
		return nos;
	}

	public String toString() {
		return "Sink";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
