public Set<String> kDistinctChar(String str, int k) {
  Set<String> res = new HashSet<String>();
  if (str == null || str.length() < 1 || k <= 0) {
    return res;
  }
  Set<Character> set = new HashSet<Character>();
  Char[] temp = str.toCharArray();
  int l = 0, r = 0;
  while (r < temp.length) {
    if (set.contains(temp[r]) || r - l + 1 > k) {
      set.remove(temp[l++]);
    } else {
      set.add(temp[r++]);
    }
    if (r - l + 1 == k) {
      String substring = str.substring(l, r + 1);
      if (!res.contains(substring)) {
        res.add(substring);
      }
    }
  }
  return res;
}
