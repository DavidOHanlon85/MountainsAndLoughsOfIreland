/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class SettingLoughs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lough l1 = new Lough();
		Lough l2 = new Lough();
		
		l1.setName("Lough Neagh");
		l1.setArea(392.5);
		l1.setVolume(3);
		
		l2.setName("Lough Beg");
		l2.setArea(23.3);
		l2.setVolume(1);
		
		System.out.println(l1.getName() + "\n" + l1.getArea() + "\n" + l1.getVolume());
		System.out.println();
		System.out.println(l2.getName() + "\n" + l2.getArea() + "\n" + l2.getVolume());
		
		
		System.out.println(l1.toString());
		String lough2 = l2.toString();
		System.out.println(lough2);
		
		System.out.println(l2);
	}

}
