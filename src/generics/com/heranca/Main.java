package generics.com.heranca;

public class Main {

	public static void main(String[] args) {
		
//		Resolvendo o tipo generico no momento da herança
		CaixaInt1 caixa1 = new CaixaInt1();
		
		caixa1.setObj((20 + 3));
		Integer valor1 = caixa1.getObj(); 
		
		System.out.println("Soma 1: " + valor1);
		
		CaixaInt1 caixa2 = new CaixaInt1();
		CaixaInt1 caixa3 = new CaixaInt1();
		caixa2.setObj(3);
		caixa3.setObj(3);
		
		Integer valor2 = caixa2.getObj() + caixa3.getObj();
		
		System.out.println("Soma 2: " + valor2);
		
		
//		Resolvendo o tipo generico no momento da instancia
		CaixaInt2<String> caixa4 = new CaixaInt2<>();
		CaixaInt2<String> caixa5 = new CaixaInt2<>();
		caixa4.setObj("Olá ");
		caixa5.setObj("Mundo!");
		
		String valor3 = caixa4.getObj() + caixa5.getObj();
		
		System.out.println("Valor 3: " + valor3);
		
		CaixaInt2<Double> caixa6 = new CaixaInt2<>();
		caixa6.setObj(6.5 + 10.3);
		
		Double valor4 = caixa6.getObj(); 
		
		System.out.println("Soma 4: " + valor4);
		
		
		//Resolvendo o tipo generico no momento da herança com restrição
		CaixaNumero<Double> caixa7 = new CaixaNumero<>();
		CaixaNumero<Integer> caixa8 = new CaixaNumero<>();
		caixa8.setObj(35);
		caixa7.setObj(6.5 + 10.3 + caixa8.getObj());
		
		Double valor5 = caixa7.getObj(); 
		
		System.out.println("Soma 5: " + valor5);
		
	}
	
	
	
	
	
	
	
}
