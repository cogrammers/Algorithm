class Solution {
  public List<Integer> result = new ArrayList<Integer>();
  public void store(ListNode head) {
    if (head == null) {
      return;
    }
    store(head.next);
    result.add(head.val);
  }
  public List<Integer> reverseOrderStorage(ListNode head) {
    store(head);
    return result;
  }
}
