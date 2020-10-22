package abstracT;

import inteface.EmailSender;
/*2. Работа с интерфейсами. Создать интерфейсы и реализовать их в классах.
        1)  Методы реализовать аналогично п.1.
        2)  Создать метод Main с main методом, создать и проверить работу объектов,
        аналогично п.1*/
public class Main2 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.calls();
        phone.createMail("Васёк побежал");
        phone.sendMail("Отправить");

        DialPhone dialPhone = new DialPhone();
        dialPhone.calls();

        Post post = new Post();
        post.createMail("lalalalala");
        post.sendMail("send");
        System.out.println();
        /*4. В классе Main для п.2 создать статический метод, который принимает varargs из
        MailSender, который выполняет рассылку писем из всех источников. Проверить работу
        метода, передав в него все созданные экземпляры классов типа SmartPhone и Post.*/

        allMailing(phone, post);
    }

    public static void allMailing(EmailSender... emailSenders) {
        for (int i = 0; i < emailSenders.length; i++) {
            emailSenders[i].sendMail("Рассылка писем всем");
        }
    }
}
