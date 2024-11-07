package Singleton;

/*
public class Main {
    public static void main(String[] args) {

        // both will print the same address space i.e same object.  constructor will be only called once.
        SingletonClass sc1=SingletonClass.getSingleInstance();
        SingletonClass sc2=SingletonClass.getSingleInstance();
        System.out.println(sc1);
        System.out.println(sc2);

        // call iager instance
        SingletonClass  sc3=SingletonClass.getIagerInstance();
        System.out.println(sc3.hashCode());
        SingletonClass  sc4=SingletonClass.getIagerInstance();
        System.out.println(sc4.hashCode());
    }
}
 */
public class Main implements Runnable {
    @Override
    public void run() {
        SingletonClass instance = SingletonClass.getInstance1();
        System.out.println("obtained instance: " + instance);
    }

    public static void main(String[] args) throws InterruptedException{
        // Create multiple threads
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Main());
            thread.start();
            Thread.sleep(2000);
        }
    }
}