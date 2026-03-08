import java.util.HashSet;
public class Sets_STL {

    public static void main(String[] args){
        HashSet<Integer> set  = new HashSet<>();
        set.add(21); set.add(22); set.add(23); set.add(24);
        System.out.println(set.size());
        System.out.println(set.contains(22));
    }

}