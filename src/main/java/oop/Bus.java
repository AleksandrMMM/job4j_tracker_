package oop;

public class Bus implements Vihicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге");
    }

    @Override
    public void tranport() {

        System.out.println("это автобус");

    }
}
