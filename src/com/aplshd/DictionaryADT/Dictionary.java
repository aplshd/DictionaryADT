/**
 * Base class
 * Derived classes BST and RBT both implement
 * void Insert(val), boolean Delete(val), boolean Search(val),
 * void ClearADT() and void Display()
 */
package com.aplshd.DictionaryADT;

public class Dictionary {
	int value;
	Dictionary parent;
	Dictionary left;
	Dictionary right;	
    
	/**
	 * Constructor
	 */
	Dictionary() {
		value = 0;
		parent = null;
		left = null;
		right = null;
	}

	/**
	 * For setting up the dictionary with values from
	 * the file InputF ileName
	 * @param inputFileName
	 * @param timeFileInsert
	 */
	void populateDictionary(String inputFileName, String timeFileInsert) {
		
	}
	
	/**
	 * For performing a sequence of search operations
	 * @param searchFileName
	 * @param timeFileSearch
	 */
	void locateInDictionary(String searchFileName, String timeFileSearch) {
		
	}
	
	/**
	 * inserts the integer val into the dictionary
	 * @param val
	 */
	void insert(int val) {
		System.out.println("Dictionary class insert");
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