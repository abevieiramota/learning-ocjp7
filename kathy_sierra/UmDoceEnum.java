public enum UmDoceEnum {
	OI, TUDO_BEM
}

class TenhoUmEnum {
	// NÃO PRECISA SER STATIC
	enum SouEnumDeDentro { OI } // NÃO É NECESSÁRIO PONTO E VÍRGULA AQUI!

	public static void main(String[] args) {
		SouEnumDeDentro s = SouEnumDeDentro.OI;

		System.out.println(s.OI);
	}
}