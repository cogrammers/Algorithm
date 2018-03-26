public List<Integer> findAllAnagarams(String s, String p) {
  List<Integer> result = new ArrayList<Integer>();
  if (s == null || s.length() == 0 || p == null || p.length() == 0) {
    return result;
  }
  int[] hash = new int[256];
  for (char c : p.toCharArray()) {
    hash[c]++;
  }
  int l = 0, r = 0, count = p.length();
  while (r < s.length()) {
    if (hash[s.charAt(r)] >= 1) {
      count--;
    }
    hash[s.charAt(r)]--;
    r++;
    if (count == 0) {
      result.add(r);
    }
    if (r - l == p.length()) {
      if (hash[s.charAt(l)] >= 0) {
        count++;
      }
      hash[s.charAt(l)]++;
      l++;
    }
  }
  return result;
}
