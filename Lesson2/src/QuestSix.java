public class QuestSix {
    public static boolean checkBalance(int[] mas){
        boolean res;

        int n = 0, s1 = 0, s2 = 0;               //n - длинна половины массива, s1/s2 - суммы левой/правой половины массива

        if(mas.length % 2 > 0){
            n = (mas.length / 2) + 1;
        } else {
            n = mas.length / 2;
        }

        for (int i = 0; i < mas.length; i++) {
            if(i < n){
                s1 += mas[i];
            } else {
                s2 += mas[i];
            }
        }

        if(s1 == s2){
            res = true;
        } else {
            res = false;
        }

        return (res);
    }
}
