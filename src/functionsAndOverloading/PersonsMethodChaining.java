package functionsAndOverloading;

public class PersonsMethodChaining {

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		m3();
	}

	public void m3() {
		System.out.println("m3");
		//p2();
	}

	public static void p1() {
		System.out.println("p1");
		p2();
		PersonsMethodChaining pp = new PersonsMethodChaining();
		pp.m3();
	}

	public static void p2() {
		System.out.println("p2");
		p3();
		PersonsMethodChaining ppp = new PersonsMethodChaining();
		ppp.m3();
	}

	public static void p3() {
		System.out.println("p3");
	}

	public static void main(String[] args) {

		PersonsMethodChaining p11 = new PersonsMethodChaining();
		p11.m1();
		p11.m2();

		PersonsMethodChaining.p1();
		//PersonsMethodChaining.p2();
	}

}
