package array;

/**
 * 배열은 참조 변수!
 */
public class ArrayList {
    /**
     * 배열 선언 -----------------------------------------------
     * 형식 1. 타입[] 변수  int[] intArray;
     * 형식2. 타입 변수[]   int intArray[];
     * 참조할 객체가 없다면 null값으로 초기화 가능  타입[] 변수 = null;
     *
     * 배열 생성------------------------------------------------
     * 타입[] 변수 = {값1, 값2, 값3, ...}; -> 선언과 값 지정 동시에 (변수는 스택에 값은 힙에 저장)
     */
    public static void main(String[] args){

        int[] score = {80, 90, 87};

        for (int i = 0; i< score.length ; i++){
        System.out.println("score["+i+"] : "+score[i]);}

        int sum = 0;
        for(int i = 0;i<3;i++){
            sum += score[i];
        }
        System.out.println("total : "+sum);
        double avg = (double)sum/3;
        System.out.println("average : "+avg);
    }
}
