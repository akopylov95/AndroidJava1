public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Собака");
    }

    @Override
    public void run(float ogr, float length) {
        super.run(ogr, length);
    }

    @Override
    public void swim(float ogr, float slen) {
        super.swim(ogr, slen);
    }

    @Override
    public void jump(float ogr, float height) {
        super.jump(ogr, height);
    }
}
