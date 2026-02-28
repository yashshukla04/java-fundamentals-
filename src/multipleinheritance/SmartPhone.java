package multipleinheritance;


public class SmartPhone implements MusicPlayer, Camera, Phone {


    @Override
    public void ClickPhoto() {
        System.out.println("clicked a photo");
    }

    @Override
    public void RecordVideo() {
        System.out.println("Recording a Video");
    }

    @Override
    public void PlayMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void StopMusic() {
        System.out.println("stopped Music");
    }

    @Override
    public void MakeCall() {
        System.out.println("Making a Call");
    }

    @Override
    public void EndCall() {
        System.out.println("Ended the call");
    }

    @Override
    public Void SendMessage() {
        System.out.println("sending a message");
        return null;
    }
}
