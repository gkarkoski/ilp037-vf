package ilp037.creational.prototype;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.document= 987654L;
		p1.name="Jonh Smith";
		System.out.println(p1);

		Person p2 = p1.copy();
		p2.document= 12345678L;
		p2.name="Marie Jane";
		System.out.println(p2);
	}

}
