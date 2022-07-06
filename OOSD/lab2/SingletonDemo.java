package OOSD.lab2;

/**
 * Singleton class
 */
class Singleton {
    // Early initializing a singleton
    private static Singleton instance = new Singleton();

    // making constructor private to create a singleton
    private Singleton() {}

    /**
     * 
     * @return {Singleton}
     */
    public static Singleton getInstance() {
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton test1 = Singleton.getInstance();
        Singleton test2 = Singleton.getInstance();

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());

        /**
         * output:
         * 746292446
         * 746292446
         */
    }
}