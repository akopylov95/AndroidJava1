abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(name);
    }

    public void run(float ogr, float length){
        if (length > ogr){
            System.out.println("Run: false");
        } else {
            System.out.println("Run: true");
        }
    };

    public void swim(float ogr, float slen){
        if (slen > ogr){
            System.out.println("Swim: false");
        } else {
            System.out.println("Swim: true");
        }
    };

    public void jump(float ogr, float height){
        if (height > ogr){
            System.out.println("Jump: false");
        } else {
            System.out.println("Jump: true");
        }
    };

}