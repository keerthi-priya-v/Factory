package factorydesignpattern;

public class SelectApp {

    public SocialMedia getInstance(String app){
        if(app.equals("WA"))
            return new WhatsApp();
        else if(app.equals("Insta"))
            return new Instagram();
        else
            return new Twitter();
    }
}
