public class SubString {
    public static void main(String[] args) {
        String s  = "Devesh";
        for(int i = 0; i<s.length();i++){
            for(int j = i; j<s.length(); j++){
                System.out.print(s.substring(i,j+1)+ " ");

            }
        System.out.println();
        }
    }
}
