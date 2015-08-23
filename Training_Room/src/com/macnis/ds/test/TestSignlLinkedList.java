package com.macnis.ds.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.macnis.ds.main.SinglyLinkedList;

public class TestSignlLinkedList {
	

	@Test
	public void testEmptySinglyLinkedList()
	{
		SinglyLinkedList lSinglyLinkedList = new SinglyLinkedList();
//		test without any value or node in the list
		Assert.assertEquals(0, lSinglyLinkedList.length());
		Assert.assertTrue(lSinglyLinkedList.isEmpty());
		
	}
	
	@Test
	public void testSinglyLinkedListWithElement(){

//		linkedlist should not be empty
		SinglyLinkedList lSinglyLinkedList = new SinglyLinkedList();
		lSinglyLinkedList.append("Node1");
		
		Assert.assertFalse(lSinglyLinkedList.isEmpty());
		Assert.assertEquals(1, lSinglyLinkedList.length());
	}
	
}
