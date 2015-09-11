package length;


public class Meter extends Length {

	public Meter(double length) {
		super(length);
	}

	@Override
	public void add(Length other) {
		super.setLength(other.toMeters() + this.toMeters());
		
	}

	@Override
	public String getUnit() {
		return getLength() == 1.0 ? "meter" : "meters";
	}

	@Override
	public double toMeters() {
		return getLength();
	}

}
