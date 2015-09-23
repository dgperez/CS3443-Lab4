package length;

/**
 * Yard is an object inherited from Length. It has a length and a unit. </br>
 * It can be converted to Meters and added to other Lengths.
 * @author Daria Perez Alonso
 *
 */
public class Yard extends Length {
	
	/**
	 * International standard conversion for yards to meters.
	 */
	public static final double METERS_PER_YARD = 0.9144;

	/**
     * Store the length in this Length.
     * @param length
     */ 
	public Yard(double length) {
		super(length);
	}

	/**
     * This should add the other Length to this Length object.
     * 
     * @param other
     */
	@Override
	public void add(Length other) {
		super.setLength((other.toMeters() + this.toMeters()) / METERS_PER_YARD);
	}

	/**
     * This should return a different String if the length is exactly 1.0.
     * 
     * @return the correct name of the unit of this Length object.
     */
	@Override
	public String getUnit() {
		return super.getLength() == 1.0 ? "yard" : "yards";
	}

	/**
     * @return the length in meters
     */
	@Override
	public double toMeters() {
		return super.getLength() * METERS_PER_YARD;
	}

}
