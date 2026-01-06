public class FirstNonRepeating {
    public static void main(String[] args) {
        String arr  = "swiss";
        int[] freq  = new int[26];

        for(char ch : arr.toCharArray()) {
            freq[ch - 'a']++;

        }
        for(char: arr.toCharArray()){
            if(freq[ch - 'a' ] == 1) {
                System.out.println(ch);
                return;

            }
        }
        System.out.println("no non repeating elements");

         }
}
