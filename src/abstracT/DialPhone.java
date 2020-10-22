package abstracT;

import inteface.Caller;

public class DialPhone extends Phone implements Caller {
    @Override
    void call() {
        System.out.println("Выбираем из списка контактов контакт и звоним либо набираем номер");
    }

    void autoAnswer(){
        System.out.println("Автоответчик включается если хозяин не берёт трубку");
    }

    @Override
    void powerOn() {
        System.out.println("Подключаем стационарный телефон к сети. И зажимаем кнопку включения");
    }

    @Override
    void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Стационарный телефон выключается. Отключаем его от сети");
    }

    @Override
    public void calls() {
        System.out.println("Picks from list contacts and caller");
    }
}
