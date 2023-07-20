package july20.hashEx;

import java.util.HashSet;
import java.util.Set;

public class hashExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("김채림",26));
        set.add(new Member("박건",28));

        System.out.println("총 객체 수 : "+set.size());
    }
}
