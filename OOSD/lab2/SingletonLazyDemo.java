package OOSD.lab2;


/**
 * Singleton class
 */
class SingletonLazy {
    private static SingletonLazy instance;

    // making constructor private to create a singleton
    private SingletonLazy() {}

    /**
     * 
     * @return {SingletonLazy}
     */
    public static SingletonLazy getInstance() {
        // making a new Singleton object only if instance is null
        // also known as Lazy initializing
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}

public class SingletonLazyDemo {
    public static void main(String[] args) {
        SingletonLazy test1 = SingletonLazy.getInstance();
        SingletonLazy test2 = SingletonLazy.getInstance();

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());

        /**
         * output:
         * 746292446
         * 746292446
         */
    }
}
