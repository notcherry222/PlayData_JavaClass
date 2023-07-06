package july5_Class.classPractice.sum;

public class Sum {
    /**
     * verision1
     * @param values
     * @return sum <없으면 컴파일에러 뜸
     */
    int sum1(int[] values){  //많은 개수를 매개변수로 받을 수 있다.
        int sum= 0;
        for (int i = 0; i<values.length ; i++){
            sum+= values[i];
        }return sum;
    }

    /**
     * version 2
     * @param values
     * @return sum
     */
    int sum2(int ... values){
        int sum = 0;
        for (int i = 0; i<values.length; i++){
            sum += values[i];
        }return sum;
    }
}
