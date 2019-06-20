package com.lc.practice.linkedlist;

class ListNode
{
    int val;
    ListNode next;

    ListNode(int x)
    {
	val = x;
    }
}

public class AddTwoLinkedList
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
	ListNode result = new ListNode(0);
	ListNode current = result;
	int carry = 0;
	int value = 0;
	int sum = 0;

	while (l1 != null && l2 != null)
	{
	    sum = l1.val + l2.val + carry;
	    value = sum % 10;
	    carry = sum / 10;
	    current.next = new ListNode(value);
	    current = current.next;
	    l1 = l1.next;
	    l2 = l2.next;
	}
	while (l1 != null)
	{
	    sum = l1.val + carry;
	    value = sum % 10;
	    carry = sum / 10;
	    current.next = new ListNode(value);
	    current = current.next;
	    l1 = l1.next;
	}
	while (l2 != null)
	{
	    sum = l2.val + carry;
	    value = sum % 10;
	    carry = sum / 10;
	    current.next = new ListNode(value);
	    current = current.next;
	    l2 = l2.next;
	}
	if (carry != 0)
	{
	    current.next = new ListNode(1);
	}
	return result.next;
    }

}
