public boolean validParenthesis(String parenthesis) {
  if (parenthesis == null || parenthesis.length() == 0) {
    return false;
  }
  Deque<Character> stack = new LinkedList<>();
  for (char c : parenthesis.toCharArray()) {
    if (c == '(') {
      stack.push(')');
    } else if (c == '[') {
      stack.push(']');
    } else if (c == '{') {
      stack.push('}');
    } else if (stack.isEmpty() || stack.pop() != c) {
      return false;
    }
  }
  return stack.isEmpty();
}
