package array;
public class StringEqualsArray {
    public static void main(String[] args) {

        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("java");

        /**
         * 참조 변수의 성질 -> new해줌으로써 같은 값을 가지지만 메모리 주소는 다른!
         */

        System.out.println(strArray[0] == strArray[1]); //참조값 비교
        System.out.println(strArray[0] == strArray[2]); //참조값 비교
        System.out.println(strArray[0].equals(strArray[2])); //메모리 주소 비교
    }
}
