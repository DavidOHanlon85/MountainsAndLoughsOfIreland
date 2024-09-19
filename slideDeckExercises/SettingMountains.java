/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class SettingMountains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mountain m1 = new Mountain();
		Mountain m2 = new Mountain();
		
		m1.setName("Donard");
		m1.setHeight(828);
		
		m2.setName("Everest");
		m2.setHeight(8848);
		
		System.out.println(m2.getName() + " is the highest mountain in the world standing at an impressive " + m2.getHeight() +"m.");
		System.out.println(m1.getName() + " is an stunning mountain in County Down standing at " +m1.getHeight() + "m.");
	}

}
