package ilp037.creation.builder;

public class App {

	public static void main(String[] args) {
//		Armor a = new Armor();
//		HairColor hc = new HairColor();
//		Profession p = new Profession();
//		Hero h = new Hero(a, hc, p);
		
//agora usando o builder
// conflito branch!!!!!!
		Hero h = new Hero() .newBuilder()
				.withArmor(new Armor())
				.withHairColor(new HairColor())
				.build();
		
		System.out.println(h);

	}

}
