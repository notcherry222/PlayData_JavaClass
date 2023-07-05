package july5_Class.classPractice.student;

public class StudentExample {

    /**
 * public void "static" main 불가능
 * 클래스 파일 따로 만들면 가능
 *
 * ---따로 만들 경우
 * student class는 라이브러리 클래스
 * studentExample class는 실행 클래스
 *
 * ---클래스 구성
 * 필드: 속성, 데이터가 저장되는 곳 ex> String fieldName;
 * 생성자 : 객체 생성시 초기화 역할 담당
 * 메소드 : 객체의 동작에 해당하는 ㅣㄹ행 블록
 * @param args
 */
public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println("s1변수가 Student 객체를 참조합니다.");

}
}
