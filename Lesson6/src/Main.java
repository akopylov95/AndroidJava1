public class Main {

    public static void main(String[] args) {

        boolean serf;

        Cat cat1 = new Cat("Машка");
        cat1.info();
        cat1.run(150, 150);

        cat1.swim(150, 150);

        Dog dog1 = new Dog("Бобик");
        dog1.info();
        dog1.swim(150, 160);



    }
}
