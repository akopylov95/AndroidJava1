public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Кошка");
    }

    @Override
    public void run(float ogr, float length) {
        super.run(ogr, length);
    }

    @Override
    public void swim(float ogr, float slen) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void jump(float ogr, float height) {
        super.jump(ogr, height);
    }
}