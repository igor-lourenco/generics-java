package generics.com.heranca;

public class Main {

	public static void main(String[] args) {
		
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
		
		//Resolvendo o tipo generico no momento da herança
		
	}
	
}
