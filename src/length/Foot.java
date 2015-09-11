package length;


public class Foot extends Length {
	
	public static final double METERS_PER_FOOT = 0.3048;

	public Foot(double length) {
		super(length);
	}

	@Override
	public void add(Length other) {
		super.setLength((other.toMeters() + this.toMeters()) / METERS_PER_FOOT);
		
	}

	@Override
	public String getUnit() {
		return getLength() == 1.0 ? "foot" : "feet";
	}

	@Override
	public double toMeters() {
		return getLength() * METERS_PER_FOOT;
	}

}
