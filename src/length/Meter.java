package length;

/**
 * Meter is an object inherited from Length. It has a length and a unit. </br>
 * It can be added to other Lengths.
 * @author Daria Perez Alonso
 *
 */
public class Meter extends Length {

	/**
     * Store the length in this Length.
     * @param length
     */ 
	public Meter(double length) {
		super(length);
	}

	/**
     * This should add the other Length to this Length object.
     * 
     * @param other
     */
	@Override
	public void add(Length other) {
		super.setLength(other.toMeters() + this.toMeters());	
	}

	/**
     * This should return a different String if the length is exactly 1.0.
     * 
     * @return the correct name of the unit of this Length object.
     */
	@Override
	public String getUnit() {
		return super.getLength() == 1.0 ? "meter" : "meters";
	}

	/**
     * @return the length in meters
     */
	@Override
	public double toMeters() {
		return super.getLength();
	}

}
