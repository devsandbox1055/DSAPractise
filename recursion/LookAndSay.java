public class LookAndSay {
    //Main Function
    public static void main(String[] args) {
        int n = 5;
        System.out.println(las(n));

    }
    //logic for look and say
    public static String las(int n){
        //base case
        if(n==1) {
            return "1";

        }
        //recursive call
        String prev  = las(n-1);
        String result = "";

        int i = 0;
        int j = 0;

        while(j<prev.length()) {
            if(prev.charAt(i) == prev.charAt(j)){
                j++;

            } else {
                int count = j-1;
                result += count;
                result += prev.charAt(i);

            }
        }
        //last group handle karne ke liye
        int count  = j-1;
        result += count;
        result += prev.charAt(i);

        return result;
    }

}
