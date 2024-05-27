/**
 * This interface contains methods to regulate the locking and unlocking of a class in a D&D type game. If character is locked,
 * it cannot receive any damage.
 * @author Hannes Nilsson
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public interface Lockable {

	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();
	
}//end interface
