package js225cy_assign3;

public class GameManager {

	public static void main(String[] args) {

		GameMechanics game = new GameMechanics("Rama", 60, "Ravana", 40, "dart");
		game.setEnemieshitpower();
		game.setHitpower();
		System.out.println(game.getFight());
	}

}
