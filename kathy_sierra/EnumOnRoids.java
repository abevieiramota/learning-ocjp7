enum CoffeeSize {

	BIG(8) {
		public String getOi() {
			return "";
		}
	},
	HUGE(10) {
		public String getOi() {
			return "";
		}
	},
	GRANDE_PRA_CARALHO(16) {

		public String getMessage() {
			return "Meu, tem 2 litros de café izi nesse copo, pqp!";
		}

		public String getOi() {
			return "ooooi";
		}
	}; // OBRIGATÓRIO PONTO E VÍRGULA SE VIER MAIS CÓDIGO

	CoffeeSize(int tamanho) {
		this.tamanho = tamanho;
	}

	private int tamanho; // ordem entre as partes não importa
	// a menos que os enuns devem aparecer antes do construtor

	public String getMessage() {
		return "tamanho normal, deixa de choro";
	}

	public abstract String getOi();
}