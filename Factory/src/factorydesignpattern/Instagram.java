package factorydesignpattern;

public class Instagram implements SocialMedia{
    @Override
    public void sendMessage() {
        System.out.println("In Instagram - Sent Message");
    }
}
