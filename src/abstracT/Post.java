package abstracT;

import inteface.EmailSender;
import inteface.MailSender;

public class Post implements MailSender, EmailSender {
    @Override
    public String createMail(String m) {
        return m;
    }

    @Override
    public void sendMail(String s) {
        System.out.println("Mail is send");
    }

    @Override
    public String editMail(String mes) {
        return mes;
    }
}
