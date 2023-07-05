package july4_Array.enumerateWeek;

/**
 * 대부분 util에 있음
 */
import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {

        /**
         * today : 열거 타입 변수
         * monday~sunday : 열거 상수
         */
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        } System.out.println("오늘 요일 : " + today);

        if (today == Week.SUNDAY){
            System.out.println("DON'T TOUCH ME");
        } else { System.out.println("DON'T CALL ME");
        }
    }
}
