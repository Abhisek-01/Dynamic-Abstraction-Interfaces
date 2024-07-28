package Interface;

public interface Interfaces {
    void eat();
    void walkable();
}
interface swim{
    void swiming();
}
class Dog implements Interfaces, swim{

    @Override
    public void eat() {
        System.out.println("The dog is eating chicken. ");
    }

    @Override
    public void walkable() {
        System.out.println("The dog is walking on street ");
    }

    @Override
    public void swiming() {
        System.out.println("The dog is swim on pond.");
    }
}

    class main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();
            dog.walkable();
            dog.swiming();
        }
    }