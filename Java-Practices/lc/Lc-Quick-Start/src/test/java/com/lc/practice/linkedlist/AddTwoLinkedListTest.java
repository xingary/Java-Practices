package com.lc.practice.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoLinkedListTest
{

    // Test case number: 1
    // Test case values: 2->4->3 + 5->6->4
    // Expected output 7->0->8

    @Test
    public void testAddTwoNumbers()
    {
	// GIVEN
	ListNode l1 = new ListNode(2);
	l1.next = new ListNode(4);
	l1.next.next = new ListNode(3);

	ListNode l2 = new ListNode(5);
	l2.next = new ListNode(6);
	l2.next.next = new ListNode(4);
	AddTwoLinkedList addTwoLinkedList = new AddTwoLinkedList();

	ListNode expectedList = new ListNode(7);
	expectedList.next = new ListNode(0);
	expectedList.next.next = new ListNode(8);

	// WHEN
	ListNode addedList = addTwoLinkedList.addTwoNumbers(l1, l2);
	// THEN
	assertTrue(compareTwoLists(expectedList, addedList));
    }

    private boolean compareTwoLists(ListNode l1, ListNode l2)
    {
	boolean listsEqual = true;

	ListNode temp1 = l1;
	ListNode temp2 = l2;

	while (temp1 != null && temp2 != null)
	{
	    if (temp1.val != temp2.val)
	    {
		listsEqual = false;
		break;
	    }
	    temp1 = temp1.next;
	    temp2 = temp2.next;
	}
	if (temp1 != null || temp2 != null)
	{
	    listsEqual = false;
	}

	return listsEqual;
    }

}
