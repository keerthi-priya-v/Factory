package factorydesignpattern;

public class Twitter implements SocialMedia{


    @Override
    public void sendMessage() {
        System.out.println("In Twitter - Sent Message");
    }
}
