package july11.exam3;

public class Anonymous {
    private int field;
    public void method(final int arg1, int arg2 ){ //final 선언 안 해도 ㄱㅊ
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        /**
         * arg1 = 20;
         * arg2 = 20;
         * var1 = 30;
         * var2 = 30; 불가능
         */
        Calculatable calc = new Calculatable(){
            @Override
            public int sum(){
                int result = field + arg1 + var1 + var2;
                return result;
            }
        };

        System.out.println(calc.sum());
    }
}
