package july10.interfaceExample;

public interface RemoteControl {
        //상수
        int max_volume = 10;
        int min_volume = 0;

        //추상 메소드
        void  turnOn();
        void turnOff();
        void setVolume(int volume);
}
