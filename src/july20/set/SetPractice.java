package july20.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체 수 : "+size);

        Iterator<String> it = set.iterator(); //자동으로 for 돌리게
        while(it.hasNext()){ //다음이 있니? 있다면 출력해조
            String element = it.next();
            System.out.println("\t"+element);
        }
        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객채 수 : "+set.size());

        for(String element : set){
            System.out.println("\t"+element);
        }
        set.clear();
        if(set.isEmpty()){
            System.out.println("비어있음.");
        }
    }
}
