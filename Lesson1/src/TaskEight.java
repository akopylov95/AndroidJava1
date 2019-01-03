public class TaskEight {
    public static void main(String[] args) {

        boolean year = exp(104);

        if (year == true){
            System.out.println("Год високосный!");
        } else if(year == false){
            System.out.println("Год НЕ високосный!");
        }

    }

    public static boolean exp(float a){

        float i = (a / 400) * 100;
        boolean s;

        if (((i % 1 == 0) && (a % 100 != 0)) || (a == 400)) {
            s = true;
        } else {
            s = false;
        }

        return (s);

    }
}
