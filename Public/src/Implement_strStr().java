//Implement strStr()
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        int needleLength = needle.length();
        // Loop through the haystack and slide the window
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}