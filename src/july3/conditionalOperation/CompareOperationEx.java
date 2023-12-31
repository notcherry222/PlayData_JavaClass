package july3.conditionalOperation;

public class CompareOperationEx {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3); //true

        double v4 = 0.1;
        float v5 = 0.5f;
        System.out.println(v4 == v5); //false
        System.out.println((float)v4 == v5);  //false
        System.out.println((int)v4*10 == (int)v5*10); //true
    }

}
