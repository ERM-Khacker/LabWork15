package abstracT;

public class Main {
   /* 3)  Создать Main класс в котором создать экземпляры данных классов и выполнить
    их методы.*/
    public static void main(String[] args) {
        SmartPhone nokia = new SmartPhone();
        nokia.name = "Nokia 5.3";
        nokia.serialNumber = 10000000;
        nokia.display = 6.55f;
        nokia.simCount = 2;
        nokia.oS = "Android One 10";
        nokia.powerOn();
        nokia.runApp();
        nokia.call();
        nokia.powerOff();

        Multi_Cooker scarlet = new Multi_Cooker();
        scarlet.name = "Scarlet";
        scarlet.serialNumber = 12345678;
        scarlet.powerOn();
        scarlet.switchProgram(30);
        scarlet.cook();
        scarlet.powerOff();

        Oven goren = new Oven();
        goren.name = "Gorenje";
        goren.serialNumber = 313231;
        goren.powerOn();
        goren.initTimer(40);
        goren.cook();
        goren.powerOff();
        System.out.println();
        /*3. В классе Main для п.1 создать статический метод, который принимает varargs из
        AbstractDevice, который выключает все переданные устройства. Проверить работу
        метода, передав в него все созданные объекты в п.1*/

        allPowerOff(goren, scarlet, nokia);
    }

    public static void allPowerOff(AbstractDevice... devices) {
        for (int i = 0; i < devices.length; i++) {
            devices[i].powerOff();
        }
    }
}
