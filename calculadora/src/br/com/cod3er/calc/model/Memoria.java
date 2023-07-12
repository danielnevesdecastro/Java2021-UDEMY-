package br.com.cod3er.calc.model;

public class Memoria {
	
	private static final Memoria instancia = new Memoria ();
	
	private String textoAtual = "";
	
	private Memoria() {
		
	}
	
	public static Memoria getInstnacia() {
		return instancia;
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual ;
	}
}
