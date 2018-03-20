class Solution {
  public ListNode insertIntoACyclicSortedList(ListNode node, int x) {
    if (node == null) {
      ListNode newNode = new ListNode(x);
      newNode.next = newNode;
      return newNode;
    }

    ListNode crt = node;
    ListNode pre = null;

    do {
      pre = crt;
      crt = crt.next;

      if (pre.val <= x && x <= crt.val) {
        break;
      }
      if ((pre.val > crt.val) && (pre.val < x || x < crt.val)) {
        break;
      }
    } while (crt != node);

    ListNode newNode = new ListNode(x);
    pre.next = newNode;
    newNode.next = crt;
    return newNode;
  }
}
