/**
 * Application class to test methods in Wizard class implemented from the Lockable interface.
 * @author Hannes Nilsson
 * @version 1.0
 * Lab 2
 * CS1313ON
 */
public class Application {

	public static void main(String[] args) {

		Wizard w = new Wizard("Gandalf");
		
		System.out.println(w.toString());
		w.takeDamage(50);
		System.out.println(w.toString());
		System.out.println("Setting key to 5");
		w.setKey(5);
		System.out.println("Trying key 1");
		w.lock(1);
		System.out.println(w.toString());
		System.out.println("Trying key 5");
		w.lock(5);
		System.out.println(w.toString());
		w.takeDamage(10);
		System.out.println("Trying key 3");
		w.unlock(3);
		System.out.println(w.toString());
		w.takeDamage(10);
		System.out.println("Trying key 5");
		w.unlock(5);
		w.takeDamage(50);
		System.out.println(w.toString());
		System.out.println("Dead");
	}//end main

}//end class
