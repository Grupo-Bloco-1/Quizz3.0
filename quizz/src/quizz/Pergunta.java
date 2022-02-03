


	package quizz;

	//A classe pergunta armazena as informações referentes a uma pergunta

	public class Pergunta {
		
		private String pergunta;
		private String alternativas [] = new String [4];
		private int alternativaCorreta;
		private int resposta;
		
		public void setAlternativas(String alternativa1, String alternativa2, String alternativa3, String alternativa4){
			alternativas [0] = alternativa1; //A - 1
			alternativas [1] = alternativa2; //B - 2
			alternativas [2] = alternativa3; //C - 3
			alternativas [3] = alternativa4; //D - 4
		}
		
		
		public int getResposta() {
			return resposta;
		}


		public void setResposta(int resposta) {
			this.resposta = resposta;
		}


		public String [] getAlternativas() {
			
			return alternativas;
		}
		
		public int getAlternativaCorreta() {
			return alternativaCorreta;
		}



		public void setAlternativaCorreta(int alternativaCorreta) {
			this.alternativaCorreta = alternativaCorreta;
		}



		public String getPergunta() {
			return pergunta;
		}

		public void setPergunta(String pergunta) {
			this.pergunta = pergunta;
		}
	}


