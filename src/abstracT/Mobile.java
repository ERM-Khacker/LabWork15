package abstracT;

public class Mobile extends Phone {
    int simCount;
    float display;


    @Override
    void call() {
        System.out.println("При звонке выбираем из какой сим-карты звонить.\tВыбираем контакт из меню, звоним." +
                " Поднимаем трубку, набираем номер, звоним");
    }

    @Override
    void powerOn() {
        System.out.println("Зажимаем кнопку вкл/выкл. Мобильный телефон запускается.");
    }

    @Override
    void powerOff() {
        System.out.println("Зажимаем кнопку выкл/вкл. Мобильный телефон выключается.");
    }

}
