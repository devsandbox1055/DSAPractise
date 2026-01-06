public class anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2  = "silent";

        if(s1.length()  != s2.length()) {
            System.out.println("not anagram");
            return;
        }
        Int[] freq  = new int[26];

        for(int i = 0; i<s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;

        }
        for(int i = 0; i<26; i++) {
            if(freq[i] != 0) {
                System.out.println("npt anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
