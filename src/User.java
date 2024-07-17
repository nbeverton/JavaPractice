
public class User {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println(smartTV.onOrOff);
        System.out.println(smartTV.chanel);
        System.out.println(smartTV.volume);

        smartTV.turnVolumeUp(5);
        System.out.println(smartTV.volume);

    }
}
