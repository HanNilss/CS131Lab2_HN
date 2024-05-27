
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author Hannes Nilsson
 * @version 1.1
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		super();
		setName("");
		setHealth(100);
		setKey(0);
		this.locked = false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		setName(name);
		setHealth(100);
		setKey(0);
		this.locked = false;
	}//end constructor
	/**
	 * Checks if the key passed into is greater than 0 and that key has not already been set,
	 * and if both return true then it sets the key, otherwise it does not set key.
	 * @param key
	 */
	public void setKey(int key) {
		if (getKey() == 0) {
			this.key = key;
		}
	}//end setKey
	
	/**
	 * Checks if parameter matches the key set for the object, if they match the object is locked.
	 * 
	 * @param key  
	 */
	public void lock(int key) {
		if (getKey() == key) {
			this.locked = true;
		}
	}//end lock 
	
	/**
	 * Checks if parameter matches the key set for the object, if they match the object is unlocked.
	 * 
	 * @param key  
	 */
	public void unlock(int key) {
		if (getKey() == key) {
			this.locked = false;
		}
	}//end unlock
	
	/**
	 * @return whether character is locked or not
	 */
	public boolean isLocked() {
		return this.locked;
	}//end isLocked
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if (isLocked() == false) {
			setHealth(getHealth()-power);
		}
		else {
			setHealth(getHealth());
		}
	}//end takeDamage 
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return this.name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return this.health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class