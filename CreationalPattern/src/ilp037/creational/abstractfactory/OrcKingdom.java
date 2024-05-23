package ilp037.creational.abstractfactory;

public class OrcKingdom implements KingdomFactory {

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new OrcArmy();
	}

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new OrcKing();
	}

}
