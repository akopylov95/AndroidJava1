import java.sql.SQLOutput;

public class Employee {
    String fio;
    String position;
    String email;
    String phone;
    Integer salaries;
    Integer age;

    public Employee(String _fio, String _position, String _email, String _phone, Integer _salaries, Integer _age) {
        fio = _fio;
        position = _position;
        email = _email;
        phone = _phone;
        salaries = _salaries;
        age = _age;
    }

    public void run(){
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Размер заработной платы: " + salaries);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
