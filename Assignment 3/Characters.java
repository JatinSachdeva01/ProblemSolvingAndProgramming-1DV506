package js225cy_assign3;

public class Characters {
	private String character;
	private int xp;
	private int rolldice;
	private int dice;
	private Weapon equiped = new Weapon();

	public Characters() {
	}

	public void setCharacter(String choosencharacter) {
		this.character = choosencharacter;
	}

	public String getCharacter() {
		return character;
	}

	public void setXp(int xpchoose) {
		this.xp = xpchoose;

	}

	public int getXp() {
		return xp;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}

	public int getDice() {
		return dice;
	}

	public void setRolldice(int noOfSides) {
		int amount = 0;
		for (int i = 0; i < getDice(); i++) {
			amount = amount + (int) (Math.random() * noOfSides) + 1;//To store the sum of the dice

		}
		this.rolldice = amount;
	}

	public int getRolldice() {
		return rolldice;
	}

	public void setWeaponed(String initialweapon) {
		this.equiped.setWeapon(initialweapon);

	}

	public void setEnemydam() {
		this.equiped.setEnemyweapon();
	}

	public String getWeaponed() {
		return equiped.getWeapon();
	}

	public int getEnemydam() {
		return this.equiped.getEnemyweapon();
	}
}
