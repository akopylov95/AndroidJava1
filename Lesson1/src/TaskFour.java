public class TaskFour {
    public static void main(String[] args) {
        boolean itog = exp(10, 5);

        if (itog == true){
            System.out.println("Сумма чисел лежит в пределах от 10 до 20!");
        } else {
            System.out.println("Сумма чисел НЕ лежит в пределах от 10 до 20!");
        }

    }

    public static boolean exp(float a, float b){

        float i = a + b;
        boolean s;

        if (i > 10 && i < 20) {
            s = true;
        } else {
            s = false;
        }

        return (s);

    }
}
