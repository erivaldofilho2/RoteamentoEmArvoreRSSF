package br.ufal.ic.rssf;

public class No implements Sensor {
	
	private int id;
	private Sensor pai;
	private int bateria = 10000;
	private int custoEnvio = 10;
	private int custoEspera = 1;
	private int distanciaSink;
	
	public No(int distanciaSink, int id) {
		super();
		this.distanciaSink = distanciaSink;
		this.id = id;
	}
	
	public int getdistanciaSink() {
		return distanciaSink;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Sensor getPai(){
		return this.pai;
	}
	
	public void setdistanciaSink(int distanciaSink) {
		this.distanciaSink = distanciaSink;
	}
	

	public String toString(){
		return "Pai->"+pai.getId()+"| ID->"+id;
		
	}
	
	public void setPai(Sensor pai){
		System.out.println("Pai inserido com sucesso-> ID/Distancia:"+id+"/"+distanciaSink+" Pai/Distancia:"+pai.getId()+"/");
		this.pai = pai;
	}
	
}
