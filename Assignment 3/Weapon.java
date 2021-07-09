package js225cy_assign3;

import java.util.Random;

public class Weapon {

	private String Heroweapon;
	private int Enemyweapon;
	private int fist;
	private int spear;
	private int sword;
	private int dart;

	public Weapon() {
	}

	public Weapon(String choosenweapon) {
		if (choosenweapon.equals("spear"))
			this.Heroweapon = "spear";
		if (choosenweapon.equals("sword"))
			this.Heroweapon = "sword";
		if (choosenweapon.equals("fist"))
			this.Heroweapon = "fist";
		if (choosenweapon.equals("dart"))
			this.Heroweapon = "dart";

		else
			System.out.println("Error: Invalid weapon choosen " + "\n Your Hero plays with no weapon then by default");

	}

	public void setSpear() {
		this.spear = 3;
	}

	public void setFist() {
		this.fist =  2;

	}

	public int getFist() {
		return fist;
	}

	public void setEnemyweapon() {//set random damage for enemy
		Random rnd = new Random();
		this.Enemyweapon = rnd.nextInt(14) + 1;
	}

	public int getEnemyweapon() {
		return Enemyweapon;
	}

	public void setSword() {
		this.sword = 7;
	}

	public void setDart() {
		this.dart = 5;
	}

	public int getSpear() {
		return spear;
	}

	public int getSword() {
		return sword;
	}

	public int getDart() {
		return dart;
	}

	public void setWeapon(String weapon) {//for setting the weapon
		if (weapon.equals("spear"))
			this.Heroweapon = "spear";
		if (weapon.equals("sword"))
			this.Heroweapon = "sword";
		if (weapon.equals("fist"))
			this.Heroweapon = "fist";
		if (weapon.equals("dart"))
			this.Heroweapon = "dart";

	}

	public String getWeapon() {
		return Heroweapon;
	}

}
