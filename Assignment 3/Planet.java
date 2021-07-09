package js225cy_assign3;

import java.util.ArrayList;

public class Planet {
	private String name;
	private int positionFromSun;
	private int noOfMoons;
	private double aphelion;
	private double perihelion;
	private ArrayList<Moon> moons = new ArrayList<Moon>();

	public ArrayList<Moon> getNameOfMoons() {
		return moons;
	}

	public void setNameOfMoons(ArrayList<Moon> moons) {
		this.moons = moons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals(""))
			name = "Unknown planet";
		else
			this.name = name;
	}

	public int getPositionFromSun() {
		return positionFromSun;
	}

	public void setPositionFromSun(int positionFromSun) {
		if (positionFromSun > 0 && positionFromSun < 10)
			this.positionFromSun = positionFromSun;
		else
			positionFromSun = 0;
	}

	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		if (noOfMoons >= 0 && noOfMoons <= 100)
			this.noOfMoons = noOfMoons;
		else
			noOfMoons = 0;
	}

	public double getAphelion() {
		return aphelion;
	}

	public void setAphelion(double aphelion) {
		if (aphelion >= 0 && aphelion <= 50)
			this.aphelion = aphelion;
		else
			aphelion = 0;
	}

	public double getPerihelion() {
		return perihelion;
	}

	public void setPerihelion(double perihelion) {
		if (perihelion >= 0 && perihelion <= 30)
			this.perihelion = perihelion;
		else
			perihelion = 0;
	}

	public void addMoon(Moon Moon) {
		moons.add(Moon);
	}

	public ArrayList<Moon> getmoon() {
		return moons;
	}

	public Planet(String name, int positionFromSun, int noOfMoons, double aphelion, double perihelion) {
		setName(name);
		setPositionFromSun(positionFromSun);
		setNoOfMoons(noOfMoons);
		setAphelion(aphelion);
		setPerihelion(perihelion);
		{
		}

	}
}