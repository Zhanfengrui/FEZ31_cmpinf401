package lab9;

public class Cylinder extends Circle

{

	double height;

	public Cylinder() {

		super();

		this.height = 1.0;

	}

	public Cylinder(double radius, double height) {

		super(radius);

		this.height = height;

	}

	public Cylinder(double radius, String color, double height) {

		super(radius, color);

		this.height = height;

	}

	public double getHeight() {

		return height;

	}

	public void setHeight(double height) {

		this.height = height;

	}

	public double getVolume()

	{

		double volume = this.getArea() * this.getHeight();

		return volume;

	}

}