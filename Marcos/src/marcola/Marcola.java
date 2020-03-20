package marcola;

import java.util.Locale; // veja que para se usar o locale se deve ter isso 
import java.util.Scanner;

public class Marcola {

	public static void main(String[] args) {
		/*
		int y = 32;
		double x = 10.35784;

		System.out.println("bom dia");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US); // serve para tirar a virgula do "x" pois nos USA se usa "." 
		/*
		 o (%.2f%n) para indicar a quantidade de casas apos a virgula que você deseja, o "2 e 4" sendo o total de casas após virgula que deseja
		 o (int e o double) são o tipo da variavel onde o "y e x" seja o nome dela com o valor após o igual
		 o int siguinifica valor inteiro.  ja o double significa valor com casas decimais 
		*/
		/*
		System.out.println("resultado = " + x + " metros");
		// para juntar elementos se faz isso 
		System.out.printf("resultado = %.2f metros%n", x);
		
		// "%n"= quebra de linha/ "%f"= ponto flutuante\\ se faz isso para juntar os elementos e para ter a quantidade de casas desejadas após a virgula
		// %d= inteiro// %s= texto
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		 perceba que para ter os elementos juntos foi precisso isso 
		*/
		
		
		// exercicio 
		/*
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");{
		System.out.printf("%s whitch price is $ %.2f%n", product1, prince1);
		} {
		System.out.printf("%s, white price is $ %.2f%n", product2, prince2);
		} {
		System.out.printf("Recorde: %d years old, code %d and gender: %s %n", age, code, gender);
		} {
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		}
		System.out.printf("Rouded (three  decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure);
		*/
		
		// exercicio pronto aeeeeee ksksks
		/*
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		*/
        /*
		int x;
		double y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		*/
		// calcular area do trapezio 
		// double ou float sao quase a msm coisa anmbos terao o (.) so que o double usa numeros maiores
        /*
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		*/
		/*
	    int a, b;
		double resultado;
		
		a = 5;
		b = 2; 
		  acrecente o (double) para indicar que o resultado sera um numero decimal  
		resultado = (double)a / b;
		
		System.out.println(resultado);
		*/
		// se vc colocar (sysou Ctrl + espaco) ele ira apresentar o system completo
		Scanner sc = new Scanner(System.in);
		
      int x, y, v;
      System.out.println("digite os valores");
       x = sc.nextInt();
       System.out.println("voce digitou: " + x);
       y = sc.nextInt();
       System.out.println("voce digitou: " + y);
       v = x * y;
       System.out.println("o valor foi: " + v);
      
	
       
		sc.close();
		
		// só para por em pratica oque aprendi posição do movel
		/*
		int s0, v, t;
		int sm;
	    s0 = 5;
	    v = 5;
	    t = 5;
	    sm = (s0 + v * t);
		 System.out.printf("a pocicao final do movel apos 5 segundos sera %d metros", sm);
		*/
		// velocidade media 
		/*
		 int Δt, Δs, V;
		
		Δs = 10;
		Δt = 2;
		V = (Δs / Δt);
		System.out.println("a velocidade media é " + V + " metros por segundos");
	    */
		
	}

}
