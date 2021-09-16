package poly;

public class Bus implements Transport {

    @Override
    public void run() {
        System.out.println("Пристегните ремни безопасности!");
    }

    @Override
    public void pass(int numberPas) {
        System.out.println("Количество пассажиров - " + numberPas);
    }

    @Override
    public int energy(int gallon) {
        int maxtank = 60;
        System.out.println("Полный бак!");
        return Math.max(gallon, maxtank);
    }
}
