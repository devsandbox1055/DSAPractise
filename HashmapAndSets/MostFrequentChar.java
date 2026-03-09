import java.util.HashMap;
import java.util.HashSet;

public class MostFrequentChar {
    public char getMaxOccuringCah(String s ){
        HashMap<Character, Integer> map =  new HashMap<>();
        for(int i =0; i<s.length();i++){
            char ch  =  s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq+1);


            }
            else map.put(ch,1);
        }
        int maxFreq = 0;
        for(char ch = map.keySet()){
            int freq = map.get(ch);
            if(freq>maxFreq) maxFreq = freq;


        }
        char ans = s.charAt(0);
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(freq==maxFreq){
                ans = ch;            
            }
        }
    return ans ;
    }

    
}
