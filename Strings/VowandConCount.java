public class VowandConCount {
    public static void main(String[] args) {

        String s  = "devesh ojha";
        int vowelcount  =0;
        int con = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            //check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;


            } else {
                con++;

            }
        }
        System.out.println("Vowels: " + vowelcount);
        System.out.println("Consonants: " + con);
    }

}

