package july20.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //MAP COLLECTION 생성
        Map<String, Integer> map = new HashMap<String,Integer>();

        //객체 생성(key값은 중복 불가!)
        map.put("김채림",100);
        map.put("안용권",95);
        map.put("김채영",90);
        map.put("김채윤",80);
        System.out.println("총 entry 수 : "+map.size());

        //객체 찾기
        System.out.println("\t 김채림 : "+map.get("김채림"));
        System.out.println();

        //객체를 하나씩 처리 - while문 암기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key+" : "+value);
        }
        System.out.println();

        //객체 전체 삭제
        map.clear();
        System.out.println("total entry :" +map.size());
    }
}
