import java.util.Random;

public class Horse implements Runnable{
    static boolean a = true;
    String name;
    int stavka = 0;
    int distans = 0;


    void go(){
        Random rnd = new Random(System.currentTimeMillis());
        while (a) {
            distans += 20 + rnd.nextInt(50 - 20 + 1);
            say();
            try {
                Thread.sleep(100 + rnd.nextInt(300 - 100 + 1));
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
    void say(){
        System.out.println(name +" пробежала: " + distans);
        if(distans>=1000){
            System.out.println(name + " финишировала");
            a = false;
        }
    }

    public Horse(String name, int stavka) {
        this.name = name;
        this.stavka = stavka;
    }

    @Override
    public void run(){
        Random rnd = new Random(System.currentTimeMillis());
        go();
    }
}
