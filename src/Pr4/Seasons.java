package Pr4;

public class Seasons {
    private static SesonsEnum favouriteSeason = SesonsEnum.SUMMER;

    public static void main(String[] args) {
        System.out.println(favouriteSeason);
        System.out.println(favouriteSeason.getTemperatureMiddle());
        System.out.println(favouriteSeason.getDescription());
        //Seasonslove(SesonsEnum.WINTER);
        Information();
    }
    public static void Seasonslove(SesonsEnum getSeason) {
        switch (getSeason) {
            case WINTER:
                System.out.println("I don't like winter");
                break;
            case SPRING:
                System.out.println("I don't like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
            case AUTUMN:
                System.out.println("I don't like autumn");
                break;
        }
    }
    public static void Information(){
        for(SesonsEnum seson: SesonsEnum.values()){
            System.out.println(seson.toString() + " temp: " + seson.getTemperatureMiddle() + " desc: " + seson.getDescription());
        }
    }
    enum SesonsEnum {
        WINTER(-10),
        SPRING(10),
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN(6),
        ;
        private double TemperatureMiddle;

        SesonsEnum(double TemperatureMiddle) {
            this.TemperatureMiddle = TemperatureMiddle;
        }
        public String getDescription() {
            return "Холодное время года";
        }
        public double getTemperatureMiddle() {
            return this.TemperatureMiddle;
        }

        }
    }




