package com.hokumus.eb.linklist;

public class LinkListesi {
	
	
	void add(int data,Node node) {
		Node geci = null;
		while(node.next != null) {
			geci = node.next;
		}
		
		geci.next = new Node();
		geci = geci.next;
		geci.data = data;
		geci.next = null;
		
		
	}
	
	
	public class Node{
		int data;
		Node next = null;
	}

}
