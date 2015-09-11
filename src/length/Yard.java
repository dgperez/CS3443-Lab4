package length;


public class Yard extends Length {
	
	public static final double METERS_PER_YARD = 0.9144;

	public Yard(double length) {
		super(length);
	}

	@Override
	public void add(Length other) {
		super.setLength((other.toMeters() + this.toMeters()) / METERS_PER_YARD);
		
	}

	@Override
	public String getUnit() {
		return getLength() == 1.0 ? "yard" : "yards";
	}

	@Override
	public double toMeters() {
		return getLength() * METERS_PER_YARD;
	}

}
