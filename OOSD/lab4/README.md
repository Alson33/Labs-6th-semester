# Structural Pattern

- Structural pattern has the concept of adding interface to the existing system inorder to make the system simplified for the end user by abstracting.

## Adapter Design Pattern

- Adapter Design Pattern falls under the Structural pattern that uses a `Apdapter class` to call methods from `a interface` using object of `Adaptee class`
- This pattern is used to join the functionalities of 2 independent interfaces.
```java
    interface Interface1 {
        public void func(){}
    }
    interface Interface2 {
        public void anotherfunc(){}
    }
    class Adaptee implements Interface2 {
        @Override
        public void anotherfunc(){
            System.out.println("Adaptee....")
        }
    }
    class Adapter implements Interface1 {
        Adaptee adaptee;
        public Adapter(Adaptee adaptee){
            this.adaptee = adaptee;
        }
        @Override
        public void func(){
            adaptee.anotherfunc();
        }
    }
```

## Facade Design Pattern

- Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
- This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
```java
interface Test {
    public void show(){}
}
class One implements Test {
    @Override
    public void show(){
        System.out.println("One");
    }
}
class Two implements Test {
    @Override
    public void show(){
        System.out.println("Two");
    }
}
class All {
    Test one;
    Test two;

    public All(){
        one = new One();
        two = new Two();
    }
    public void showOne(){
        one.show();
    }
    public void showTwo(){
        two.show();
    }
}
class Demo {
    public static void main(String[] args){
        All all = new All();

        all.showOne();
        all.showTwo();
    }
}
```

## Proxy Design pattern

- In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.
- In proxy pattern, we create object having original object to interface its functionality to outer world.
```
    Check code for example
```

## Decorator Design pattern

- Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
- This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.
```
    Check code for example
```

## Bridge Design pattern

- Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.
- This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. Both types of classes can be altered structurally without affecting each other.
```
    Check code for example
```

*All notes and codes are referenced from [tutorials point](https://tutorialspoint.com) website*