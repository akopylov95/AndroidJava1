public class QuestThree {
    public static void run(){
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] *= 2;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ",");
        }
    }
}
