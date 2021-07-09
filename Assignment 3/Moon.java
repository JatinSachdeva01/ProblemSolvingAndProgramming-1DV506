package js225cy_assign3;

public class Moon {
	private String name;
	private int diameter;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public Moon(String name, int diameter) {
		setName(name);
		setDiameter(diameter);
	}
}
