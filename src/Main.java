public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(2525);
        taxi.start();
        taxi.run();
        taxi.display();

        taxi.run();
        taxi.run();
        taxi.display();
    }
}