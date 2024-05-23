package ilp037.creational.abstractfactory;

public class App {
//edição
	public static void main(String[] args) {
		String type ="Orc";
		KingdomFactory Factory = KingdomFactory.getinstance(type);

	}

}
