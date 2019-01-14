import java.util.Scanner;

public class QuestTwo {
    public static void run(){
        Scanner con = new Scanner(System.in);

        int[] mas = new int[8];

        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            mas[i] = con.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ",");
        }

    }
}
