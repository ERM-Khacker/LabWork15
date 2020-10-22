package abstracT;

public class Multi_Cooker extends MultiCooker {
    @Override
    void cook() {
        System.out.println("Кладём всё необходимое в мультиварку и выбираем режим приготовления");
    }

    void switchProgram(int min){
        System.out.println("Выбираем программу и устанавливаем таймер приготовления " + min);
    }
}
