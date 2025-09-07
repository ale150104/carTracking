public class Car {

    private int id;
    private String marke;
    private int Hubraum;
    private int Tankvolumen;



    private Car(){}

    static Car from(int id, String marke, int Hubraum, int Tankvolumen){
        Car car = new Car();
        car.id = id;
        car.marke = marke;
        car.Hubraum = Hubraum;
        car.Tankvolumen = Tankvolumen;
        return car;
    }

    int getId() {
        return id;
    }

    String getMarke() {
        return marke;
    }

    int getHubraum() {
        return Hubraum;
    }

    int getTankvolumen() {
        return Tankvolumen;
    }
}
