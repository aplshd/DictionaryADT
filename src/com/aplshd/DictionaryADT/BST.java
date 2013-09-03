/**
 * Derived class of Dictionary
 * Implements the Binary Search tree
 */

package com.aplshd.DictionaryADT;

public class BST extends Dictionary {

	public static BST root;
	
	/**
	 * Constructor
	 */
	BST() {
		value = 0;
		parent = null;
		left = null;
		right = null;
	}

	/**
	 * Inorder traversal
	 * @param root
	 */
	void inOrder(BST p) {
		if(p == null) {
			return;
		} else {
			this.inOrder((BST) p.left);
			System.out.println(p.value + " ");
			this.inOrder((BST) p.right);
		}
	}

	/**
	 * Preorder traversal
	 * @param root
	 */
	void preOrder(BST p) {
		if(p == null) {
			return;
		} else {
			System.out.println(p.value + " ");
			this.preOrder((BST) p.left);
			this.preOrder((BST) p.right);
		}
	}

	/**
	 * inserts the integer val into the dictionary
	 * @param val
	 */
	void insert(int val) {
		if(root == null) {
			root = new BST();
			root.value = val;
		} else {
			BST p = root;
			BST y = null;
			BST newNode = new BST();
			newNode.value = val;
			while(p != null) {
				y = p;
				if(val <= p.value) {
					p = (BST) p.left;
				} else {
					p = (BST) p.right;
				}
			}
			if(val <= y.value) {
				y.left = newNode;
			} else {
				y.right = newNode;
			}
			newNode.parent = y;
		}
	}
	
	/**
	 * deletes the integer val from the dictionary
	 * @param val
	 * @return 1 if deletion is successful
	 */
	boolean delete(int val) {
		BST p = root;
		BST par = null;
		BST child = null;
		while(p != null) {
			System.out.println("p.value" + p.value);
			if(p.value == val) {
				System.out.println(p.value + "value to be deleted is found");
				if(p.left == null && p.right == null) {
					System.out.println("Value to be deleted has no children");
					par = (BST) p.parent;
					if(p == par.left) {
						System.out.println("par.left = null");
						par.left = null;
					} else {
						System.out.println("par.right = null");
						par.right = null;
					}
					p = null;
					System.out.println("case 1 delete success");
					return true;
				} else if(p.left == null || p.right == null) {
					System.out.println("Value to be deleted has one child");
					par = (BST) p.parent;
					//Find whether p's child is right or left
					//Find whether p is right or left child of par
					//Attach child to parent
					if(p.left != null) {
						//p's child is left
						child = (BST) p.left;
					} else {
						//p's child is right
						child = (BST) p.right;
					}
					if(p == par.left) {
						//p is parent's left child
						par.left = child;
					} else {
						par.right = child;
					}
					p = null;
					System.out.println("case 2 delete success");
					return true;
				} else {
					System.out.println("Value to be deleted has two children");
					BST successor = findInorderSuccessor(root, p);
					System.out.println("successor: " + successor.value);
					//Code to be completed...
					return true;
				}
				//return true;
			} else if(val < p.value) {
				p = (BST) p.left;
			} else {
				p = (BST) p.right;
			}
		}
		System.out.println("delete not success");
		return false;
	}
	
	private BST findInorderSuccessor(BST node, BST p) {
		  if(p.right != null) {
			  return minValue((BST)p.right);
		  }
		  BST par = (BST) p.parent;
		  while(par != null && p == par.right)
		  {
		     p = par;
		     par = (BST) par.parent;
		  }
		  return p;
	}

	private BST minValue(BST node) {
		BST current = node;
		while (current.left != null) {
		    current = (BST) current.left;
		}
		return current;
	}

	/**
	 * searches for the element val in dictionary
	 * @param val
	 * @return 1 if element is found in the dictionary
	 */
	boolean search(int val) {
		BST p = root;
		while(p != null) {
			System.out.println("p.value" + p.value);
			if(p.value == val) {
				System.out.println(p.value + "search success");
				return true;
			} else if(val < p.value) {
				p = (BST) p.left;
			} else {
				p = (BST) p.right;
			}
		}
		System.out.println("search not success");
		return false;
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