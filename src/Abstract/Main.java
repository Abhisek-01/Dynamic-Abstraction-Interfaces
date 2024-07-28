package Abstract;

abstract class Animal {

    void animal(){
        System.out.println("Which type of animal..");
    }
    abstract void eat();
    abstract void walk();
    abstract void run();
    abstract void sound();
//    void dog(){
//        System.out.println("A animal can be a dog...");
//    }
//    void Tiger(){
//        System.out.println("A animal can be a Tiget...");
//    }
}

class Cat extends Animal{
    @Override
    void animal() {
        super.animal();
    }

    @Override
    void eat() {
        System.out.println("Cat is eating Fish");
    }

    @Override
    void walk() {
        System.out.println("Cat is walking in style");
    }

    @Override
    void run() {
        System.out.println("Cat is running little faster");
    }

    @Override
    void sound() {
        System.out.println("Cat sound like meaoo....n ");
    }
}

class Tiger extends Animal{
    @Override
    void animal() {
        super.animal();
    }

    @Override
    void eat() {
        System.out.println("Tiger is eating Nonveg ");
    }

    @Override
    void walk() {
        System.out.println("Tiger is walking like smother and shine");
    }

    @Override
    void run() {
        System.out.println("Tiger is running faster");
    }

    @Override
    void sound() {
        System.out.println("Cat sound like Ghrowo..n ");
    }
}

public class Main{
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        cat.eat();
        cat.walk();
        cat.run();
        cat.sound();
        System.out.println();
        tiger.eat();
        tiger.walk();
        tiger.run();
        tiger.sound();
    }
}
