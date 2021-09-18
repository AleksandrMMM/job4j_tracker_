package oop;

public class HierarchyUsage {
    public static void main(String[] args) {

        Car car = new Car();
        Transport transport = car;
        Object obj = new Car();
        Object objCar = new Car();

        /* приведение типа за счет снижения его иерархии */

        Car carFromObj = (Car) objCar;


    }
}
