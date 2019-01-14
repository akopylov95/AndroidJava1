import java.util.Scanner;

public class QuestFive {
    public static void run(){
        Scanner con = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");

        int r = con.nextInt();
        int[] mas = new int[r];

        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            mas[i] = con.nextInt();
        }

        int max = mas[0], min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max){
                max = mas[i];
            } else if(mas[i] < min){
                min = mas[i];
            }
        }

        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
