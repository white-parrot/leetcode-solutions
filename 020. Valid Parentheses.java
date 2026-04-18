class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 != 0) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '('); map.put(']', '['); map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(!map.containsKey(x)){
                stack.push(x);
            } else {
                if(stack.isEmpty() || stack.peek() != map.get(x) ){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
