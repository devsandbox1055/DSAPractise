import java.util.HashMap;
public class PairWithDifferenceK {
    int countPairs(int[] arr , int k){
        //hashmap mein key = array ka number
        //and value  = uss number ki frequency

        HashMap<Integer , Integer> map  = new HashMap<>();
        for(int ele:arr){
            //agar map mein ele pehle se hai to uski freq +1 kar do

            if(map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            //aur agar ele pehli baar mila hai to freq 1 kar do

            else
                map.put(ele,1);

            
        }
        //ab ek total pair store karne ke liye ek variable
        int pairs =  0;

        //phir map ke har unique element pe loop chala rahe hai
        for(int ele: map.keySet()){

            //ab main code
            int rem1 =  ele-k;
            int rem2  = ele+k;

            //agar map mein (ele-k) exist karta hai to 
            //pairs increase akrenge
            if(map.containsKey(rem1))
                pairs += map.get(ele) * map.get(rem2);
        }
    //ab hamlog pairs ko 2 se divide kar rahe hai kyuki (a,b) and (b,a) dono count ho gaya
    //double counting remove karne ke liye 
    pairs /= 2;

    return pairs;
    }
    
}
