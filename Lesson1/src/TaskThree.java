public class TaskThree {
    public static void main(String[] args) {
        float itog = exp(4, 2, 8, 2);
        System.out.printf("%.3f", itog);
    }

    public static float exp(float a, float b, float c, float d){
        float i = a * (b + (c / d));
        return (i);
    }
}
