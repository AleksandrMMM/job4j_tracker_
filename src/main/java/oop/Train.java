package oop;

public class Train implements Vihicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам");
    }

    @Override
    public void tranport() {

        System.out.println("это поезд");

    }
}
