class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }

    ListNode head = new ListNode(0);
    ListNode pointer = head;
    int carry = 0;

    while (l1 != null && l2 != null) {
      int sum = carry + l1.val + l2.val;
      pointer.next = new ListNode(sum % 10);
      carry = sum / 10;
      l1 = l1.next;
      l2 = l2.next;
      pointer = pointer.next;
    }

    while (l1 != null) {
      int sum = carry + l1.val;
      pointer.next = new ListNode(sum % 10);
      carry = sum / 10;
      l1 = l1.next;
      pointer = pointer.next;
    }

    while (l2 != null) {
      int sum = carry + l2.val;
      pointer.next = new ListNode(sum % 10);
      carry = sum / 10;
      l2 = l2.next;
      pointer = pointer.next;
    }

    if (carry != 0) {
      pointer.next = new ListNode(carry);
    }

    return head.next;
  }
}
