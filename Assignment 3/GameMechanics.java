package js225cy_assign3;

public class GameMechanics {

	private Characters Hero = new Characters();
	private Characters Enemy = new Characters();
	public Weapon weapons;
	private int hitpower;
	public Weapon herowip = new Weapon();
	private int ehitpower;

	public GameMechanics() {
	}

	public GameMechanics(String hero, int heroxp, String enemy, int enemyxp, String weapon) {
		Hero = new Characters();
		Enemy = new Characters();

		this.Hero.setCharacter(hero);
		this.Hero.setXp(heroxp);
		this.Hero.setDice(3);

		this.Enemy.setCharacter(enemy);
		this.Enemy.setXp(enemyxp);
		this.Enemy.setDice(4);

		this.weapons = new Weapon(weapon);
		Hero.setWeaponed(this.weapons.getWeapon());
	}

	public void setCharacter(String hero, String enemy) {
		this.Hero.setCharacter(hero);
		this.Hero.setCharacter(enemy);

	}

	public void setWeapons(String weapon) {
		this.weapons = new Weapon(weapon);

		Hero.setWeaponed(this.weapons.getWeapon());
		Enemy.setEnemydam();
	}

	public void setHitpower() {//to get the weapon and get the hitpower

		if (Hero.getWeaponed().equals("fist"))
			this.herowip.setFist();
		this.hitpower = this.herowip.getFist();

		if (Hero.getWeaponed().equals("spear"))
			this.herowip.setSpear();
		this.hitpower = this.herowip.getSpear();

		if (Hero.getWeaponed().equals("sword"))
			herowip.setSword();
		this.hitpower = this.herowip.getSword();

		if (Hero.getWeaponed().equals("dart"))
			this.herowip.setDart();
		this.hitpower = this.herowip.getDart();

	}

	public void setEnemieshitpower() {
		Enemy.setEnemydam();
		ehitpower = Enemy.getEnemydam();
	}

	public int getEnemieshitpower() {
		return ehitpower;
	}

	public int getHitpower() {
		return hitpower;
	}

	public String getFight() {

		int enemy = Enemy.getXp(), hero = Hero.getXp();
		if (Hero.getWeaponed().equals("fist")) {
			System.out.println(Hero.getCharacter() + " has " + Integer.toString(hero) + " XP his fist "
					+ " to fight with.\n" + Enemy.getCharacter() + " has " + Integer.toString(enemy)
					+ " XP and uses his fists to fight with.");
		}
		System.out.println(Hero.getCharacter() + " has " + Integer.toString(hero) + " XP and a " + Hero.getWeaponed()
				+ " to fight with.\n" + Enemy.getCharacter() + " has " + Integer.toString(enemy)
				+ " XP and uses his fists to fight with.");
		int l = 0;

		while (enemy > 0 || hero > 0) {
			this.Hero.setRolldice(6);
			this.Enemy.setRolldice(5);
			System.out.println("Round " + (l + 1));
			if (this.Hero.getRolldice() > this.Enemy.getRolldice()) {//if hero gives damage
				int damage = this.Hero.getRolldice();
				enemy = enemy - damage;
				System.out.println(Hero.getCharacter() + " gives " + Enemy.getCharacter() + " a powerful blow!");
				if (enemy > 0) {
					System.out.println(Enemy.getCharacter() + " is still alive");
				}
			} else {
				System.out.println(Hero.getCharacter() + " gives his all, but " + Enemy.getCharacter() + " dodges!");
			}

			this.Enemy.setRolldice(5);
			this.Hero.setRolldice(6);

			if (this.Enemy.getRolldice() > this.Hero.getRolldice()) {//if enemy causes damage
				int damage = this.Hero.getRolldice();
				hero = hero - damage;
				System.out.println(Enemy.getCharacter() + " gives " + Hero.getCharacter() + " a dirty blow!");
			} else {
				System.out.println(
						Enemy.getCharacter() + " tries his best but " + Hero.getCharacter() + " dodges the blow!");
			}
			l++;

		}
		if (enemy < 0) {//if enemy looses
			System.out.println(Hero.getCharacter() + " lands the last blow!");
			return Enemy.getCharacter() + " is defeated!";
		} else if (hero < 0) {//if hero looses
			System.out.println("Funny but " + Enemy.getCharacter() + " lands the last blow!");
			return Hero.getCharacter() + " is defeated";
		}
		return "";
	}

}
