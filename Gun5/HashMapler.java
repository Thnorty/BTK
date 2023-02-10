import java.util.HashMap;
import java.util.LinkedList;

public class HashMapler {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hey");
        hashMap.get(1);
        
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("anahtar", "deger");
        System.out.println(hashMap2.get("anahtar"));
        hashMap.put(hash("benimDegerim"), "benimDegerim");
        System.out.println(hashMap.get(hash("benimDegerim")));

        System.out.println(hashMap);
        hashMap.put(1, "hello");
        System.out.println(hashMap);

        HashMap<Integer, LinkedList<String>> hashMap3 = new HashMap<>();
        LinkedList<String> linkedList1 = new LinkedList<>();
        hashMap3.put(1, linkedList1);
        hashMap3.get(1).add("deger1");
        hashMap3.get(1).add("deger2");
        System.out.println(hashMap3);
        
    }

    public static int hash(String string) {
        int hash = 0;
        for (int i = 0; i < string.length(); i++) {
            hash += string.charAt(i);
        }
        return hash;
    }
}
