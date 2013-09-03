/**
 * Derived class of Dictionary
 * Implements the Red Black tree
 */

package com.aplshd.DictionaryADT;

public class RBT extends Dictionary {
	
	public static RBT root;

	boolean isBlack;

	/**
	 * Constructor
	 */
	RBT() {
		//value = 0;
		isBlack = true;
	}

	/**
	 * inserts the integer val into the dictionary
	 * @param val
	 */
	void insert(int val) {
		
	}
	
	/**
	 * deletes the integer val from the dictionary
	 * @param val
	 * @return 1 if deletion is successful
	 */
	boolean delete(int val) {
		return true;
	}
	
	/**
	 * searches for the element val in dictionary
	 * @param val
	 * @return 1 if element is found in the dictionary
	 */
	boolean search(int val) {
		return true;
	}

	/**
	 * Clears the Dictionary
	 */
	void clearADT() {
		
	}
	
	/**
	 * Displays all the values in the dictionary
	 */
	void display() {
		
	}
}