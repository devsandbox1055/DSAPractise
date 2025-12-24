public  class isPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        int left = 0;
        int right = s.length();
        boolean isPalindrome = true;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;

            }
        left++;
        right--;
        }
    System.err.println(isPalindrome);
    }
    
}
