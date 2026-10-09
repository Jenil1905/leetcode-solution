class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                k += 2;
                if (k % 2 != 0) {
                    ans++;
                    k--;
                }
            } else {
                k--;
                if (k < 0) {
                    ans++;
                    k = 1;
                }
            }
        }
        return ans + k;
    }
}
