package abstracT;

public class Oven extends MultiCooker {
    @Override
    void cook() {
        System.out.println("Накладываем все что нужно на противень и ставим в духовое отделение и готовим");
    }

    void initTimer(int min){
        System.out.println("Устанавливаем таймер приготовления: " + min);
    }
}
