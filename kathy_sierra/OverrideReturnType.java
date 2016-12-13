class A { A doSomething() { return new B();}}
class B extends A { B doSomething() { return new B();}}
class C { private void doOi(){};}
class D extends C { public void doOi(){};}
// no problem! C#doOi não é herdado, por eer privado
class E { void doOi() throws Exception {};}
class F extends E { void doOi() throws NumberFormatException {};}
class G extends E { void doOi(){};}