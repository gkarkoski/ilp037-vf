package ilp037.creation.builder;

public class Hero {

		private Armor armor;
		private HairColor hairColor;
		private Profession profession;
		
		public Hero(Armor armor, HairColor hairColor, Profession profession) {
			super();
			this.armor = armor;
			this.hairColor = hairColor;
			this.profession = profession;
		}
		
		public Hero() {
		}

		public Builder newBuilder() {
			return new Hero.Builder();
		}
		
		public String toString() {
		    return new StringBuilder()
		    		.append(this.armor != null ? this.armor : "")
		    		.append(this.hairColor != null ? this.hairColor : "")
		    		.append(this.profession != null ? this.profession : "")
		    		.toString();
		}
		
		class Builder {
		private Armor a;
		private HairColor hc;
		private Profession p;
		
		public Builder withArmor(Armor armor) {
			this.a = armor;
			return this;
		}
		public Builder withHairColor(HairColor haircolor) {
			this.hc = hairColor;
			return this;
		}
		public Builder withProfession(Profession profession) {
			this.p = profession;
			return this;
			}
		public Hero build() {
			return new Hero(a, hc, p);
			
		}
		
		}
		
}
