package july12.equalsExample;

public class EqualsTest {
    public static void main(String[] args) {
        String a = "123";
        String b = "456";
        String c = new String("123");

        Integer num1 = 1;
        Integer num2 = 1;
        int num3 = 1;
        int num4 = 1;

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(num1.equals(num2));
        System.out.println(num1.equals(num3));
//        System.out.println(num4.equals(num3));
    }
}
