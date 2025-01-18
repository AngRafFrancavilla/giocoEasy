package com.mioapp;
import java.util.Random;
public class MainPersonaggio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personaggio sora = new Personaggio("Sora");
		System.out.println(sora);
	
		Random random =new Random();
		int potenziamentoOttenuto = random.nextInt(3) + 1;
		sora.IncrementaAttacco(potenziamentoOttenuto);
		System.out.println(sora);
	}

}
