## Singleton Design Pattern

- Singleton Desing pattern follows the concept of creating a `single object instance` for each and every object of that class.
- Using Singleton Classes we can create a heavy object only once and reuse the `same object instance` again and again.

### Ways of creating Singleton

1. Early initialization or Normal Singleton
    - In this way of creating singleton class we initialize an object of the singleton class and return the same instance using a getter function.
    ```java
        private static SingletonClass instance = new SingletonClass();

        public static SingletonClass getInstance() {
            return instance;
        }
    ```
    - Disdavantage of early initialization is the object is created even way before needed.
2. Lazy initialization
    - In this way of creating singleton class we don't initialize an object of the singleton class ahead but return the instance using a getter function and check if instance is present already or not then initialize if needed.
    ```java
        private static SingletonClass instance;

        public static SingletonClass getInstance() {
            if(instance == null){
                // lazy initialization
                instance = new SingletonClass();
            }
            return instance;
        }
    ```
    - Disdavantage of lazy initialization and early initialization both is we can only create a single instance of the class.
3. Enum Typed 
    - In this way of creating singleton class we initialize an Map containing an `Enum` as Key and an `instance` as value, then using getter function we check if the instance for an Enum type is present or not if not add new key-value then return else return the old instance.
    ```
    check the lab work for example
    ```