/**
 * Main class
 */
package com.aplshd.DictionaryADT;


class DictionaryADT {
	public static void main(String args[]) {
		//System.out.println("Hello " + args[0] + " " + args[1]);
		//RBT or BST based on choice

		BST bstTree = new BST();
		bstTree.insert(78);
		bstTree.insert(65);
		bstTree.insert(60);
		bstTree.insert(93);
		bstTree.insert(47);
		bstTree.insert(-47);
		bstTree.insert(88);
		bstTree.insert(91);
		bstTree.insert(89);
		bstTree.insert(63);
		/*for(int i = 1;i< 100;i++) {
			bstTree.insert(i+3);
		}*/

		System.out.println("inorder traversal");
		bstTree.inOrder(BST.root);

		/*long k1 = System.currentTimeMillis();
		if(bstTree.search(1111)) {
			System.out.println("Main Search successful");
		} else {
			System.out.println("Main Searched value not found ");
		}
		long k2 = System.currentTimeMillis();
		long diff = k2 - k1;
		System.out.println("k1: " + k1 + ", k2: " + k2 + " diff: " + diff);*/

		if(bstTree.delete(88)) {
			System.out.println("Main Delete successful");
		} else {
			System.out.println("Main Deleted value not found ");
		}

		System.out.println("inorder again");
		bstTree.inOrder(BST.root);
	}
}