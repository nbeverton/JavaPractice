public class SmartTV {

    boolean onOrOff = false;
    int chanel = 1;
    int volume = 10;

    void turnVolumeUp (int numberVolume){
        volume = volume + numberVolume;
    }

    void turnOn(){
        onOrOff = true;
    }

    void turnOff(){
        onOrOff = false;
    }

}
