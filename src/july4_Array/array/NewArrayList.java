package july4_Array.array;

public class NewArrayList {
    /**
     * 베열 변수를 미리 선언한 후 값 목록들이 나중에 결정되는 상황 -> new 연산자 사용
     * Sting[] names = null;
     * names = new String[] {"a", "b", "c"};
     */
    public static void main(String[] args){
        int score[];
        score = new int[] {83, 90, 87};

        int sum = 0;
        for(int i = 0; i<3 ; i++){
            sum += score[i];
        }
        System.out.println("total : "+sum);

        int newSum = add(new int[] {80, 80, 80});
        System.out.println("total after adding scores : " + newSum);
    }

    /**
     * add 메서드
     * 매개 변수 : int배열 (int[] score)
     * @return : sum
     */
    public static int add(int[] score){
        int sum1 = 0;
        for (int i=0;i<3;i++){
            sum1+=score[i];
        }return sum1;
    }
}
