package july11.Exception;

public class CatchMeIfYouCan {
    /**
     * 세부적인 것을 먼저 써줄 것.
     * @param args
     */
    public static void main(String[] args) {
        try{
            String data1 = args[0];
            String data2 = args[1];

            int Value1 = Integer.parseInt(data1);
            int Value2 = Integer.parseInt(data2);
            int result = Value1+Value2;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족하옵니다.");
        } catch (Exception e){
            System.out.println("실행에 문제가 있사옵니다.");
        } finally {
            System.out.println("다시 실행하시옵소서.");
        }
    }
}
