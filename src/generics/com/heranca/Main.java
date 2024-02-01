package generics.com.heranca;

import java.util.Arrays;
import java.util.List;

import generics.utils.ListaUtil;

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
		
//		===================================
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs); // usando metodo sem ser generico
		System.out.println("Ultima linguagem: " + ultimaLinguagem1);

		Integer ultimaNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println("Ultimo Numero: " + ultimaNumero1);
		
		langs.add("Python");
		nums.add(7);
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);         // usando metodo generico
		System.out.println("Ultima linguagem: " + ultimaLinguagem2);

		Integer ultimaNumero2 = ListaUtil.getUltimo2(nums);
		System.out.println("Ultimo Numero: " + ultimaNumero2);
				
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
