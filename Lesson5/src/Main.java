public class Main {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Копылов Александр Романович", "Инженер", "fio@ya.ru", "89036548594", 30000, 23);
        empArray[1] = new Employee("Большакова Нелли Викторовна","Журналист","bolsh@ya.ru","+7984569823", 35000, 19);
        empArray[2] = new Employee("Мальцев Алексей Дмитриевич","Уборщик","malclean@ya.ru","+79635846981", 15000, 45);
        empArray[3] = new Employee("Ципель Юрий Николаевич","Руководитель","CiHea@ya.ru","8963584691", 50000, 51);
        empArray[4] = new Employee("Доминикин Александр Александрович","Бухгалтер","DomAcc@ya.ru","89741851312", 25000, 20);

        for (int i = 0; i < 5; i++) {
            if(empArray[i].age >= 40){
                empArray[i].run();
            }
        }
    }
}
