package aplication;

import java.util.Scanner;

import model.Time;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite a quantidade de Devs da equipe: ");
	        int qtdDevs = sc.nextInt();
	        
	        int somaConsumo = 0;
	        for (int i = 1; i <= qtdDevs; i++) {
	            System.out.print("Digite a quantidade de xícaras de café por dia do Dev " + i + ": ");
	            int consumo = sc.nextInt();
	            somaConsumo += consumo; 
	        }
	        
	        Time time = new Time(qtdDevs, somaConsumo);
	        
	        System.out.println("\n--- Relatório de Café ---");
	        System.out.println("Consumo diário da equipe: " + time.getConsumoTotalPorDia() + " xícaras");
	        System.out.println("Consumo semanal da equipe: " + time.getConsumoSemanalEquipe() + " xícaras");
	        System.out.println("Estoque disponível: " + Time.ESTOQUE + " xícaras");
	        
	        if (time.estoqueSuficiente()) {
	            System.out.println("O estoque é suficiente!");
	        } else {
	            System.out.println("O estoque não é suficiente!");
	            System.out.println("Faltam " + time.cafeFaltante() + " xícaras.");
	        }
	}

}
