package js225cy_assign3;

public class StonePlanets {

	public static void main(String[] args) {
		Planet[] plarr = new Planet[4];
		plarr[0] = new Planet("Mercury", 0, 0, 0.47, 0.31);
		plarr[1] = new Planet("Venus", 0, 0, 0.72, 0.72);
		plarr[2] = new Planet("Earth", 0, 1, 1.0, 0.99);
		plarr[3] = new Planet("Mars", 0, 2, 1.666, 1.382);
		plarr[3].addMoon(new Moon("Phobos", 2423));
		plarr[3].addMoon(new Moon("Deimos", 2423));
		plarr[2].addMoon(new Moon("The Moon", 2423));
		for (int i = 0; i < 4; i++) {
			System.out.println("Planet " + plarr[i].getName() + " has  aphelion " + plarr[i].getAphelion()
					+ " AU, perihelion " + plarr[i].getPerihelion() + " AU and " + plarr[i].getNoOfMoons() + " moons.");
			if (plarr[i].getNoOfMoons() > 0)
				for (int j = 0; j < plarr[i].getNoOfMoons(); j++)
					System.out.println("       " + plarr[i].getmoon().get(j).getName());
		}

	}
}