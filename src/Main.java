import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[][] b = {{0, 3},{1, 2},{1, 4}};
        for (int[] arr : b){
            System.out.printf(Arrays.toString(arr));
            System.out.println(Arrays.toString(b));
        }
    }
}
 