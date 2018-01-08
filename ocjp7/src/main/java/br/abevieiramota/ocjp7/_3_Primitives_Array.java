package br.abevieiramota.ocjp7;

public class _3_Primitives_Array {
	
	/** variável local não tem valor padrão -> só pode ser utilizada se tiver valor !!!!! SEMPRE INICIALIZAR - erro de compilação*/
	/** variável membro(de instância) tem valor padrão */
	/** 
	 * Defaults
	 * 
	 * char = 0 = '\u0000'
	 * boolean = false
	 * referência = null
	 * array de variável -> array de defaults das variáveis 
	 */
	/**
	 * Representação de valores literais
	 * 
	 * char 0 ou mais, 'a', '\u03A9'
	 * int 0, 1, -123
	 * ponto flutuante 0.13, -4.3 -> !!! por default double
	 * long 10L 10l
	 * float 13.1f 13.1F
	 * double 12.1d 3.1D
	 * !!!!!!!!!! 0761 -> base octal = 497
	 * !!!!!!!!!! 0xABCDEF 0XABCDEF-> base hexadecimal
	 * !!!!!!!!!! 0b010101 0B010101 -> base binária
	 * 3.1E2 3.1e2 -> 3.1 * 10 ** 2
	 * 123_234_234 <- underlines entre os números(!DEVE HAVER NÚMERO ANTES E DEPOIS)
	 */
	/**	abstract
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
		while 
		*/
	/**
	 * Numbers
	 * 	byte(8)
	 * 	short(16)
	 * 	char(16 - unsigned)
	 * 	int(32)
	 * 	long(64)
	 * 	float(32)
	 * 	double(64) 
	 */
	/**
	 * array é Object
	 * não existe array primitivo, existe array de primitivo
	 */
	/**
	 * não existe objeto final, apenas referência final
	 */
	void testa(int val) {
		int idade, Idade, IDADE;
		boolean bonitão = true; /** pode usar unicode para nomear variável */
		boolean $oi$$$$$$$$$$$$$$$$$___ = false;
		if (val > 10) {
			idade = 0_1__2;
		}

		/** !! Erro de compilação -> idade pode não ser inicializada!!!! */
		// System.out.println(idade);
		
	}
	
	public static void main(String[] args) {
		for(char c ='a'; c < 'z'; c++) {
			System.out.println(c);
		}
		
		Integer a = 137;
		Integer b = 137;
//		!!!!!!!!!!!!!!!!!!!!!!!!!!
		if(a == b) {
			System.out.println("oi");
		}
	}
	
	void array() {
		int[] arr;
		int arr2[];
		int [] arr3;
		int[   ] arr4;
		int[] arr5[];
		int[] arrx[], arry;
		arrx = new int[5][];
		arry = new int[4];
		/**
		 * !! Inválido! não pode especificar o tamanho na declaração
		 */
//		int[5] arr6;
	}
}
