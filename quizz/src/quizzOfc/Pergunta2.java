package quizzOfc;

public class Pergunta2 extends Pergunta{
	
	protected String alt4 , alt5;
	
	public Pergunta2(String pergunta, String alt1, String alt2, String alt3, String alt4,
			String alt5, char altCorreta) {
		super(pergunta, alt1, alt2, alt3, altCorreta);
		this.alt4 = alt4;
		this.alt5 = alt5;
	}


	
	@Override
	public void listarAlternativas() {
		System.out.println("A " +this.alt1);
		System.out.println("B " +this.alt2);
		System.out.println("C " +this.alt3);
		System.out.println("D " +this.alt4);
		System.out.println("E " +this.alt5);
		System.out.println("Insira a alternativa correta");
	}

}
