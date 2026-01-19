package solid.singleResponse;

public class NotificationService {
    public static void main(String[] args) {
        WhatsappService whatsappService=new WhatsappService();
        whatsappService.message("hello world");

        SmsService smsService=new SmsService();
        smsService.message("hello world");

    }
}

interface notification{
    void message(String message);
}
class SmsService implements notification{


    public void message(String message) {
        System.out.println(message+" from sms service");
    }
}

class WhatsappService{
    public void message(String message) {
        System.out.println(message+" from whatsapp service");
    }
}
