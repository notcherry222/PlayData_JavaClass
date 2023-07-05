package july5_Class.classPractice.sum;

import july5_Class.classPractice.sum.Sum;

public class SumExample {
    public static void main(String[] args) {
        Sum mySum = new Sum();

        int[] values1 = {1,2,3};
        int result1 = mySum.sum1(values1);
        System.out.println(result1);

        /**
         * 객체와 배열은 힙에 생성되기 때문에 new 사용해야 함
         */
        int result2 = mySum.sum2(new int[] {1,2,3,4,5,6});
        System.out.println(result2);
    }
}
