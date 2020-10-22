package abstracT;

import inteface.Caller;
import inteface.EmailSender;

public class SmartPhone extends Mobile implements Caller, EmailSender {
    String oS;

    void runApp() {
        System.out.println("Pick some app from list applications and run it");
    }

    @Override
    public void call() {
        System.out.println("Выбираем из списка контактов имя и звоним ему");
    }

    @Override
    public String editMail(String mes) {
        return mes;
    }

    @Override
    public String createMail(String m) {
        return m;
    }

    @Override
    public void sendMail(String s) {
        System.out.println("Send " + s);
    }

    @Override
    public void calls() {
        System.out.println("Pick from list contacts and calls");
    }
}
