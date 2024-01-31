package com.generics;

public class Main {

	public static void main(String[] args) {
		
		CaixaObjeto<Double> caixa1 = new CaixaObjeto<>();
		caixa1.setObj(2.3); 
	
		Double valor1 = caixa1.getObj();
		System.out.println(valor1);
		
		CaixaObjeto<String> caixa2 = new CaixaObjeto<>();
		caixa2.setObj("Olá"); 
		
		String valor2 = caixa2.getObj();
		System.out.println(valor2);
		
		
	}
}
