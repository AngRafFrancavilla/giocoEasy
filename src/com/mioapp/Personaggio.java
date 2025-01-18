package com.mioapp;

public class Personaggio {
	private String nome;
	private int attacco;
	private int puntiSalute;
	public Personaggio(String nome) {
		this.nome = nome;
		this.attacco = 1;
		this.puntiSalute = 100;
	}

	public void IncrementaAttacco (int oggettoRaccolto) {
		if(oggettoRaccolto == 1) {
			attacco += 5;
		}
		if(oggettoRaccolto == 2) {
			attacco += 50;
		}
		if(oggettoRaccolto == 3) {
			attacco += 100;
		}
	}
	@Override
	public String toString() {
		return "Ciao sono "+ nome +" e ho " + attacco + " di punti attacco e " +puntiSalute+ " di HP. ";
	}
}
