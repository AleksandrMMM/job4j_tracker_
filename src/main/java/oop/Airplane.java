package oop;

public class Airplane implements Vihicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит в воздухе");
    }

    @Override
    public void tranport() {

        System.out.println("это самолет");

    }
}
