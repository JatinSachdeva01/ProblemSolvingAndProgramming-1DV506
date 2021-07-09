package js225cy_assign3;

public class MarsMain {
	public static void main(String[] args) {
		Planet mars = new Planet("Mars", 4, 2, 1.666, 1.382);
		System.out.println(mars.getName() + ":");
		System.out.println("    " + "Position:   " + mars.getPositionFromSun());
		System.out.println("    " + "Moons:      " + mars.getNoOfMoons());
		System.out.println("    " + "Aphelion:   " + mars.getAphelion());
		System.out.println("    " + "Perhelion:  " + mars.getPerihelion());
	}
}
