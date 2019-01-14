public class QuestOne {
    public static void run(){
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                mas[i] = 1;
            } else {
                mas[i] = 0;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ",");
        }
        System.out.println("");
    }
}
