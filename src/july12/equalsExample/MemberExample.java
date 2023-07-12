package july12.equalsExample;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("red");

        if(obj1.equals(obj2)){
            System.out.println("ob1과 obj2는 동등해");
        }else{
            System.out.println("ob1과 obj2는 달라");
        }
    }
}
