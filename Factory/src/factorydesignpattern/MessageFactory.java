package factorydesignpattern;

public class MessageFactory {

    public static void main(String args[]){

        SocialMedia socialMedia1 = new WhatsApp();
        socialMedia1.sendMessage();

        //Client application
        SelectApp application = new SelectApp();
        SocialMedia socialMedia2 = application.getInstance("Insta");
        socialMedia2.sendMessage();
        SocialMedia socialMedia3 = application.getInstance("");
        socialMedia3.sendMessage();

    }
}
