package br.ufal.ic.rssf;

public class No implements Sensor {
	
	private Sensor pai;
	private int raio = 3;
	private int bateria = 10000;
	private int custoEnvio = 10;
	private int custoEspera = 1;
	private int distanciaSink;
	
	public No(int distanciaSink) {
		super();
		this.distanciaSink = distanciaSink;
	}
	
	public String toString(){
		return "Pai->"+pai+"| Dis. Sink->"+distanciaSink;
		
	}
	
	public void setPai(Sensor pai){
		this.pai = pai;
	}
}
