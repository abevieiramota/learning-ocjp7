package br.abevieiramota.ocjp7.hehe1.hehe2;

import br.abevieiramota.ocjp7.hehe1.A;

public class B extends A {

	// não overrida o doSomething de A, porque não herda ele
	void doSomething() {
		A a = this;
	};
}
