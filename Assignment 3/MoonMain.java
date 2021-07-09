package js225cy_assign3;

public class MoonMain {
	public static void main(String[] args) {
		Moon input = new Moon("Ganymede", 5262);
		System.out.println("Largest moon in the solar system is " + input.getName() + " which");
		System.out.println("is " + input.getDiameter() + " km in diameter.");

	}
}
