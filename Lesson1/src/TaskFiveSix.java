public class TaskFiveSix {                         //реализовано 5 и 6 задание
    public static void main(String[] args) {

        boolean num = exp(-2);

        if (num == false){
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }

    }

    public static boolean exp(float a){

        boolean s;

        if (a < 0) {
            s = true;       //реализация 6 задания
        } else {
            s = false;
        }

        return (s);

    }
}
