package JavaBegin.TaskTransport;


import JavaBegin.TaskTransport.car.Car;


public class Main {

    public static void main(String[] args) {

        // сначала создаем движок, чтобы его включить в Car
       Engine engine = new Engine(10);

        Car car = new Car(10,engine);
        System.out.println("car.getEngine().getVolume() = " + car.getEngine().getVolume());

    }
}
