package quizzOfc;

public class Pergunta {
	//A classe pergunta armazena as informações referentes a uma pergunta
	
	//atributos
	protected String pergunta;
	protected String alt1 , alt2, alt3;
	protected char altCorreta; 
	
	public Pergunta() {
		
	}
	
	
	public Pergunta(String pergunta, String alt1, String alt2, String alt3, char altCorreta) {
		super();
		this.pergunta = pergunta;
		this.alt1 = alt1;
		this.alt2 = alt2;
		this.alt3 = alt3;
		this.altCorreta = this.setAltCorreta(altCorreta);
	}

	//métodos
	public void perguntar() {
		System.out.println(this.pergunta);
	}
	
	
	
	public void listarAlternativas() {
		System.out.println("----------------------------------------------------");
		System.out.println(this.pergunta);
		System.out.println("A " +this.alt1);
		System.out.println("B " +this.alt2);
		System.out.println("C " +this.alt3);
		System.out.println("Insira a alternativa correta");
	}

	private char setAltCorreta(char altCorreta) {
		return Character.toUpperCase(altCorreta); //converte character minusc p/ maisc.	
	}
	
	public String toString() {
		return Pergunta();
	
	
	public void verificarResp(char resposta) {
		resposta=Character.toUpperCase(resposta); //converte character minusc p/ maisc.
		if(this.altCorreta==resposta) {
			//pontuacao 
			System.out.println("Resposta correta");
		}
		else {
			System.out.println("Resposta incorreta");
		}
		System.out.println("----------------------------------------------------");
	}	
	
}
