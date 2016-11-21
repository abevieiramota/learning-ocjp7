package br.abevieiramota.ocjp7;

public class Aula3 {
	
	// variável local não tem valor padrão -> só pode ser utilizada se tiver valor
	// variável membro tem valor padrão
	// char padrão = 0(não impresso)
	// boolean padrão = false
	// referência padrão = null
	// array de variável -> padrão são valores padrões
	// char -> só valor 0 ou positivo
	// ponto flutuante pode ter +/- infinito e NaN
	// literal -> apenas tipo primitivo
	// números inteiros, por padrão -> int
	// números com casa decimal, por padrão -> double
	// long 10L 10l
	// float 13.1f 13.1F
	// double 12.1D 12.1d
	// 0761 -> base octal = 497
	// 0xABCDEF -> base hexadecimal
	// 0XABCDEF -> base hexadecimal
	// 0b010101 -> base binárias
	// 0B010101 -> base binárias
	// notação científica 3.1E2 3.1e2-> 3.1 * 10**2
	// 123_235_123_123 <- underline não tem problema!
	// dos dois lados do underline tem que vir número(caracteres de valor numérico, inclusos ABCDEF em base hexa) ou underline
	// char c = 65 > inteiro -> não há equivalência entre númerico e valor char!
	// char c = '\u03A9'; unicode
	// nome de variável
	//  não pode reservada -> # decorar(Obs: todas reservadas são minúsculas)
	/*	abstract
		assert
		boolean
		break
		byte
		case
		catch
		char
		class
		>>>>>>>>>>>>>>>>const
		continue
		default
		do
		double
		else
		enum
		extends
		false
		final
		finally
		float
		for
		>>>>>>>>>>>>>>>>>>goto
		if
		implements
		import
		instanceof
		int
		interface
		long
		>>>>>>>>>>>>native
		new
		null
		package
		private
		protected
		public
		return
		short
		static
		>>>>>>>>>>strictfp
		super
		switch
		synchronized
		this
		throw
		throws
		>>>>>>>>>>transient
		true
		try
		void
		>>>>>>>>>volatile
		while */
	//  boolean bonitão = true; <- pode usar unicode!!!
	//  boolean bonito123
	//  boolean ricão$$$$
	//  boolean bonito_e_rico
	//  primeiro caractere não pode ser número!!!!!!!!!!
	//  boolean $oi
	//           $$$$$$$$$$$$$$$$$$ __________________
	//  boolean _oi
	//  int idade
	//  int Idade
	//  int IDADE

	void testa(int val) {
		int idade;
		if (val > 10) {
			idade = 0_1__0;
		}

		//		System.out.println(idade);
		// compilador não sabe q idade vai ser inicializada
		
	}
	
	public static void main(String[] args) {
		for(char c ='a'; c < 'z'; c++) {
			System.out.println(c);
		}
		
		Integer a = 10;
		Integer b = 10;
		
		if(a == b) {
			System.out.println("oi");
		}
	}
}
