

public class Hippodrom {

    public static void main(String[] args) {
            new Thread(new Horse("Плотва", 1000)).start();
            new Thread(new Horse("Сивка", 500)).start();
            new Thread( new Horse("Кобылка", 700)).start();

    }
}
