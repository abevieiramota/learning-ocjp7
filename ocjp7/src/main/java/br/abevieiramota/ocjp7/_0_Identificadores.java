package br.abevieiramota.ocjp7;

public class _0_Identificadores {
	/**
	 * Identificador deve começar com:
	 * 	* $
	 *  * _
	 *  * letter
	 * E pode continuar com:
	 * 	* $
	 * 	* _
	 * 	* letter
	 * 	* number
	 * 
	 *  [FIXME] IDENTIFICADOR NÃO PODE COMEÇAR COM NUMBER
	 *  
	 *  E não pode ser keyword.
	 *  Keywords incomuns:
	 *  	* strictfp -> strict float point
	 *  	* assert
	 *  	* transient
	 *  	* native
	 *  	* synchronized
	 *  	* volatile
	 *  CamelCase não é obrigatório! Nome de classe pode ser minúsculo
	 */
	public static void main(String[] args) {
		int $ = 1;
		int $$ = 5;
		int _ = 0;
		int __ = $$++;
		int _$_ = 123;
		int $$____123 = 123;
		// inválido
		// int 1_10 = 10;
	}
}