//question from gfg
import java.util.HashMap;

public class CountNumberOfEqualPair {
    HashMap<Character,Integer> map =  new HashMap<>();
    for(int i = 0; i<s.length(); i++){
        char ch  =  s.CharAt(i);
        map.put(ch,map.getOrDefault(ch, 0)+1);


    }
    long pairs  =  0;
    for(char ch: map:KeySet()){
        long freq = map.get(ch);
        pairs += freq*freq;

    }
    return pairs;
}
