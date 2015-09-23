package length;

/**
 * Foot is an object inherited from Length. It has a length and a unit. </br>
 * It can be converted to Meters and added to other Lengths.
 * @author Daria Perez Alonso
 *
 */
public class Foot extends Length {
	
	/**
	 * International standard conversion for feet to meters.
	 */
	public static final double METERS_PER_FOOT = 0.3048;

	/**
     * Store the length in this Length.
     * @param length
     */ 
	public Foot(double length) {
		super(length);
	}

	/**
     * This should add the other Length to this Length object.
     * 
     * @param other
     */
	@Override
	public void add(Length other) {
		super.setLength((other.toMeters() + this.toMeters()) / METERS_PER_FOOT);
	}

	/**
     * This should return a different String if the length is exactly 1.0.
     * 
     * @return the correct name of the unit of this Length object.
     */
	@Override
	public String getUnit() {
		return super.getLength() == 1.0 ? "foot" : "feet";
	}

	/**
     * @return the length in meters
     */
	@Override
	public double toMeters() {
		return super.getLength() * METERS_PER_FOOT;
	}

}
