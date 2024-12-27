package br.com.erickfreire.calculadoradeindicedemassacorporal;

import java.util.Scanner;

public class CalculadoraDeIndiceDeMassaCorporal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double imc = 0.0;
		double peso = 0.0;
		double altura = 0.0;
		
		System.out.println("Programa que calcula o Indice de Massa Corporal: ");
		System.out.print("Digite o seu peso: ");
		peso = entrada.nextDouble();
		System.out.print("Digite a sua altura: ");
		altura = entrada.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.printf("%nO seu IMC é de: %.2f", imc);
		
		if(imc < 18.5) {
			System.out.printf("%nAbaixo do normal, cuidado com a Anorexia, procure a ajuda de um médico");
		}
		
		if(imc >= 18.5 && imc < 25) {
			System.out.printf("%nPeso normal");
		}
		
		if(imc >= 25 && imc < 29.9) {
			System.out.printf("%nSobrepeso");
		}
		
		if(imc >= 30) {
			System.out.printf("%nObesidade Mórbida, procure a ajuda de um médico");
		}



	}

}
