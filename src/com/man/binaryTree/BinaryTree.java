package com.man.binaryTree;

import java.util.List;

public class BinaryTree {

	Node rootNode = null;
	 static {
		 int a = 5;
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bTree = new BinaryTree();
		bTree.insert1(5);
		bTree.insert1(3);
		bTree.insert1(7);
		bTree.insert1(2);
		bTree.insert1(4);
		bTree.insert1(1);
		bTree.insert1(9);
		bTree.insert1(6);
		bTree.insert1(8);
		bTree.insert1(15);
		bTree.insert1(14);
		bTree.insert1(12);
		bTree.insert1(11);
		System.out.println(bTree.rootNode.data);
		System.out.println(bTree.rootNode.leftNode.data);
		System.out.println(bTree.rootNode.rightNode.data);

	}

	public static void display(int x) {
		if (x > 0) {
			x = x - 1;
			display(x);
			System.out.println(x);
		}
	}

	public void insert(int data) {
		Node myRoot = null;
		// creating root node when no root node.
		if (rootNode == null) {
			this.rootNode = new Node();
			rootNode.data = data;
		} else {

			if (data < getRootNode().data) {
				if (getRootNode().leftNode != null) {
					myRoot = getRootNode();
					rootNode = getRootNode().leftNode;
					insert(data);
				} else {
					Node leftNode = new Node();
					leftNode.data = data;
					getRootNode().leftNode = leftNode;
				}
			} else if (data > getRootNode().data) {
				if (getRootNode().rightNode != null) {
					this.setRootNode(getRootNode().rightNode);
					insert(data);
				} else {
					Node rightNode = new Node();
					rightNode.data = data;
					getRootNode().rightNode = rightNode;
				}
			}
		}

	}

	public void insert1(int data) {
		if (this.getRootNode() == null) {
           this.rootNode=new Node();
           rootNode.data=data;
		}
		Node myNode=getRootNode();
		if(data<myNode.data){
			
			if(myNode.leftNode==null)
			{
				Node node=new Node();
				node.data=data;
				myNode.leftNode=node;
						
			}else if(myNode.leftNode!=null)
			{
			while(myNode.leftNode!=null && data<myNode.data)
			{
				  myNode=myNode.leftNode;
			}
			if(data<myNode.data){
			Node node=new Node();
			node.data=data;
			myNode.leftNode=node;
			}
			}
			
		} if(data>myNode.data){
		//	myNode=getRootNode();
			if(myNode.rightNode==null){
				Node node=new Node();
				node.data=data;
				myNode.rightNode=node;
			}else if(myNode.rightNode!=null ){
				while(myNode.rightNode!=null &&data> myNode.data){
					myNode=myNode.rightNode;
				}
				if(data> myNode.data){
				Node node=new Node();
				node.data=data;
				myNode.rightNode=node;
				}
			}
			
		}if(data<myNode.data){
			if(myNode.leftNode==null){
				Node node=new Node();
				node.data=data;
				myNode.leftNode=node;
			}else if(myNode.leftNode!=null)
			{
			while(myNode.leftNode!=null && data<myNode.data)
			{
				  myNode=myNode.leftNode;
			}
			if(data<myNode.data){
			Node node=new Node();
			node.data=data;
			myNode.leftNode=node;
			}
			}
		}
	}

	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

}

class Node  {

	Node leftNode;
	int data;
	Node rightNode;
}
