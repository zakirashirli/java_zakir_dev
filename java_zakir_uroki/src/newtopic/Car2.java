package newtopic;

public class Car2 {
    public static void main(String[] args) {
        Car merc = new Car();
        merc.model = "amggt";
        merc.color = "black";
        merc.mass = 1500;
        merc.speed = 310;

        merc.drive();
        merc.car_info();
    }
}
