package oop;

public class MainRun {
    public static void main(String[] args) {

        Vihicle[] vihicles = { new Airplane(),
                               new Bus(),
                               new Train()
        };

        for (Vihicle vi: vihicles) {
            vi.move();
            vi.tranport();
            System.out.println();
        }
    }
}
