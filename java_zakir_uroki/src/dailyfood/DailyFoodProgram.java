package dailyfood;

public class DailyFoodProgram {
    // остальное дома
}

class Courier{
    void deliver(){
        System.out.println("Курьер едет");
    }
}

class BikeCourier extends Courier{
    @Override
    void deliver(){
        System.out.println("Курьер на bike!");
    }
}

class CourierScooter extends Courier{
    @Override
    void deliver(){
        System.out.println("на скутер");
    }
}

// доп методы и классы
// bonus classes
