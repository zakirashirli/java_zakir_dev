package newtopic;

public class Car {
    String color;
    String model;
    int mass;
    int speed;
    double cost;

    void drive(){
        System.out.println("Машина едет со скоростью " + speed);
    }

    void car_info() {
        System.out.println("Модель машины "+ model);
        System.out.println("Цвет машины " + color);
    }
}
