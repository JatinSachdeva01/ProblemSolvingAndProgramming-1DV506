package js225cy_assign3;

import java.util.ArrayList;

public class MoonsMain {

	public static void main(String[] args) {
		Planet input = new Planet("Mars", 0, 0, 0.0, 0.0);
		Moon ph = new Moon("      Phobos", 2423);
		Moon de = new Moon("      Deimos", 6464);
		input.addMoon(ph);
		input.addMoon(de);
		System.out.println("Moons of " + input.getName() + " :");
		ArrayList<Moon> moons = input.getmoon();
		for (int i = 0; i < moons.size(); i++) {
			System.out.println(moons.get(i).getName());
		}
	}

}
