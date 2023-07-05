package july5_Class.classPractice.gasState;

public class Car {
    /**
     * 필드
     */
    int gas;
    /**
     * 생성자는 없음.
     */

    /**
     * 메소드
     */
    void setGas(int gas){
        this.gas = gas;
    } //return 값 없으면 void 사용
    boolean isLeft(){
        if(gas == 0){
            return false;
        }
        return true;
    }

    void run(){
        while (true) {
           if (gas > 0){
                System.out.println("left gas : "+gas);
                gas-=1;
           } else {
                System.out.println("Check your gas.");
                return; //break; 도 가능 but 효율적이지 못해..
           }
        }
    }
}
