class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        String segmentToReverse = word.substring(0, index + 1);
        String reversedSegment = new StringBuilder(segmentToReverse).reverse().toString();
        
        
        String result = reversedSegment + word.substring(index + 1);
        
        return result;
    }

    public static void main(String[] args) {
      
        Solution solution = new Solution();
        System.out.println(solution.reversePrefix("abcdefd", 'd')); 
        System.out.println(solution.reversePrefix("abcd efd", 'd')); 
        System.out.println(solution.reversePrefix("xyxz xe", 'z')); 
        System.out.println(solution.reversePrefix("abcd", 'z')); 
    }
}
