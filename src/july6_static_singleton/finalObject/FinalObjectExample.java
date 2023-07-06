package july6_static_singleton.finalObject;

import july6_static_singleton.finalObject.FinalObject;

public class FinalObjectExample {
    public static void main(String[] args) {

        FinalObject person = new FinalObject("chaelim");

        System.out.println(person.name);

        //이름 변경 가능 but 국적 불가능 -> 'final' 사용
        person.name = "gun?";

        System.out.println(person.name);
        System.out.println(person.nation);

    }
}
