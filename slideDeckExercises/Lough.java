/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Lough {
	
	// Instance Variables
	
	private String name;
	private double area;
	private int volume;
	
	// Getters and Setters
	
	/**
	 * Get method that returns the name of the lough
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set method that sets the name of the lough
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get method that returns the area of the lough
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * Set method that sets the area of the lough
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	/**
	 * Get method that returns the volume of the lough
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * Set method that sets the volume of the lough
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Lough [name=" + name + ", area=" + area + ", volume=" + volume + "]";
	}
	
	

}
