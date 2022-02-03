package quizzOfc;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String [] args) {
				
		/*Pergunta pergunta = new Pergunta1(
				"Pergunta enunciado 1",
				"alternativa 1", 
				"alternativa 2",
				"alternativa 3", 
				'A');
		
		Pergunta pergunta2 = new Pergunta1(
				"Pergunta enunciado 2",
				"alternativa 1", 
				"alternativa 2",
				"alternativa 3",
				'C');
		
		Pergunta pergunta3 = new Pergunta2(
				"Pergunta enunciado 2",
				"alternativa 1", 
				"alternativa 2",
				"alternativa 3",
				"alternativa 4",
				"ultima alternativa",
				'D');
		pergunta.listarAlternativas();*/
		
		
		
		Pergunta pergunta1 = new Pergunta1
				("Apenas uma pessoa na história recebeu o Prêmio Nobel em áreas científicas diferentes. Quem foi essa pessoa?",
				 "a) Albert Einstein",
				 "b) Marie Curie",
				 "c) Mahatma Gandhi",
				 "d) Stephen Hawking"
				 'B');
		
		Pergunta pergunta2 = new Pergunta1
		Pergunta pergunta3 = new Pergunta1
		
		
		
		ArrayList<Pergunta> perguntas = new ArrayList<>();
		
		perguntas.add(pergunta1);
		perguntas.add(pergunta2);
		perguntas.add(pergunta3);
		
		
		
		
		
		
		Scanner ler = new Scanner(System.in);
		char teste= ler.next().charAt(0); //ler 0 vai ler uma string, mas vai pegar o charac da 1ª posicão
		pergunta.verificarResp(teste);
		
		pergunta2.listarAlternativas();
		teste= ler.next().charAt(0); 
		pergunta2.verificarResp(teste);
		
		pergunta3.listarAlternativas();
		teste= ler.next().charAt(0); 
		pergunta3.verificarResp(teste);
		
		ler.close();
	}
	
}
