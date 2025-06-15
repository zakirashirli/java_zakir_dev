package newtopic;

public class Car1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.color = "blue";
        bmw.model = "M5";
        bmw.mass = 1000; // kg
        bmw.speed = 300; // km

        bmw.drive();
        bmw.car_info();


    }
}
