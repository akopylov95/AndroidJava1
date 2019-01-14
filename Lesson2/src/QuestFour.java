import java.util.Scanner;

public class QuestFour {
    public static void run(){
        Scanner con = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int n = con.nextInt();

        int mas[][] = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mas[i][j] + ",");
            }
            System.out.println();
        }
    }
}
