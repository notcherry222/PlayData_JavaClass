package july20.hasMapEx2;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1, "김채림"),17);
        map.put(new Student(1, "박건"),15);

        System.out.println("total entry : "+map.size());
    }
}
