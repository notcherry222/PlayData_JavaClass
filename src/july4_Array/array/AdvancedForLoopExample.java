package july4_Array.array;

public class AdvancedForLoopExample {
    public static void main(String[] args) {

        int[] scores = {5, 6, 7, 8, 9};
        int sum = 0;

        //iter
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("total : "+sum);

        double avg = (double)sum/scores.length;
        System.out.println("average : " +avg);
    }
}
