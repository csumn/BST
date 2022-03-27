package com.bridgelabz;

public class BinarySearchTree {
	public static void main(String[] args) {
		givenNumberWhenAddedToBSTShouldReturnSize13();
	}

	public static void givenNumberWhenAddedToBSTShouldReturnSize13() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		Integer size = myBinaryTree.getSize();
		System.out.println("Size of Binary Tree is "+size);
		boolean result = size.equals(13);
		System.out.println("\n"+result);
		boolean element = myBinaryTree.search(63); 
		System.out.println("\n"+element);
		
//		boolean element1 = myBinaryTree.search(100); 
//		System.out.println("\n"+element1);
	}
}
