public class Outerparentheseis {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(' && openCount++ > 0) {
                result.append(c);
            } else if (c == ')' && openCount-- > 1) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
