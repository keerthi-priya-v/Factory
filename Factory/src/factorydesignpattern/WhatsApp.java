package factorydesignpattern;

public class WhatsApp implements SocialMedia{


    @Override
    public void sendMessage() {
        System.out.println("In WhatsApp - Sent Message");
    }
}
