package methodPractice;

public class mainMethod {
    /**
     * args값이 매개변수인 main method
     * @param args
     */
    public static void main(String[] args) {

        if (args.length != 2){
            System.out.println("need more index");
            System.exit(0); // 코드 강제 종료
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println("total is : " + result);
    }
}
