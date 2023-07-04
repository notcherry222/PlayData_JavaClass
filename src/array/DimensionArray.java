package array;

public class DimensionArray {
    public static void main(String[] args) {
        /**
         * 2행 3열 2차원 배열 (값 지정 안 되어있으니 null or 0 or 0.0)
         */
        int [][] mathScores = new int[2][3];

        for (int i=0;i<mathScores.length;i++){
            for (int k =0; k<mathScores[i].length;k++){
                System.out.printf(String.valueOf(mathScores[i][k]));
            } System.out.println();
        }System.out.println();


        /**
         *각 행마다 열의 개수가 다른 2차원 배열
         */
        int [][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for (int i =0; i<englishScores.length;i++){
            for(int k =0; k<englishScores[i].length; k++){
                System.out.printf(String.valueOf(englishScores[i][k]));
            } System.out.println();
        } System.out.println();

        /**
         * 배열에 값 넣어보기
         */
        int [][] javaScores = {{95,80}, {95,80,75}};
        for (int i =0 ; i<javaScores.length;i++){
            for(int k =0; k<javaScores[i].length;k++){
                System.out.printf(String.valueOf(javaScores[i][k])+"\t");
            } System.out.println();
        } System.out.println();
    }
}
