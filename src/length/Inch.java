package length;

public class Inch extends Length {

	public static final double METERS_PER_INCH = 0.0254;

	public Inch(double length) {
		super(length);
		
	}

	@Override
	public void add(Length other) {
		super.setLength((other.toMeters() + this.toMeters()) / METERS_PER_INCH);
	}

	@Override
	public String getUnit() {
		return getLength() == 1.0 ? "inch" : "inches";
	
	}

	@Override
	public double toMeters() {
		return getLength() * METERS_PER_INCH;
	}

}
