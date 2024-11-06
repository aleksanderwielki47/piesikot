
interface Animal{
    void sound();
    default void sleep() {
        System.out.println("zwierze idzie spac");
    }
    public static void endOfDay(){
        System.out.println("dzien sie konczy");
    }
}

class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Woof Woof!");
    }
}

class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("Meow Meow!");
    }
}




public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        dog.sleep();
        cat.sound();
        cat.sleep();

        }
    }
