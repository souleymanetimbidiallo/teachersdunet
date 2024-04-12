package com.teachersdunet.javaintermediaire;

public class A {
	
	public int att1;
	private String att2;
	
	public A(int att1, String att2){
		this.att1 = att1;
		this.att2 = att2;
		new B().rire();
	}
	
	public void toto(){
		class E{
			public E() {
				System.out.println("Je suis le constructeur de E");
			}
		}
		new E();
	}
	/*pour une classe interne on peut acceder aux variables ou 
	  methodes  de la classe dans laquelle elle se trouve
	 */
	class B extends C implements D{
		public B(){
			super();
			System.out.printf("att1 vaut %d et att2 vaut %s.\n", att1, att2);
		}

		@Override
		public void rire() {
			System.out.println("je ris.");
			
		}
		
	}
	/*pour une classe statique interne on ne peut acceder qu'aux 
	  membres statiques (variable ou methode statique) de la classe dans laquelle 
	  elle se trouve
	 */
	static class C {
		public C() {
			System.out.println("Je suis le constructeur de C.");
		}
	}
}


/*	
 	instanciation des differents classes
	A a = new A(45, "test").toto();
	A.B b = a.new B();
	A.C c = new A.C();
	A a = new A(45, "test").toto();
*/