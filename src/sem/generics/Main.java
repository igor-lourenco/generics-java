package sem.generics;

public class Main {

	public static void main(String[] args) {
		
		CaixaObjeto caixa1 = new CaixaObjeto();
		caixa1.setObj(2.3);   // double -> Double (autoboxing)
		
		Double valor1 = (Double) caixa1.getObj();   // Casting - não recomendado
		System.out.println(valor1);
		
		
		CaixaObjeto caixa2 = new CaixaObjeto();
		caixa2.setObj("Olá"); 
		
		String valor2 = (String) caixa2.getObj();   // Casting - não recomendado
		System.out.println(valor2);
		
		
		CaixaObjeto caixa3 = new CaixaObjeto();
		caixa3.setObj(2.3); 
		
//		Integer valor3 = (Integer) caixa2.getObj();   // Vai lançar exceção por tentar fazer casting de Double para Integer
		
	}
}
