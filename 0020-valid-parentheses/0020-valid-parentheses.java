class Solution {
    public boolean isValid(String s) {
        Stack<Integer> a = new Stack<>();
        int slen = s.length();
        for (int i = 0; i < slen; i++) {
            if (s.charAt(i) == '(') {
                a.push(1);
            }
            else if (s.charAt(i) == '{') {
                a.push(2);
            }
            else if (s.charAt(i) == '[') {
                a.push(3);
            }
            else if (s.charAt(i) == ')') {
                if (a.isEmpty() || a.peek() != 1) {
                    return false;
                }
                a.pop();
            }
            else if (s.charAt(i) == '}') {
                if (a.isEmpty() || a.peek() != 2) {
                    return false;
                }
                a.pop();
            }
            else if (s.charAt(i) == ']') {
                if (a.isEmpty() || a.peek() != 3) {
                    return false;
                }
                a.pop();
            }

        }
        if (a.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}