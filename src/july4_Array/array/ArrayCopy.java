package july4_Array.array;

public class ArrayCopy {
    public static void main(String[] args) {
        /**
         * for문으로 배열 복사
         */
        int[] oldOne = {1,2,3};
        int[] newOne = new int[5];
        for (int i = 0 ; i < oldOne.length; i++){
            newOne[i] = oldOne[i];
        }
        for (int i = 0; i < newOne.length ; i++){
            System.out.println(newOne[i]);
        }

        /**
         * array copy 사용해서 배열 복사
         */
        String[] old = {"a","b","c"};
        String[] newArr = {"0","0","0","0","0"};
        /**
         * arraycopy(배열1, 배열1의 복사시작 번호, 배열 2, 배열 2의 복사시작번호, 복사 길이)
         */

        System.arraycopy( old, 0, newArr, 0, old.length);
        for (int i =0; i<newArr.length; i++){
            System.out.printf(newArr[i]+", ");
        }
    }
}
