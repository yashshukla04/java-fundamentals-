package multipleinheritance;

public class Main {
    public static void main(String[] args) {

        SmartPhone smartphone = new SmartPhone();
        smartphone.PlayMusic();
        smartphone.StopMusic();

        smartphone.ClickPhoto();
        smartphone.RecordVideo();

        smartphone.MakeCall();
        smartphone.EndCall();
        smartphone.SendMessage();

    }
}