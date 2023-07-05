package july5_Class.classPractice.methodOverRoading;

public class CaculatorExample {
    public static void main(String[] args) {
        Calculator mine = new Calculator();

        //정사각형
        double result1 = mine.areaRectangle(10);
        //직사각형
        double result2 = mine.areaRectangle(10,20);

        System.out.println(result1 +" "+ result2);
    }
}
