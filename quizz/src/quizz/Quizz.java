package quizz;

import java.util.Scanner;

//Quizz gerencia as perguntas

public class Quizz {
	Scanner ler = new Scanner(System.in);
	private int contador = 0;

	private Pergunta perguntas[] = new Pergunta[2]; // Aqui que eu mudo a quantidade de perguntas do quizz

	public void adicionarPergunta(String pergunta, String alternativa1, String alternativa2, String alternativa3,
		String alternativa4, int alternativaCorreta) {
		Pergunta perg = new Pergunta();
		perg.setPergunta(pergunta);
		perg.setAlternativas(alternativa1, alternativa2, alternativa3, alternativa4);
		perg.setAlternativaCorreta(alternativaCorreta);

		perguntas[contador] = perg;
		contador++;
	}

	public void exibirUltimaPergunta() {
		System.out.println(perguntas[perguntas.length - 1].getPergunta());

	}

	public void listarPerguntas() {
		for (int x = 0; x < perguntas.length; x++) {
			System.out.println(perguntas[x].getPergunta());

			String[] alternativas = perguntas[x].getAlternativas();
			for (int i = 0; i < alternativas.length; i++) {
				System.out.println(alternativas[i]);
			}
			
			System.out.println("Digite a alternativa correta ");
			
			perguntas[x].setResposta(ler.nextInt()); 
			
			System.out.println("\n");
		}
	}
	
	public void exibirResultado() {
			
		}
	}

