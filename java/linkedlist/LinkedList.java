
class LinkedList {
	class ListNode {
		ListNode next;
		int data;

		ListNode(int datum) {
			data = datum;
		}

		ListNode(int datum, ListNode nx) {
			next = nx;
		}
	}

	ListNode head;
	int sz;

	LinkedList() {
		head = null;
		sz = 0;
	}

	void add(int elt) {
		ListNode item = new ListNode(elt);
		ListNode trv = head;
		sz++;
		if (head == null) {
			head = item;
			return;
		}
		while (trv.next != null) {
			trv = trv.next;
		}
		trv.next = item;
	}

	void print() {
		ListNode trv = head;
		while (trv.next != null) {
			System.out.println(trv.data);
			trv = trv.next; 
		}
	}
}